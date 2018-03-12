package chapter16_Example1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		button.setText("��ư�� ���������ϴ�.");
	}
}

class MyFrame extends JFrame{
	private JButton button;
	public MyFrame() {
		setSize(300, 200);
		setTitle("�̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		button = new JButton("��ư�� �����ÿ�.");
		button.addActionListener(new MyListener());
		add(button);
		
	}
}

public class ActionEventTest {
	public static void main(String args[]) {
		MyFrame f = new MyFrame();
	}
}
