import javax.swing.*;
import java.awt.*;

public class TempConverter extends JFrame {
	ImageIcon image; 
	JPanel panel; 
	JPanelGradient hotGradient; 
	JPanelGradient coldGradient; 
	
	
	
	public TempConverter() {  
		// define variables
		hotGradient = new JPanelGradient(Color.ORANGE, Color.RED); // creates background gradient 
		coldGradient = new JPanelGradient(new Color(0x6DD5FA), new Color(0x2980B9));// creates background gradient 

		image = new ImageIcon("src/img/icon.png"); // file path to program icon
		

		this.setIconImage(image.getImage()); // changes icon of frame

		// Add components
		add(coldGradient);
		
	}

	
}
