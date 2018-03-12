package chapter14_Programming1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyFrame extends JFrame implements ActionListener{
	JTextField text1;
	JTextField text2;
	double convert = 0;
	public MyFrame() {
		setSize(600, 400);
		setTitle("Converter (Mile to KM)");
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		JPanel panelC = new JPanel();
		
		JLabel label = new JLabel("거리를 마일 단위로 입력하시오.");
		JButton button = new JButton("변환");
		text1 = new JTextField(10);
		text2 = new JTextField(20);
		
		text2.setEditable(false);
		button.addActionListener(this);
		
		add(panel);
		panel.setLayout(new BorderLayout());
		panel.add(panelA, BorderLayout.NORTH);
		panel.add(panelB, BorderLayout.CENTER);
		panel.add(panelC, BorderLayout.SOUTH);
		
		panelA.add(label);
		panelA.add(text1);
		panelB.add(button);
		panelC.add(text2);
		
		
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		convert = Integer.parseInt(text1.getText()) * 1.6;
		text2.setText(convert + "");
	}
}

public class Programming1 {
	public static void main(String args[]) {
		MyFrame frame = new MyFrame();
	}
}
