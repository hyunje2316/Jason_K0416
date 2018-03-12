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
		JOptionPane.showMessageDialog(null, "���� �Ҹ��� ������ �����ϼ���!");
		System.exit(0);
	}
}

class Counter implements ActionListener{
	int counter = 10;
	
	public void actionPerformed(ActionEvent event) {
		counter--;
		if (counter <= 0) {
			counter = 0;
			System.out.println("ī���Ͱ� ����Ǿ����ϴ�.");
			Toolkit.getDefaultToolkit().beep();
		} else {
			System.out.println("���� ī���� ���� " + counter + " �Դϴ�.");
		}
	}
}
