import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Graphics;
public class DummiesPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	public void paint (Graphics myGraphics){
		myGraphics.drawRect(50, 60, 240, 75);
		myGraphics.setFont(new Font ("Dialog", Font.BOLD, 24));
		myGraphics.drawString("Java for Dummies", 55, 100);
	}

}
