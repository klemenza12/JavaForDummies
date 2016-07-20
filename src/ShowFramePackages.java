import com.burdbrain.drawings.DrawingTest;
import com.burdbrain.frames.ArtFrame;
class ShowFramePackages {
	public static void main(String[] args) {
		ArtFrame artFrame = new ArtFrame(new DrawingTest()); //Drawing(), DrawingWideBB(), DrawingWide()
		artFrame.setSize(200, 100);
		artFrame.setVisible(true);
	}

}
