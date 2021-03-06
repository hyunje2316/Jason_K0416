package color;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyPanel extends JPanel implements ActionListener{
	JButton button;
	Color color = new Color(0, 0, 0);
	
	public MyPanel() {
		setLayout(new BorderLayout());
		button = new JButton("���� ����");
		button.addActionListener(this);
		add(button, BorderLayout.SOUTH);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
		g.fillRect(10,  10, 500, 500);
	}
	
	public void actionPerformed(ActionEvent e) {
		color = new Color((int)(Math.random() * 255.0), (int)(Math.random() * 255.0), (int)(Math.random() * 255.0));
		repaint();
	}
}

public class ColorTest  extends JFrame{
	public ColorTest() {
		setSize(700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Color Test");
		setVisible(true);
		JPanel panel = new MyPanel();
		add(panel);
	}
	
	public static void main(String args[]) {
		ColorTest s = new ColorTest();
	}
}
