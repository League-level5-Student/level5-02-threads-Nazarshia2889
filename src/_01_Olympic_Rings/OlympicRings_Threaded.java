package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot one = new Robot(10, 400);
		Robot two = new Robot(300, 400);
		Robot three = new Robot(590, 400);
		Robot four = new Robot(880, 400);
		
		one.setSpeed(10);
		two.setSpeed(10);
		three.setSpeed(10);
		four.setSpeed(10);
		
		Thread r1 = new Thread(() -> { 
			int angle = 0;
			one.penDown();
			for(int i = 0; i < 360; i++) {
				one.move(4);
				one.setAngle(angle + i);
			}
		});
		Thread r2 = new Thread(() -> { 
			int angle = 0;
			two.penDown();
			for(int i = 0; i < 360; i++) {
				two.move(4);
				two.setAngle(angle + i);
			}
		});
		Thread r3 = new Thread(() -> { 
			int angle = 0;
			three.penDown();
			for(int i = 0; i < 360; i++) {
				three.move(4);
				three.setAngle(angle + i);
			}
		});
		Thread r4 = new Thread(() -> { 
			int angle = 0;
			four.penDown();
			for(int i = 0; i < 360; i++) {
				four.move(4);
				four.setAngle(angle + i);
			}
		});
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
	}
	
}

