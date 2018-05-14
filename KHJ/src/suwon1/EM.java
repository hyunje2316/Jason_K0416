package suwon1;

class Manager{
	private int bonus;
	
	public void test() {
		
	}
}

class Employee extends Manager{
	public String name;
	String address;
	protected int salary;
	private int rrn;
	
	@Override
	public void test() {
		super.test();
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class EM {
	public static void main() {
		Employee e = new Employee();
		Manager m = new Manager();
		
		e.test();
		m.test();
	}
}
