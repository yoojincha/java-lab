import javax.swing.*;
import java.awt.*;

public class USFlag extends JFrame{
	DisplayImage p = new DisplayImage();
	
	public USFlag() {
		setTitle("DisplayImage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(p);
		
		setSize(300,200);
		setVisible(true);
	}
	
	class DisplayImage extends JPanel{
		
		ImageIcon icon = new ImageIcon("us.gif");
		Image img = icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img,0,0,this.getWidth(),this.getHeight(),this);
		}
	}
	public static void main(String[] args) {
		new USFlag();
	}
}
