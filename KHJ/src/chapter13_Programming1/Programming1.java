package chapter13_Programming1;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

class MyFrame extends JFrame{
	public MyFrame() {
		setSize(500, 500);
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		JLabel label = new JLabel("자바는 재미있나요?");
		JButton button = new JButton("Yes");
		JButton button2 = new JButton("No");
		
		this.setTitle("프밍1");
		add(panel);
		panel.add(panelA);
		panel.add(panelB);
		
		panelA.add(label);
		panelB.add(button);
		panelB.add(button2);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Programming1 {
	public static void main(String args[]) {
		MyFrame frame = new MyFrame();
	}
}
