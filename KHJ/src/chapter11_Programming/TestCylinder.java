package chapter11_Programming;

public class TestCylinder {
	public static void main(String args[]) {
		Cylinder obj1 = new Cylinder();
		Cylinder obj2 = new Cylinder(5.0, 3.0);
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		System.out.println("obj1의 속성 - " + "반지름 : " + obj1.getRadius() + " 넓이 : " + obj1.getArea() + " 높이 : " + obj1.getHeight() + " 부피 : " + obj1.getVolume());
		System.out.println("obj2의 속성 - " + "반지름 : " + obj2.getRadius() + " 넓이 : " + obj2.getArea() + " 높이 : " + obj2.getHeight() + " 부피 : " + obj2.getVolume());
	}
}
