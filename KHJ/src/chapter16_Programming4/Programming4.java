package chapter16_Programming4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyPanel extends JPanel implements ActionListener{
	private int index = 0;
	JButton button1;
	JButton button2;
	
	public MyPanel() {
		setLayout(new BorderLayout());
		JPanel panelB = new JPanel();
		button1 = new JButton("왼쪽으로 이동");
		button2 = new JButton("오른쪽으로 이동");
		
		setBackground(Color.YELLOW);
		add(panelB, BorderLayout.SOUTH);
		panelB.add(button1);
		panelB.add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		
		if(index == 0)
			g.fillRect(340, 50, 20, 300);
		else if(index == 1)
			g.fillRect(390, 50, 20, 300);
		else if (index == 2)
			g.fillRect(440, 50, 20, 300);
		else if (index == 3)
			g.fillRect(490, 50, 20, 300);
		else if (index == -1)
			g.fillRect(290, 50, 20, 300);
		else if (index == -2)
			g.fillRect(240, 50, 20, 300);
		else if (index == -3)
			g.fillRect(190, 50, 20, 300);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			--index;
			if(index <= -4)
				index = 3;
		} else if (e.getSource() == button2){
			++index;
			if (index >= 4)
				index = -3;
		}
		repaint();
	}
}

public class Programming4 extends JFrame{
	public Programming4() {
		add(new MyPanel());
		setSize(700, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new Programming4();
	}
}
