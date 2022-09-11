package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];
		Thread[] threads = new Thread[5];
		int x = 100;
		int y = 500;
		Random rand = new Random();
		boolean race = true;
		
		for(int i = 0;i<robots.length;i++) {
			robots[i] = new Robot();
			robots[i].setX(x);
			robots[i].setY(y);
			x += 150;
			int a = i;
			
			threads[i] = new Thread(() -> {
				while(robots[a].getY() > 50) {
					int r = rand.nextInt(100);
					robots[a].setSpeed(2);
					robots[a].move(r);
				}
				System.exit(0);
			});
			
		}
		
		for(int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		
		
		
//		while(race == true) {	
//			for(int i = 0;i<robots.length;i++) {
//				int r = rand.nextInt(50);
//				robots[i].setSpeed(5);
//				robots[i].move(r);	
//				if(robots[i].getY()<=50) {
//					race = false;
//					robots[i].setSpeed(10);
//					robots[i].turn(360);
//				}
//			}
//		}
	}
}
