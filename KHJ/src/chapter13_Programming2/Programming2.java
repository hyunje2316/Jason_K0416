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
		
		label1.setText("�ΰ����� �־��� �ֻ��� ������ ������ ���� �� �ִٴ� ���̴�.");
		label2.setText("������ ��ǥ��� �ϴ��� �װ��� �޲ٰ� ����ϴ� ���� �̹� �ű⿡ �ٰ��� �ִ� ���̴�.");
		label3.setText("������ ������ ���̴�.");
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Programming2 {
	public static void main(String args[]) {
		MyFrame frame = new MyFrame();
	}
}
