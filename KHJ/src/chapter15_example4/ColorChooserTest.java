package chapter15_example4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ColorChooserTest extends JFrame implements ChangeListener{
	protected JColorChooser color;
	public ColorChooserTest() {
		setTitle("색상 선택기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		color = new JColorChooser();
		color.getSelectionModel().addChangeListener(this);
		color.setBorder(BorderFactory.createTitledBorder("색상 선택"));
		
		JPanel panel = new JPanel();
		panel.add(color);
		add(panel);
		
		pack();
		this.setVisible(true);
	}
	
	public void stateChanged(ChangeEvent e) {
		Color newColor = color.getColor();
		System.out.println(newColor);
	}
	
	public static void main(String args[]) {
		new ColorChooserTest();
	}
}
