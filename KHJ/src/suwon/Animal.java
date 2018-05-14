package suwon;

public class Animal {
	int weight = 0;
	String picture;
	
	void eat() {
		System.out.println("무언가를 먹습니다.");
	}
	
	void sleep() {
		System.out.println("어디서 잡니다.");
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
		System.out.println("어흥");
	}
	
	@Override
	void eat() {
		System.out.println("고기를 먹습니다.");
	}
	
}

class Eagle extends Animal{
	int wings;
	
	void fly() {
		
	}
}