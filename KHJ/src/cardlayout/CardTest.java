package cardlayout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyFrame extends JFrame implements ActionListener{
	JPanel panel;
	Cards card;
	
	public MyFrame() {
		setTitle("CardLayout Test");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel(new GridLayout(0, 5, 10, 0));
		addButton("<<", panel);
		addButton("<", panel);
		addButton(">", panel);
		addButton(">>", panel);
		addButton("종료", panel);
		add(panel, "North");
		card = new Cards();
		add(card, "Center");
		setVisible(true);
	}
	
	void addButton(String str, Container target) {
		JButton button = new JButton(str);
		button.addActionListener(this);
		target.add(button);
	}
	
	private class Cards extends JPanel{
		CardLayout layout;
		
		public Cards() {
			layout = new CardLayout();
			setLayout(layout);
			
			for (int i = 1; i <= 10; i++) {
				add(new JButton("현재 카드의 번호는 " + i + "입니다."), "Center");
			}
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("종료")) {
			System.exit(0);
		} else if(e.getActionCommand().equals("<<")) {
			card.layout.first(card);
		} else if (e.getActionCommand().equals("<")) {
			card.layout.previous(card);
		} else if (e.getActionCommand().equals(">")) {
			card.layout.next(card);
		} else if (e.getActionCommand().equals(">>")) {
			card.layout.last(card);
		}
	}
}

public class CardTest {
	public static void main(String args[]) {
		MyFrame frame = new MyFrame();
	}
}
