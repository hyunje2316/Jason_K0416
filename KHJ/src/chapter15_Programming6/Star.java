package chapter15_Programming6;

import java.awt.*;
import javax.swing.*;

public class Star {
	int[] xPoint = {60, 100, 100, 140, 140, 50, 50, 150, 150, 60};
	int[] yPoint = {130, 30, 30, 130, 130, 60, 60, 60, 60, 130};
	
	public void move(int xpoint, int ypoint) {
		for (int i = 0; i < xPoint.length; i++) {
			xPoint[i] += xpoint;
			yPoint[i] += ypoint;
		}
	}
}
