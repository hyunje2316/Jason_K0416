package chapter11_Programming2;

public class TestCustomer {
	public static void main(String args[]) {
		Customer c1 = new Customer("현제", "010-1234-1234", 1, 30000);
		Customer c2 = new Customer("선우", "부천시", "010-9999-1111", 2, 50000);
		
		System.out.println(c1.toString());
		c1.setName("정현");
		c1.setCID(3);
		c1.setPoint(70000);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
