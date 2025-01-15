package frc.robot;

import edu.wpi.first.wpilibj.LEDPattern;
import edu.wpi.first.wpilibj.util.Color;

public final class Constants {
    public static final class Swerve {
        public static final double WHEELBASE = 0.58; // Wheelbase distance in meters
        public static final double TRACKWIDTH = 0.58; // Trackwidth distance in meters
        public static final double MAX_SPEED_METERS_PER_SECOND = 3.0; // Maximum speed of the robot in m/s
        public static final double DRIVE_ENCODER_POSITION_CONVERSION = 0.0001; // TODO: Verify conversion factor for encoder position
        public static final double DRIVE_ENCODER_VELOCITY_CONVERSION = 0.0001; // TODO: Verify conversion factor for encoder velocity

        // Motor configuration
        public static final Object TALON_CONFIG = null; // TODO: Add TalonFX configuration object
        public static final Object CANCODER_CONFIG = null; // TODO: Add CANCoder configuration object

        // PID Controller Constants
        public static final double TRANSLATION_PID = 1.0; // TODO: Tune PID values
        public static final double ROTATION_PID = 1.0; // TODO: Tune PID values

        // Module Offsets (in degrees)
        public static final double FRONT_LEFT_MODULE_DRIVE_OFFSET = 0.0;  
        public static final double FRONT_LEFT_MODULE_STEER_OFFSET = 0.0;  
        public static final double FRONT_RIGHT_MODULE_DRIVE_OFFSET = 0.0;  
        public static final double FRONT_RIGHT_MODULE_STEER_OFFSET = 0.0;  
        public static final double BACK_LEFT_MODULE_DRIVE_OFFSET = 0.0;  
        public static final double BACK_LEFT_MODULE_STEER_OFFSET = 0.0;  
        public static final double BACK_RIGHT_MODULE_DRIVE_OFFSET = 0.0;  
        public static final double BACK_RIGHT_MODULE_STEER_OFFSET = 0.0;  
    }

    public static final class SwervePorts {
        // Drive motor
        public static final int FRONT_LEFT_DRIVE_MOTOR = 1;    
        public static final int FRONT_RIGHT_DRIVE_MOTOR = 2;    
        public static final int BACK_LEFT_DRIVE_MOTOR = 3;    
        public static final int BACK_RIGHT_DRIVE_MOTOR = 4;    

        // Steer motor
        public static final int FRONT_LEFT_STEER_MOTOR = 5;    
        public static final int FRONT_RIGHT_STEER_MOTOR = 6;    
        public static final int BACK_LEFT_STEER_MOTOR = 7;    
        public static final int BACK_RIGHT_STEER_MOTOR = 8;    

        // CANCoder
        public static final int FRONT_LEFT_CANCODER = 9;    
        public static final int FRONT_RIGHT_CANCODER = 10;    
        public static final int BACK_LEFT_CANCODER = 11;    
        public static final int BACK_RIGHT_CANCODER = 12;    
    }

    public static final class LedSubsystem{
        public static final int LED_PWM_PORT = 0;
        public static final int LED_LENGTH = 60; //Default
        public static final LEDPattern RED_ALLIANCE_COLOR = LEDPattern.solid(Color.kRed);
        public static final LEDPattern BLUE_ALLIANCE_COLOR = LEDPattern.solid(Color.kBlue);
        public static final LEDPattern ELEVATOR_PROCESS_COLOR = LEDPattern.solid(Color.kPurple);
        public static final LEDPattern TARGET_FOCUS_COLOR = LEDPattern.solid(Color.kGreen);
        public static final LEDPattern INTAKE_COLOR = LEDPattern.solid(Color.kYellow);
        public static final LEDPattern BREATHE_COLOR = LEDPattern.solid(Color.kWhite);
    }

    public static final class Elevator{
        //TODO Encoder Values Wİll Be Updated
        public static final double ELEVATOR_START_VALUE = 0; //Generally True
        public static final double ELEVATOR_END_VALUE = 450;
        public static final double ELEVATOR_REEFSCAPE_VALUE = 200;
        public static final double ELEVATOR_L1_VALUE = 250;
        public static final double ELEVATOR_L2_VALUE = 300;
        public static final double ELEVATOR_L3_VALUE = 350;
        public static final int ELEVATOR_LEADER_MOTOR_PORT = 0;
        public static final int ELEVATOR_FOLLOWER_MOTOR_PORT = 1;

    }

    public static final class OI {
        public static final int DRIVER_CONTROLLER_PORT = 0;
        public static double ELEVATOR_SPEED = 0.5;
        public static boolean IS_TEST = false;
        public static boolean IS_PROCESSING = false;
        public static boolean IS_PID_ENDED = false;
        public static boolean IS_SWERVE_FOCUSED = false;
    }
}
