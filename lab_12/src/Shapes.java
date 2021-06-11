import javax.swing.*;
import java.awt.*;

public class Shapes extends JFrame{
	
	public Shapes() {
		setTitle("FigurePanelEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout grid = new GridLayout(2, 3, 5, 5);
		
		Container c = getContentPane();
		c.setLayout(grid);
		
		Panel1 panel1 = new Panel1();
		Panel2 panel2 = new Panel2();
		Panel3 panel3 = new Panel3();
		Panel4 panel4 = new Panel4();
		Panel5 panel5 = new Panel5();
		Panel6 panel6 = new Panel6();
		
		c.add(panel1);
		c.add(panel2);
		c.add(panel3);
		c.add(panel4);
		c.add(panel5);
		c.add(panel6);
		
		setSize(400,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Shapes();
	}
}

class Panel1 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width = getSize().width;
		int height = getSize().height;
		
		g.setColor(Color.BLACK);
		g.drawLine(10, 10, width - 10, height - 10);
		g.drawLine(width - 10, 10, 10, height - 10);
	}
}

class Panel2 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width = getSize().width;
		int height = getSize().height;
		
		g.setColor(Color.BLUE);
		g.drawRect((int)(0.1 * width), (int)(0.1 * height),(int)(0.8 * width), (int)(0.8 * height));
	}
}

class Panel3 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width = getSize().width;
		int height = getSize().height;
		
		g.setColor(Color.RED);
		g.drawRoundRect((int)(0.1 * width), (int)(0.1 * height),(int)(0.8 * width), (int)(0.8 * height),20,20);
	}
}

class Panel4 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width = getSize().width;
		int height = getSize().height;
		
		g.setColor(Color.BLACK);
		g.drawOval((int)(0.1 * width), (int)(0.1 * height), (int)(0.8 * width), (int)(0.8 * height));

	}
}

class Panel5 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width = getSize().width;
		int height = getSize().height;
		
		g.setColor(Color.BLUE);
		g.fillRect((int)(0.1 * width), (int)(0.1 * height),(int)(0.8 * width), (int)(0.8 * height));
	}
}

class Panel6 extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width = getSize().width;
		int height = getSize().height;
		
		g.setColor(Color.RED);
		g.fillRoundRect((int)(0.1 * width), (int)(0.1 * height),(int)(0.8 * width), (int)(0.8 * height),20,20);
	}
}