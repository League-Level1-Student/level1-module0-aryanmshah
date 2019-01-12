package extra;

import java.awt.Color;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

import org.jointheleague.graphical.robot.Robot;

public class house {
public static void main(String[] args) {
	ponton.moveTo(30,500);
	ponton.penDown();
	ponton.setPenWidth(5);
	ponton.setSpeed(90);
	ponton.setPenColor(0,255,0);
	ponton.turn(90);
	home("large");
	
	
}	
static Robot ponton= new Robot();

	static void home (String hieght) {
		int size=0;
		
		if (hieght.equals("small")){
			 size=60;
			
		}
		if (hieght.equals("medium'")) {
			size=120;
		}
		
		if (hieght.equals("large'")) {
			size=250;
		}
		
		ponton.move(20);
		ponton.setPenColor(0,0,0);
		ponton.turn(-90);
		ponton.move(size);
		ponton.turn(90);
		ponton.move(20);
		ponton.turn(90);
		ponton.move(size);
		ponton.setPenColor(0,255,0);
		ponton.turn(-90);
		ponton.move(20);
	}

}
