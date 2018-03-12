package chapter15_Programming3;

import java.awt.*;
import javax.swing.*;

class Circle{
	private int x;
	private int y;
	private int radius;
	Color c;
	
	public Circle(int x, int y, int radius, Color c) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.c = c;
	}
	
	public int getX() {return x;}
	public void setX(int x) {this.x = x;}
	public int getY() {return y;}
	public void setY(int y) {this.y = y;}
	public int getRadius() {return radius;}
	public void setRadius(int radius) {this.radius = radius;}
	public Color getColor() {return c;}
	public void setColor(Color c) {this.c = c;}
}

class MyPanel extends JPanel{
	Circle circle = new Circle(10, 10, 150, Color.BLACK);
	Circle circle2 = new Circle(250, 250, 100, Color.BLUE);
	Circle circle3 = new Circle(135, 135, 70, Color.green);
	Circle circle4 = new Circle(0, 0, 0, Color.BLACK);
	
	public MyPanel() {
		circle4.setX(30);
		circle4.setY(250);
		circle4.setRadius(200);
		circle4.setColor(Color.CYAN);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(circle.getColor());
		g.drawOval(circle.getX(), circle.getY(), circle.getRadius(), circle.getRadius());
		g.setColor(circle2.getColor());
		g.fillOval(circle2.getX(), circle2.getY(), circle2.getRadius(), circle2.getRadius());
		g.setColor(circle3.getColor());
		g.fillOval(circle3.getX(), circle3.getY(), circle3.getRadius(), circle3.getRadius());
		g.setColor(circle4.getColor());
		g.fillOval(circle4.getX(), circle4.getY(), circle4.getRadius(), circle4.getRadius());
	}
}

public class Programming3 extends JFrame{
	public Programming3() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JPanel panel = new MyPanel();
		add(panel);
	}

	public static void main(String args[]) {
		Programming3 p = new Programming3();
	}
}
