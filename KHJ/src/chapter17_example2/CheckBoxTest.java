package chapter17_example2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class CheckBoxTest extends JPanel implements ItemListener{
	JCheckBox[] buttons = new JCheckBox[3];
	String[] fruits = {"apple", "grape", "orange"};
	JLabel[] textLabel = new JLabel[3];
	
	public CheckBoxTest() {
		super(new GridLayout(0, 4));
		
		for (int i = 0; i < 3; i++) {
			buttons[i] = new JCheckBox(fruits[i]);
			buttons[i].addItemListener(this);
			textLabel[i] = new JLabel(fruits[i]);
		}
		
		JPanel checkPanel = new JPanel(new GridLayout(0, 1));
		for (int i = 0; i < 3; i++) {
			checkPanel.add(buttons[i]);
		}
		
		add(checkPanel);
		add(textLabel[0]);
		add(textLabel[1]);
		add(textLabel[2]);
	}
	
	public void itemStateChanged(ItemEvent e) {
		Object source = e.getItemSelectable();
		for (int i = 0; i< 3; i++) {
			if(source == buttons[i]) {
				if (e.getStateChange() == ItemEvent.DESELECTED)
					textLabel[i].setText(null);
				else
					textLabel[i].setText(fruits[i]);
			}
		}
	}
	
	public static void main(String args[]) {
		JFrame frame = new JFrame("CheckBoxTest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JComponent newContentPane = new CheckBoxTest();
		newContentPane.setOpaque(true);
		frame.setContentPane(newContentPane);
		frame.setSize(500, 200);
		frame.setVisible(true);
	}
}
