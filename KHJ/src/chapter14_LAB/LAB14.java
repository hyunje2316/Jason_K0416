package chapter14_LAB;

import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame{
	public MyFrame() {
		setSize(500, 500);
		setTitle("Layout Test");
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 4));
		
		for (int i = 0; i < 10; i++) {
			panel.add(new JButton("Button" + i));
		}
		
		add(panel);
		
		setVisible(true);
	}
}

public class LAB14 {
	public static void main(String args[]) {
		MyFrame frame = new MyFrame();
	}
}
