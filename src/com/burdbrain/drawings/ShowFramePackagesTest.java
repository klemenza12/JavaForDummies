package com.burdbrain.drawings;
import com.burdbrain.frames.ArtFrame;
class ShowFramePackagesTest {
	public static void main(String[] args) {
		ArtFrame artFrame = new ArtFrame(new Drawing()); //Drawing(), DrawingWideBB(), DrawingWide()
		artFrame.setSize(200, 100);
		artFrame.setVisible(true);
	}

}
