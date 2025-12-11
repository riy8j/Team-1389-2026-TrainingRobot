package frc.subsystems;

import com.ctre.phoenix6.controls.VoltageOut;
import com.ctre.phoenix6.hardware.TalconFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class ElevatorSubsystem extends SubsystemBase{
    private TalconFX ElevatorMotor1 = new TalconFX(RobotMap.ElevatorCanID1);
    private TalconFX ElevatorMotor2 = new TalconFX(RobotMap.ElevatorCanID2);

    public ElevatorSubsystem() {
        ElevatorMotor = new SparkFlex(RobotMap.MotorPorts.climberMotor, MotorType.kBrushless);
    }

    public void setSpeed(double ElevatorSpeed){
        ElevatorMotor1.setControl(new VoltageOut(ElevatorSpeed));
        ElevatorMotor2.setControl(new VoltageOut(-ElevatorSpeed));
    }
    public void stop(){
        ElevatorMotor1.setControl(new VoltageOut(0));
        ElevatorMotor2.setControl(new VoltageOut(0));
    }
}