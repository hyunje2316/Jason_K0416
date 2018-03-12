package chapter15_Programming4;

import java.awt.*;
import javax.swing.*;

class MyPanel extends JPanel{
	int[] xPoint = {100, 300, 300, 500, 100, 500};
	int[] yPoint = {200, 50, 50, 200, 200, 200};
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillPolygon(xPoint, yPoint, 6);
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(150, 200, 300, 300);
		g.setColor(Color.CYAN);
		g.fillRect(350, 240, 80, 80);
		g.setColor(Color.GREEN);
		g.fillRect(260, 380, 80, 120);
		g.setColor(Color.RED);
		g.fillOval(265, 430, 20, 20);
	}
}

public class Programming4 extends JFrame{
	public Programming4() {
		setSize(700, 700);
		setTitle("The House");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JPanel panel = new MyPanel();
		add(panel);
	}
	
	public static void main(String args[]) {
		Programming4 p = new Programming4();
	}
}
