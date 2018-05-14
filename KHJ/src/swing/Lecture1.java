package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyFrame extends JFrame implements ActionListener{
	public ButtonPanel bp;
	public TextPanel tp;
	
	public MyFrame() {
		bp = new ButtonPanel();
		tp = new TextPanel();
		
		setTitle("���ǳ���");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(bp, BorderLayout.SOUTH);
		add(tp, BorderLayout.CENTER);
		
		bp.button.addActionListener(this);
		bp.button2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bp.button) {
			tp.text.setText("�⼮�Ϸ�");
		}	
		if(e.getSource() == bp.button2) {
			System.exit(0);
		}
	}
	
}

class ButtonPanel extends JPanel{
	public JButton button;
	public JButton button2;
	
	public ButtonPanel() {
		button = new JButton("Ȯ��");
		button2 = new JButton("���");
		
		add(button);
		add(button2);
	}
}

class TextPanel extends JPanel{
	public JTextField text;
	
	public TextPanel() {
		text = new JTextField(10);
		text.setEditable(false);
		add(text);
	}
}

public class Lecture1 {
	public static void main(String args[]) {
		MyFrame f = new MyFrame();
	}
}
