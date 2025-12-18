package main.java.frc.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap;

public class ShooterSubsystem extends SubsystemBase{
    private TalconFX UpperMotor = new TalconFX(RobotMap.UpperShooterCanID);
    private TalconFX LowerMotor = new TalconFX(RobotMap.LowerShooterCanID);

    public ShooterSubsystem() {
        UpperMotor = new TalconFX(RobotMap.UpperShooterPort);
        LowerMotor = new TalconFX(RobotMap.LowerShooterPort);
    }

    public void run(double shooterSpeed){
        UpperMotor.setControl(new VoltageOut(RobotMap.ShooterSpeed));
        LowerMotor.setControl(new VoltageOut(-RobotMap.ShooterSpeed));
    }
    public void stop(){
        UpperMotor.setControl(new VoltageOut(0));
        LowerMotor.setControl(new VoltageOut(0));
    }
}