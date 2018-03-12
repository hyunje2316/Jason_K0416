package exercise1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class Box{
	int width, length, height;
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getVolume() {
		return width * length * height;
	}
	
	public void print() {
		System.out.println("가로 : " + width + "\n세로 : " + length + "\n높이 : " + height);
	}
}

public class Exercise1{
	public static void main(String args[]) {
		Box box1 = new Box();
		box1.setWidth(100);
		box1.setLength(100);
		box1.setHeight(100);
		System.out.println(box1.getVolume());
		
		Box box2 = new Box();
		box2.setWidth(200);
		box2.setLength(200);
		box2.setHeight(200);
		box1 = box2;
		
		box1.print();
	}
}