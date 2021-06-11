
import javax.swing.*;
import java.awt.*;


class Frame2 extends JFrame {
	
	public Frame2() {
		setTitle("Border Layout Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5,10));
		
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		 
		setSize(350,150);
		setVisible(true);
		
	}
}


public class BorderLayoutPractice {
	
	public static void main(String[] args) {
		Frame2 frame2 = new Frame2();
	}
}
