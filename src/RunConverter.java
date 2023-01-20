import javax.swing.ImageIcon;

public class RunConverter {

	public static void main(String[] args) {
		TempConverter converter = new TempConverter(); 
		converter.setSize(500, 300);
		converter.setResizable(false);
		converter.setTitle("Temperature Converter");
		converter.setVisible(true);
		
	}

}
