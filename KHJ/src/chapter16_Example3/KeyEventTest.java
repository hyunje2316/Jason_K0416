package chapter16_Example3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyFrame extends JFrame implements KeyListener{
	
	public MyFrame() {
		setTitle("이벤트 예제");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField t = new JTextField(20);
		t.addKeyListener(this);
		
		add(t);
		setVisible(true);
	}
	
	public void keyTyped(KeyEvent e) {
		display(e, "KeyTyped");
	}
	
	public void keyPressed(KeyEvent e) {
		display(e, "KeyPressed");
	}
	
	public void keyReleased(KeyEvent e) {
		display(e, "KeyReleased");
	}
	
	protected void display(KeyEvent e, String s) {
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String modifiers = e.isAltDown() + " " + e.isControlDown() + " " + e.isShiftDown();
		System.out.println(s + " " + c + " " + keyCode + " " + modifiers);
	}
}

public class KeyEventTest {
	public static void main(String args[]) {
		MyFrame m = new MyFrame();
	}
}
