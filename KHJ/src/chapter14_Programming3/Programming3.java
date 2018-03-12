package chapter14_Programming3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyFrame extends JFrame implements ActionListener{
	String[] str = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", "+/-", "=", "+"};
	JButton[] number = new JButton[16];
	JButton clear;
	JTextField text;
	String s = "";
	double result = 0;
	
	public MyFrame() {
		setSize(400, 300);
		setTitle("°è»ê±â");
		
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		JPanel panelC = new JPanel();
		
		text = new JTextField(15);
		clear = new JButton("C");
		clear.addActionListener(this);
		
		add(panel);
		panel.add(panelA);
		panel.add(panelB);
		panel.add(panelC);
		
		panelA.add(text);
		panelB.add(clear);
		
		for (int i = 0; i < str.length; i++) {
			panelC.add(number[i] = new JButton(str[i]));
			number[i].setSize(100, 100);
			number[i].addActionListener(this);
		}
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panelB.setLayout(new GridLayout(0, 4, 5, 5));
		panelC.setLayout(new GridLayout(0, 4, 5, 5));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == clear) {
			s = "";
			text.setText(s);
		} else if(e.getSource() == number[0]) {
			s += "7";
			text.setText(s);
		} else if (e.getSource() == number[1]) {
			s += "8";
			text.setText(s);
		} else if (e.getSource() == number[2]) {
			s +="9";
			text.setText(s);
		} else if (e.getSource() == number[3]) {
			s += "/";
			text.setText(s);
		} else if (e.getSource() == number[4]) {
			s += "4";
			text.setText(s);
		} else if (e.getSource() == number[5]) {
			s += "5";
			text.setText(s);
		} else if (e.getSource() == number[6]) {
			s += "6";
			text.setText(s);
		} else if (e.getSource() == number[7]) {
			s += "*";
			text.setText(s);
		} else if (e.getSource() == number[8]) {
			s += "1";
			text.setText(s);
		} else if (e.getSource() == number[9]) {
			s += "2";
			text.setText(s);
		} else if (e.getSource() == number[10]) {
			s += "3";
			text.setText(s);
		} else if (e.getSource() == number[11]) {
			s += "-";
			text.setText(s);
		} else if (e.getSource() == number[12]) {
			s += "0";
			text.setText(s);
		} else if (e.getSource() == number[13]) {
			s += "+/-";
			text.setText(s);
		} else if (e.getSource() == number[14]) {
			result = Double.parseDouble(s);
			text.setText(result + "");
		} else if (e.getSource() == number[15]) {
			s += "+";
			text.setText(s);
		} 
	}
}

public class Programming3 {
	public static void main(String args[]) {
		MyFrame frame = new MyFrame();
	}
}
