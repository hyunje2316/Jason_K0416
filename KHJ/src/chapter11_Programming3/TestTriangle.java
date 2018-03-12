package chapter11_Programming3;

public class TestTriangle {
	public static void main(String args[]) {
		Triangle t1 = new Triangle(3, 3, 6.0, 4.0);
		System.out.println("도형의 위치 : (" + t1.getX() + ", " + t1.getY() + ")");
		System.out.println(t1.getLength());
		System.out.println(t1.getArea());
	}
}
