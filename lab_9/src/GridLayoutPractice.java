
import javax.swing.*;
import java.awt.*;


class Frame3 extends JFrame {
	
	 JLabel label[];
	 Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
			Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
			Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY,
			Color.BLACK, Color.ORANGE, Color.BLUE,Color.MAGENTA};
	
	public Frame3() {
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,4));

		label = new JLabel [16];
		
		
		for(int i = 0; i<label.length; i++) {
			label[i] = new JLabel(Integer.toString(i)); 
			c.add(label[i]);
			label[i].setBackground(color[i]);
			label[i].setOpaque(true);
		}
		
		setSize(400,200);
		setVisible(true);
		
	}
}


public class GridLayoutPractice {
	
	public static void main(String[] args) {
		Frame3 frame3 = new Frame3();
	}
}
