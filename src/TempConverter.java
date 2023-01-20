import javax.swing.*;
import java.awt.*;

public class TempConverter extends JFrame {
	ImageIcon image; 
	public TempConverter() {  
		image = new ImageIcon("src/img/icon.png");
		this.setIconImage(image.getImage()); // changes icon of frame
		this.getContentPane().setBackground(new Color(255,100,0));
		
	}
}
