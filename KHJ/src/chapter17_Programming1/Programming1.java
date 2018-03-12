package chapter17_Programming1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class InputNumberPanel extends JPanel{
	public JLabel guess;
	public JTextField input;
	
	public InputNumberPanel() {
		guess = new JLabel("���ڸ� �����Ͻÿ� : ");
		input = new JTextField(3);
		guess.setFont(new Font("Serif", Font.BOLD, 20));
		input.setFont(new Font("Serif", Font.BOLD, 20));
		
		add(guess);
		add(input);
	}
}

class AnswerPanel extends JPanel{
	public JLabel updown;
	
	public AnswerPanel() {
		updown = new JLabel();
		
		add(updown);
	}
}

class ButtonPanel extends JPanel{
	public JButton button1, button2;
	
	public ButtonPanel() {
		button1 = new JButton("�ٽ� �ѹ�");
		button2 = new JButton("����");
		
		add(button1);
		add(button2);
	}
}

public class Programming1 extends JFrame implements ActionListener{
	public InputNumberPanel i;
	public AnswerPanel a;
	public ButtonPanel b;
	int randomnum = 0;
	
	
	public Programming1() {	
		setSize(400, 200);
		setTitle("���ڰ���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		randomnum = (int)(Math.random() * 100.0);
		
		i = new InputNumberPanel();
		a = new AnswerPanel();
		b = new ButtonPanel();
		
		add(i, BorderLayout.NORTH);
		add(a, BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);
		
		b.button1.addActionListener(this);
		b.button2.addActionListener(this);
		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b.button1) {
			if(randomnum == Integer.parseInt(i.input.getText())) {
				a.updown.setForeground(Color.GREEN);
				a.updown.setFont(new Font("Dialog", Font.PLAIN, 20));
				a.updown.setText("������ϴ�.");
			}
			
			if(randomnum > Integer.parseInt(i.input.getText())) {
				a.updown.setForeground(Color.BLUE);
				a.updown.setFont(new Font("Dialog", Font.PLAIN, 20));
				a.updown.setText("�ʹ� �����ϴ�.");
			}
			
			if(randomnum < Integer.parseInt(i.input.getText())) {
				a.updown.setForeground(Color.RED);
				a.updown.setFont(new Font("Dialog", Font.PLAIN, 20));
				a.updown.setText("�ʹ� �����ϴ�.");
			}
			
			if(Integer.parseInt(i.input.getText()) > 100 || Integer.parseInt(i.input.getText()) < 0) {
				a.updown.setForeground(Color.BLACK);
				a.updown.setFont(new Font("Dialog", Font.PLAIN, 20));
				a.updown.setText("���� ���� ���ڸ� �Է��Ͽ����ϴ�.");
			}
			
		} else if(e.getSource() == b.button2) {
			System.exit(0);
		}
	}
	
	public static void main(String args[]) {
		Programming1 p = new Programming1();
	}
}
