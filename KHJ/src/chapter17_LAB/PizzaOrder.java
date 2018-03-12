package chapter17_LAB;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class WelcomePanel extends JPanel{
	private JLabel message;
	
	public WelcomePanel() {
		message = new JLabel("�ڹ� ���ڿ� ���Ű��� ȯ���մϴ�.");
		message.setForeground(Color.RED);
		add(message);
	}
}

class TypePanel extends JPanel{
	public JRadioButton combo, potato, bulgogi;
	
	public TypePanel() {
		setLayout(new GridLayout(3, 1));
		combo = new JRadioButton("�޺�", true);
		potato = new JRadioButton("��������");
		bulgogi = new JRadioButton("�Ұ��");
		ButtonGroup bg = new ButtonGroup();
		
		bg.add(combo);
		bg.add(potato);
		bg.add(bulgogi);
		setBorder(BorderFactory.createTitledBorder("����"));
		
		add(combo);
		add(potato);
		add(bulgogi);
	}
}

class ExtraPanel extends JPanel{
	public JRadioButton nonex, pimang, cheese, pepe, bacon;
	
	public ExtraPanel() {
		setLayout(new GridLayout(5, 1));
		nonex = new JRadioButton("����", true);
		pimang = new JRadioButton("�Ǹ�");
		cheese = new JRadioButton("ġ��");
		pepe = new JRadioButton("����δ�");
		bacon = new JRadioButton("������");
		ButtonGroup bg = new ButtonGroup();
		
		bg.add(nonex);
		bg.add(pimang);
		bg.add(cheese);
		bg.add(pepe);
		bg.add(bacon);
		setBorder(BorderFactory.createTitledBorder("�߰� ����"));
		add(nonex);
		add(pimang);
		add(cheese);
		add(pepe);
		add(bacon);
	}
}

class SizePanel extends JPanel{
	public JRadioButton small, medium, large;
	
	public SizePanel() {
		setLayout(new GridLayout(3, 1));
		small = new JRadioButton("Small", true);
		medium = new JRadioButton("Medium");
		large = new JRadioButton("Large");
		ButtonGroup bg = new ButtonGroup();
		
		bg.add(small);
		bg.add(medium);
		bg.add(large);
		setBorder(BorderFactory.createTitledBorder("������"));
		add(small);
		add(medium);
		add(large);
	}
}

class ButtonPanel extends JPanel{
	public JButton order, cancel;
	public JTextField price;
	
	public ButtonPanel() {
		order = new JButton("�ֹ�");
		cancel = new JButton("���");
		price = new JTextField(6);
		add(order);
		add(cancel);
		price.setEditable(false);
		add(price);	
	}
}

public class PizzaOrder extends JFrame implements ActionListener{
	int combop = 5000; int potatop = 6000; int bulgogip = 7000;
	int nonexp = 0; int pimangp = 500; int cheesep = 700; int pepep = 1000; int baconp = 2000;
	int smallp = 0; int mediump = 2000; int largep = 4000;
	int totalprice = 0;
	ButtonPanel b; WelcomePanel w; TypePanel t; ExtraPanel ex; SizePanel s;
	
	public PizzaOrder(){
		w = new WelcomePanel();
		t = new TypePanel();
		ex = new ExtraPanel();
		s = new SizePanel();
		b = new ButtonPanel();
		
		add(w, BorderLayout.NORTH);
		add(t, BorderLayout.WEST);
		add(ex, BorderLayout.CENTER);
		add(s, BorderLayout.EAST);
		add(b, BorderLayout.SOUTH);
		
		b.order.addActionListener(this);
		b.cancel.addActionListener(this);
		
		setSize(500, 300);
		setTitle("���� �ֹ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b.order) {
			totalprice = 0;
			
			if(t.combo.isSelected() == true) {
				totalprice += combop;
			}
			
			if(t.potato.isSelected() == true) {
				totalprice += potatop;
			}
			
			if(t.bulgogi.isSelected() == true) {
				totalprice += bulgogip;
			}
			
			if(ex.nonex.isSelected() == true) {
				totalprice += nonexp;
			}
			
			if(ex.pimang.isSelected() == true) {
				totalprice += pimangp;
			}
			
			if(ex.cheese.isSelected() == true) {
				totalprice += cheesep;
			}
			
			if(ex.pepe.isSelected() == true) {
				totalprice += pepep;
			}
			
			if(ex.bacon.isSelected() == true) {
				totalprice += baconp;
			}
			
			if(s.small.isSelected() == true) {
				totalprice += smallp;
			}
			
			if(s.medium.isSelected() == true) {
				totalprice += mediump;
			}
			
			if(s.large.isSelected() == true) {
				totalprice += largep;
			}
			
			b.price.setText(totalprice + "��");
			
		} else if(e.getSource() == b.cancel) {
			System.exit(0);
		}
	}
	
	public static void main(String args[]) {
		PizzaOrder p = new PizzaOrder();
	}
}
