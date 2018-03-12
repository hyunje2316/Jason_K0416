package chapter14_Programming2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyFrame extends JFrame implements ActionListener{
	JTextField text;
	JTextField text2;
	JTextField text3;
	double payment;
	public MyFrame() {
		setSize(300, 200);
		setTitle("이자 계산기");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		JPanel panelC = new JPanel();
		JPanel panelD = new JPanel();
		
		JLabel label = new JLabel("원금을 입력하시오.");
		JLabel label2 = new JLabel("이율을 입력하시오.");
		text = new JTextField(5);
		text2 = new JTextField(4);
		text3 = new JTextField(25);
		JButton button = new JButton("변환");
		text3.setEditable(false);
		button.addActionListener(this);
		
		add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panelA.add(label);
		panelA.add(text);
		panelB.add(label2);
		panelB.add(text2);
		panelC.add(button);
		panelD.add(text3);
		
		panel.add(panelA);
		panel.add(panelB);
		panel.add(panelC);
		panel.add(panelD);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		payment = Integer.parseInt(text.getText()) * Double.parseDouble(text2.getText()) / 100;
		text3.setText((int)payment + "");
	}
}

public class Programming2 {
	public static void main(String args[]) {
		MyFrame frame = new MyFrame();
	}
}
