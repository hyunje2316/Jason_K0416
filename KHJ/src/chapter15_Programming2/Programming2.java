package chapter15_Programming2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyPanel extends JPanel{
	Font f1;
	String str = "Hello World!";
	
	public MyPanel() {
		int num = (int)(Math.random() * 3.0);
		System.out.println(num);
		switch(num) {
		case 0:
			f1 = new Font("Times", Font.BOLD, 15);
			break;
			
		case 1:
			f1 = new Font("Serif", Font.ITALIC, 25);
			break;
			
		case 2:
			f1 = new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30);
			break;
			
		default:
			f1 = new Font("Courier", Font.PLAIN, 10);
			break;
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(f1);
		g.drawString(str, 10, 10);
		g.setFont(f1);
		g.drawString(str, 10, 50);
		g.setFont(f1);
		g.drawString(str, 10, 100);
		g.setFont(f1);
		g.drawString(str, 10, 150);
		g.setFont(f1);
		g.drawString(str, 10, 200);
	}
	
}

public class Programming2 extends JFrame{
	public Programming2() {
		setSize(500, 500);
		setTitle("¹®Á¦2¹ø");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JPanel panel = new MyPanel();
		add(panel);
	}
	
	public static void main(String args[]) {
		Programming2 p = new Programming2();
	}
}
