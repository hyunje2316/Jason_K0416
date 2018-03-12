package chapter16_Programming5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyPanel extends JPanel implements MouseListener{
	JLabel label;
	
	public MyPanel() {
		label = new JLabel("Don't cry before you are hurt.");
		add(label);
		label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 50));
		label.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent arg0) {}
			public void mousePressed(MouseEvent arg0) {}
			public void mouseReleased(MouseEvent arg0) {}
			public void mouseEntered(MouseEvent arg0) {
				label.setText("다치기도 전에 울지 마라.");
			}
			public void mouseExited(MouseEvent arg0) {
				label.setText("Don't cry before you are hurt.");
			}
		});
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

public class Programming5 extends JFrame{
	public Programming5() {
		add(new MyPanel());
		setSize(700, 300);
		setTitle("My Frame");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}
	
	public static void main(String args[]) {
		new Programming5();
	}
}
