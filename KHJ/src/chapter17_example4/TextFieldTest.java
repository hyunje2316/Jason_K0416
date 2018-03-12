package chapter17_example4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyFrame extends JFrame{
	private JButton button;
	private JTextField text, result;
	
	public MyFrame() {
		setSize(300, 200);
		setTitle("���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ButtonListener listener = new ButtonListener();
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("���� �Է� : "));
		text = new JTextField(15);
		text.addActionListener(listener);
		panel.add(text);
		
		panel.add(new JLabel("������ �� : "));
		result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		button = new JButton("OK");
		button.addActionListener(listener);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button || e.getSource() == text) {
				String name = text.getText();
				int value = Integer.parseInt(name);
				result.setText(" " + value * value);
				text.requestFocus();
			}
		}
	}
}

public class TextFieldTest {
	public static void main(String args[]) {
		MyFrame m = new MyFrame();
	}
}
