/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.BasicRobot.commands;

import edu.wpi.first.wpilibj.BasicRobot.RobotMap;
import edu.wpi.first.wpilibj.Servo;

/**
 *
 * @author OAmour
 */
public class MoveServo extends CommandBase {
   
    //public Servo Vservo = new Servo(RobotMap.servoVert);
    public MoveServo() {
        // Use requires() here to declare subsystem dependencies
        requires(axiscam);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
       axiscam.adjServo(oi.getServoVert(),oi.getServoHoriz());
       // Vservo.set((oi.jCam.getY()));
        //Vservo.setAngle(-1);
        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
