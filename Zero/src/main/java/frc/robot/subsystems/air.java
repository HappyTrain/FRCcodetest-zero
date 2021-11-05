package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import frc.robot.RobotMap;

public class air {
    private DoubleSolenoid air_A = new DoubleSolenoid(RobotMap.air_A_F , RobotMap.air_A_R);
}