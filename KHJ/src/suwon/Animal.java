package suwon;

public class Animal {
	int weight = 0;
	String picture;
	
	void eat() {
		System.out.println("���𰡸� �Խ��ϴ�.");
	}
	
	void sleep() {
		System.out.println("��� ��ϴ�.");
	}
	
	public static void main(String args[]) {
		Animal a = new Animal();
		Lion l = new Lion();
		a.eat();
		l.eat();
	}
}

class Lion extends Animal{
	int legs = 4;
	
	void roar() {
		System.out.println("����");
	}
	
	@Override
	void eat() {
		System.out.println("��⸦ �Խ��ϴ�.");
	}
	
}

class Eagle extends Animal{
	int wings;
	
	void fly() {
		
	}
}