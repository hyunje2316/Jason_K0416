package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyPanel extends JPanel implements ActionListener{
	JButton button;
	Color color = new Color(0, 0, 0);
	
	public MyPanel() {
		setLayout(new BorderLayout());
		button = new JButton("색상 변경");
		button.addActionListener(this);
		add(button, BorderLayout.SOUTH);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
		g.fillRect(10, 10, 400, 400);
	}
	
	public void actionPerformed(ActionEvent e) {
		color = new Color((int)(Math.random() * 255.0), (int)(Math.random() * 255.0), (int)(Math.random() * 255.0));
		repaint();
	}
}

public class GUI extends JFrame{
	public GUI() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI TEST");
		setVisible(true);
		JPanel panel = new MyPanel();
		add(panel);
	}
	
	public static void main(String args[]) {
		GUI g = new GUI();
	}

}
