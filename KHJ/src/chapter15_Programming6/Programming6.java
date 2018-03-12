package chapter15_Programming6;

import java.awt.*;
import javax.swing.*;

class MyPanel extends JPanel{
	Star s = new Star();
	Star s1 = new Star();
	Star s2 = new Star();
	public MyPanel() {
		s1.move(200, 100);
		s2.move(100, 500);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillPolygon(s.xPoint, s.yPoint, s.xPoint.length);
		g.fillPolygon(s1.xPoint, s1.yPoint, s1.xPoint.length);
		g.fillPolygon(s2.xPoint, s2.yPoint, s2.xPoint.length);
		g.fillArc(400, 200, 150, 150, -90, -180);
	}
}

public class Programming6 extends JFrame{
	public Programming6() {
		setSize(1000, 1000);
		setTitle("At Night");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JPanel panel = new MyPanel();
		add(panel);
	}
	
	public static void main(String args[]) {
		Programming6 p = new Programming6();
	}
}
