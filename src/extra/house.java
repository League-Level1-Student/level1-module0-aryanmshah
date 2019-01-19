package extra;

import java.awt.Color;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

import org.jointheleague.graphical.robot.Robot;

public class house {
public static void main(String[] args) {
	ponton.setWindowColor(0,0,0);
	ponton.moveTo(30,500);
	ponton.penDown();
	ponton.setPenWidth(1);
	ponton.setSpeed(90);
	ponton.setPenColor(0,255,0);
	ponton.turn(90);
	home("large","Blue");
	home("medium","red");
	home("medium","blue");
	flatroof(2);
	flatroof(2);
	home("small","Blue");
	
}	
static Robot ponton= new Robot();

	static void home (String hieght, String color) {
		int size=0;
		int paint=0;
		if (hieght.equals("small")){
			 size=60;
			
		}
		if (hieght.equals("medium")) {
			size=120;
		}
		
		if (hieght.equals("large")) {
			if (color.equals("Blue")){
				ponton.setPenColor(0,0,255);
				
			}
			ponton.turn(-90);
			ponton.move(250);
			ponton.turn(40);
			ponton.move(20);
			ponton.turn(100);
			ponton.move(20);
			ponton.turn(40);
			ponton.move(250);
			ponton.turn(-90);
			ponton.setPenColor(0,255,0);
			ponton.move(50);
		}
		
		ponton.move(20);
		ponton.setPenColor(0,0,0);
		if (color.equals("Blue")){
			ponton.setPenColor(0,0,255);
			
		}
		if (color.equals("red")){
			ponton.setPenColor(255,0,0);
			
		}
		ponton.turn(-90);
		ponton.move(size);
		ponton.turn(90);
		ponton.move(20);
		ponton.turn(90);
		ponton.move(size);
		ponton.setPenColor(0,255,0);
		ponton.turn(-90);
		ponton.move(50);
	
	}
	
	static void flatroof(int d) {
		
		home("large","red");
	}
	
	static void drawpointyroof(int c) {
		ponton.setPenColor(123,155,3);
		ponton.turn(-90);
		ponton.move(90);
		ponton.turn(40);
		ponton.move(20);
		ponton.turn(100);
		ponton.move(20);
		ponton.turn(40);
		ponton.setPenColor(0,255,0);
	
		
		ponton.move(90);
		ponton.turn(-90);
		ponton.move(20);
		
	}
	

}
