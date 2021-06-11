import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Polygon extends JFrame {
	
	public Polygon(){
		setTitle("마우스로 폐다각형 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new DrawShape());
		setSize(300,300);
		setVisible(true);
	}
	
	class DrawShape extends JPanel {
		private Vector<Integer> xv = new Vector<Integer>();
		private Vector<Integer> yv = new Vector<Integer>();

		public DrawShape() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					xv.add(e.getX());
					yv.add(e.getY());
					repaint();
				}
			});
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.MAGENTA);
			
			int xs[] = new int [xv.size()];
			int ys[] = new int [yv.size()];
			
			for(int i=0; i<xv.size(); i++) {
				xs[i] = xv.get(i);
				ys[i] = yv.get(i);
			}
			
			g.drawPolygon(xs, ys, xs.length);
		}
	}
	
	static public void main(String[] args) {
		new Polygon();
	}
}
