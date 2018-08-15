package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot blu = new Robot();
		Robot yel = new Robot();
		Robot bla = new Robot();
		Robot gre = new Robot();
		Robot red = new Robot();
		
		Thread r1 = new Thread(()->dr(blu,Color.BLUE,100,450));
		Thread r2 = new Thread(()->dr(yel,Color.YELLOW,175,500));
		Thread r3 = new Thread(()->dr(bla,Color.BLACK,250,450));
		Thread r4 = new Thread(()->dr(gre,Color.GREEN,325,500));
		Thread r5 = new Thread(()->dr(red,Color.RED,400,450));
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		
	}

	private static void dr(Robot w, Color c, int x, int y) {
		hi(w);
		sp(w);
		w.setPenWidth(10);
		w.penDown();
		w.setX(x);
		w.setY(y);
		w.setPenColor(c);
		for(int i = 0; i <360; i++) {
			w.move(1);
			w.turn(1);
		}
	}

	private static void hi(Robot z) {
		z.hide();
	}

	private static void sp(Robot x) {
		x.setSpeed(10);
	}
}

