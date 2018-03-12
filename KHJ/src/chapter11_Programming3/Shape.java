package chapter11_Programming3;

class Shape {
	private int x;
	private int y;
	private double width;
	private double height;
	
	public Shape(int x, int y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int getX() { return x; }
	public int getY() { return y; }
	public double getWidth() { return width; }
	public double getHeight() { return height; }
	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.x = y; }
	public void setWidth(double width) { this.width = width; }
	public void setHeight(double height) { this.height = height; }
	
	public double getLength() { return (2 * width) + (2 * height); }
	public double getArea() { return width * height; }
}
