package chapter11_Programming;

class Cylinder extends Circle {
	private double height;
	public Cylinder() {
		super();
		this.height = 1;
	}
	
	public Cylinder(double radius) {
		super(radius);
		this.height = 1;
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return super.getArea() * height;
	}
	
	public String toString() {
		return super.toString() + ", " + height;
	}
}
