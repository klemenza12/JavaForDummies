package com.burdbrain.drawings;
import java.awt.Graphics;
import javax.swing.JFrame;
public class ArtFrameTest extends JFrame{
	private static final long serialVersionUID = 1L;
	Drawing drawing;
	public void ArtFrame(Drawing drawing){
		this.drawing = drawing;
		setTitle("Abstract Art");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void paint(Graphics g){
		drawing.paint(g);
	}
}
