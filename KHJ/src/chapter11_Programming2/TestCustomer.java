package chapter11_Programming2;

public class TestCustomer {
	public static void main(String args[]) {
		Customer c1 = new Customer("����", "010-1234-1234", 1, 30000);
		Customer c2 = new Customer("����", "��õ��", "010-9999-1111", 2, 50000);
		
		System.out.println(c1.toString());
		c1.setName("����");
		c1.setCID(3);
		c1.setPoint(70000);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
