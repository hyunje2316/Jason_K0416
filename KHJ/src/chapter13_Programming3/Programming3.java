package chapter13_Programming3;

import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame() {
		setSize(500, 500);
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel label = new JLabel("�ڹ� ȣ�ڿ� ���� ���� ȯ���մϴ�.");
		JLabel label2 = new JLabel("	�����ϼ��� �Է��ϼ���.");
		
		JButton button = new JButton("1��");
		JButton button2 = new JButton("2��");
		JButton button3 = new JButton("3��");
		JButton button4 = new JButton("4��");
		JButton button5 = new JButton("5��");
		
		add(panel);
		panel.add(panelA);
		panel.add(panelB);
		
		panelA.add(label);
		panelA.add(label2);
		
		panelB.add(button);
		panelB.add(button2);
		panelB.add(button3);
		panelB.add(button4);
		panelB.add(button5, BorderLayout.SOUTH);
		

		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Programming3 {
	public static void main(String args[]) {
		MyFrame frame = new MyFrame();
	}
}
