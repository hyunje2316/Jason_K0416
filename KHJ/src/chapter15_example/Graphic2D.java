package chapter15_example;

import java.awt.*;
import javax.swing.*;

class MyPanel extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("안녕하세요? 자바 프로그래머 여러분 !", 10, 10);
		g.drawLine(10, 20, 110, 20);
		g.drawRect(10, 30, 100, 100);
	}
}

public class Graphic2D extends JFrame{
	public Graphic2D() {
		setTitle("Graphic2D");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel p = new MyPanel();
		setVisible(true);
		add(p);
	}
	
	public static void main(String args[]) {
		Graphic2D g = new Graphic2D();
	}
}
