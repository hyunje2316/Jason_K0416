package chapter12_Programming;

interface Movable{
	void move(int dx, int dy);
}

class Shape implements Movable{
	protected int x, y;
	public void draw() {
		System.out.println("Shape Draw");
	}
	
	public void move(int dx, int dy) {
		x = dx;
		y = dy;
		System.out.println(x + ", " + y);
	}
}

class Rectangle extends Shape implements Movable{
	private int width, height;
	public void draw() {
		System.out.println("Rectangle Draw");
	}
	
	public void move(int dx, int dy) {
		x = dx;
		y = dy;
	}
}

class Triangle extends Shape implements Movable{
	private int base, height;
	public void draw() {
		System.out.println("Triangle Draw");
	}
	
	public void move(int dx, int dy) {
		x = dx;
		y = dy;
	}
}

class Circle extends Shape implements Movable{
	private int radius;
	public void draw() {
		System.out.println("Circle Draw");
	}
	
	public void move(int dx, int dy) {
		x = dx;
		y = dy;
	}
}

public class ShapeTest {
	private static Shape arrayOfShapes[];
	public static void main(String args[]) {
		init();
		drawAll();
		moveAll();
	}
	
	public static void init() {
		arrayOfShapes = new Shape[3];
		arrayOfShapes[0] = new Rectangle();
		arrayOfShapes[1] = new Triangle();
		arrayOfShapes[2] = new Circle();
	}
	
	public static void drawAll() {
		for (int i = 0; i < arrayOfShapes.length; i++) {
			arrayOfShapes[i].draw();
		}
	}
	
	public static void moveAll() {
		for (int i = 0; i < arrayOfShapes.length; i++) {
			arrayOfShapes[i].move((int)Math.random() * 6 + 1, (int)Math.random() * 6 + 1);
			System.out.println(arrayOfShapes[i].x + ", " + arrayOfShapes[i].y);
		}
	}
}
