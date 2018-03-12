package chapter13_Programming2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyFrame extends JFrame{
	public MyFrame() {
		setSize(500, 500);
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		JPanel panelC = new JPanel();
		
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		
		add(panel);
		panel.add(panelA);
		panel.add(panelB);
		panel.add(panelC);
		
		panelA.add(label1);
		panelB.add(label2);
		panelC.add(label3);
		
		label1.setText("인간에게 주어진 최상의 선물은 마음껏 웃을 수 있다는 것이다.");
		label2.setText("가능한 목표라고 하더라도 그것을 꿈꾸고 상상하는 순간 이미 거기에 다가가 있는 것이다.");
		label3.setText("상상력은 생존의 힘이다.");
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Programming2 {
	public static void main(String args[]) {
		MyFrame frame = new MyFrame();
	}
}
