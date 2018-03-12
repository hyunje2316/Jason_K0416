package chapter11_Programming;

class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		this.radius = 1;
		this.color = null;
	}
	
	public Circle(double radius) {
		this.radius = radius;
		this.color = null;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return 3.14 * Math.pow(radius, 2);
	}
	
	public String toString() {
		return radius + ", " + color;
	}
}
