import java.awt.*;
import javax.swing.*;

public class JPanelGradient extends JPanel {
	Color topColor; 
	Color bottomColor;
	
	public JPanelGradient(Color topColor, Color bottomColor) { 
		this.topColor = topColor;
		this.bottomColor = bottomColor;
	}

	@Override
	public void paintComponent(Graphics g) {
	   super.paintComponent(g);
       Graphics2D g2d = (Graphics2D) g;
       g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
       int w = getWidth(), h = getHeight();
       Color color1 = this.topColor;
       Color color2 = this.bottomColor;
       GradientPaint gp = new GradientPaint(0, 0, color1, w, h, color2);
       g2d.setPaint(gp);
       g2d.fillRect(0, 0, w, h);
   }
}