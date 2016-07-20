import com.burdbrain.drawings.Drawing;
import java.awt.Graphics;
public class DrawingWideBB extends Drawing{
	int width = 100, height = 30;
	public void paint(Graphics g){
		g.drawOval(x, y, width, height);
	}
}
