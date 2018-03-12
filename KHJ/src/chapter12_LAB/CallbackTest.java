package chapter12_LAB;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class CallbackTest {
	public static void main(String args[]) {
		ActionListener listener = new Counter();
		Timer t = new Timer(1000, listener);
		t.start();
		JOptionPane.showMessageDialog(null, "비프 소리를 들으면 종료하세요!");
		System.exit(0);
	}
}

class Counter implements ActionListener{
	int counter = 10;
	
	public void actionPerformed(ActionEvent event) {
		counter--;
		if (counter <= 0) {
			counter = 0;
			System.out.println("카운터가 종료되었습니다.");
			Toolkit.getDefaultToolkit().beep();
		} else {
			System.out.println("현재 카운터 값은 " + counter + " 입니다.");
		}
	}
}
