package com.burdbrain.drawings;
import java.awt.Graphics;
public class DrawingTest extends Drawing{
	protected int width = 100, height = 30;
	public void paint(Graphics g){
		g.drawOval(x, y, width, height);
	}
}
