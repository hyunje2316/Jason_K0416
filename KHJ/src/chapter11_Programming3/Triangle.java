package chapter11_Programming3;

class Triangle extends Shape{
	private double c;
	
	public Triangle(int x, int y, double width, double height) {
		super(x, y, width, height);
		this.c = Math.sqrt(Math.pow(width/2, 2) + Math.pow(height, 2));
	}
	
	public double getLength() { return super.getWidth() + 2 * c; } 
	public double getArea() { return super.getArea() / 2; }
}
