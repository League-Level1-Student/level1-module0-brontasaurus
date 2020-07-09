package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot farquaad = new Robot();
	
	public void run() {
	farquaad.setWindowColor(Color.BLACK);
	farquaad.setX(50);
	farquaad.setY(500);
	farquaad.setSpeed(100);
	farquaad.setPenWidth(10);
	Random donke = new Random();
	int shrek;
    for (int i = 0; i < 10; i++) {
    	shrek = donke.nextInt(3);
    	if (shrek == 0) {
    		frathouse("small", Color.cyan);
    	}
    	else if (shrek==1) {
    		frathouse("medium", Color.GRAY);
    	}
    	else {
    		frathouse("large", Color.yellow);
    	}
	}
	
	
	}
	

	public void frathouse(String size, Color fiona) {
		int height;
		if (size.equals("small")) {
			height=100;
		}
		else if (size.equals("medium")){
			height=170;
		}
		else {
			height=250;
		}
		farquaad.setPenColor(fiona);
		farquaad.penDown();
		farquaad.move(height);
		if (size.equals("large")){
		    orinion();
		}
		else {
			duloc();
		}
			
		farquaad.move(height);
		farquaad.turn(-90);
		farquaad.setPenColor(0, 200, 0);
		farquaad.move(50);
		farquaad.turn(-90);
		
	}
	public void duloc() {
		
		farquaad.turn(45);
		farquaad.move(50);
		farquaad.turn(90);
		farquaad.move(50);
		farquaad.turn(45);
	}
	
	public void orinion() {
		farquaad.turn(90);
		farquaad.move(100);
		farquaad.turn(90);
	}
}
