package chapter11_Programming;

public class TestCylinder {
	public static void main(String args[]) {
		Cylinder obj1 = new Cylinder();
		Cylinder obj2 = new Cylinder(5.0, 3.0);
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		System.out.println("obj1�� �Ӽ� - " + "������ : " + obj1.getRadius() + " ���� : " + obj1.getArea() + " ���� : " + obj1.getHeight() + " ���� : " + obj1.getVolume());
		System.out.println("obj2�� �Ӽ� - " + "������ : " + obj2.getRadius() + " ���� : " + obj2.getArea() + " ���� : " + obj2.getHeight() + " ���� : " + obj2.getVolume());
	}
}
