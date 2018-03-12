package chapter15_Programming;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyPanel extends JPanel implements ActionListener{
	JButton button;
	Color color = new Color(0, 0, 0);
	String str = "Hello World!";
	Font f1 = new Font("Courier", Font.PLAIN ,20);
	
	public MyPanel() {
		setLayout(new BorderLayout());
		button = new JButton("색상 변경");
		button.addActionListener(this);
		add(button, BorderLayout.SOUTH);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
		g.setFont(f1);
		g.drawString(str, 40, 40);
	}
	
	public void actionPerformed(ActionEvent e) {
		color = new Color((int)(Math.random() * 255.0), (int)(Math.random() * 255.0), (int)(Math.random() * 255.0));
		repaint();
	}
}

public class Programming1 extends JFrame{
	public Programming1() {
		setSize(400, 400);
		setTitle("글자 색상 변경");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JPanel panel = new MyPanel();
		add(panel);
	}
	
	public static void main(String args[]) {
		Programming1 p = new Programming1();
	}
}
