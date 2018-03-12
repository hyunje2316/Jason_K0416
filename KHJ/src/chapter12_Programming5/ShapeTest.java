package chapter12_Programming5;

class Shape{
	private String color;
	
	public Shape(String color) {
		this.color = color;
	}
	
	public double calcArea() {
		return 0;
	}
	
	public String toString() {
		return calcArea() + " " + color;
	}
	
	public String getColor() {
		return color;
	}
}

class Rectangle extends Shape{
	private double length;
	private double height;
	
	public Rectangle(String color, double length, double height) {
		super(color);
		this.length = length;
		this.height = height;
	}
	
	public double calcArea() {
		return length * height;
	}
	
	public String toString() {
		return calcArea() + " " + getColor();
	}
}

class Triangle extends Shape{
	private double base;
	private double height;
	
	public Triangle(String color, double base, double height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	
	public double calcArea() {
		return base * height / 2;
	}
	
	public String toString() {
		return calcArea() + " " + getColor();
	}
}

public class ShapeTest {
	public static void main(String args[]) {
		Rectangle rt = new Rectangle("Red", 10, 10);
		Triangle ta = new Triangle("Blue", 10, 10);
		
		System.out.println(rt.toString());
		System.out.println(ta.toString());
	}
}
