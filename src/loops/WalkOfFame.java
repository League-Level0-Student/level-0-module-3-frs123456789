
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot c3po = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		c3po.setX(50);
		
		// You also need to show the robot to see the result of this line.
		
		
		for(int i=0; i<6 + 1; i++) {
c3po.penDown();
c3po.setPenWidth(30);
c3po.setSpeed(25);
c3po.move(100);
c3po.turn(144);
c3po.move(100);
c3po.turn(144);
c3po.move(100);
c3po.turn(144);
c3po.move(100);
c3po.turn(144);
c3po.move(100);
c3po.turn(144);
c3po.turn(90);
c3po.penUp();
c3po.move(115);
c3po.turn(270);
		}
		// 2. Make the robot draw a star shape. Hint: 144.

		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
