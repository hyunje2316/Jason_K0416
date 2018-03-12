package chapter16_example2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

class MyFrame extends JFrame{
	private JButton button1;
	private JButton button2;
	private JPanel panel;
	MyListener listener = new MyListener();
	
	public MyFrame() {
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이벤트 예제");
		panel = new JPanel();
		button1 = new JButton("노란색");
		button1.addActionListener(listener);
		panel.add(button1);
		button2 = new JButton("핑크색");
		button2.addActionListener(listener);
		panel.add(button2);
		add(panel);
		setVisible(true);
	}
	
	private class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1)
				panel.setBackground(Color.YELLOW);
			else if (e.getSource() == button2)
				panel.setBackground(Color.PINK);
		}
	}
}

public class ActionEventTest4 {
	public static void main(String args[]) {
		MyFrame f = new MyFrame();
	}

}
