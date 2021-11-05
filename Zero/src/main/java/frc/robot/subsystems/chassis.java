package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import frc.robot.RobotMap;

public class chassis {

private WPI_Victor MotorLeft_A = new WPI_VictorSPX(RobotMap.Chassis_Left_A);
private WPI_Victor MotroLeft_B = new WPI_VictorSPX(RobotMap.Chassis_Left_B);
private WPI_Victor MotorRight_A = new WPI_VictorSPX(RobotMap.Chassis_Right_A);
private WPI_Victor MotroRight_B = new WPI_VictorSPX(RobotMap.Chassis_Right_B);
    
private SpeedControllerGroup chassis_Left = new SpeedControllerGroup(MotorLeft_A , MotroLeft_B);
    
private SpeedControllerGroup chassis_Right = new SpeedControllerGroup(MotroRight_A , MotroRight_B);
private DifferentialDrive chassis = new DifferentialDrive(chassis_Left , chassis_Right);

}