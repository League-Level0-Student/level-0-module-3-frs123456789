//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		
		
		
	Robot c3po =new Robot ();
	
	for(int i=0; i<1000; i++){
		//3. Ask the user what color they would like the robot to draw
	String color = JOptionPane.showInputDialog(null, "What color would you like to have the robot draw in? Choose the color you would like... Red, Blue, Yellow, Green");
		//5. Use an if/else statement to set the pen color that the user requested
if(color.equals("Red")) {
c3po.setPenColor(255, 0, 0);
}
else if(color.equals("Blue")) {
c3po.setPenColor(0, 8, 255);
}
else if(color.equals("Yellow")) {
c3po.setPenColor(255, 250, 0);
}
else if(color.equals("Green")) {
c3po.setPenColor(4, 204, 20);
}

	
else { c3po.setRandomPenColor();
	

	
	}
        //6. If the user doesn’t enter anything, choose a random color
	
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		c3po.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
c3po.penDown();
c3po.setSpeed(15);
c3po.move(100);
c3po.turn(90);
c3po.move(100);
c3po.turn(90);
c3po.move(100);
c3po.turn(90);
c3po.move(100);
c3po.turn(90);
	}
}
}