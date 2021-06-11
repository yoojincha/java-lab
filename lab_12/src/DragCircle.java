import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class DragCircle extends JFrame{
	DisplayImage p = new DisplayImage();
	
	public DragCircle() {
		setTitle("이미지 위에 원 드래깅 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(p);
		
		setSize(512,384);
		setVisible(true);
	}
	
	class DisplayImage extends JPanel{
		
		ImageIcon icon = new ImageIcon("back.jpg");
		Image img = icon.getImage();
		Vector<Point> vStart = new Vector<Point>();
		Vector<Point> vEnd = new Vector<Point>();
		
		public DisplayImage() {
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					Point startP = e.getPoint();
					vStart.add(startP);
				}
				public void mouseReleased(MouseEvent e) {
					Point endP = e.getPoint();
					vEnd.add(endP);
					
					repaint();
				}
			});
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img,0,0,this.getWidth(),this.getHeight(),this);
			
			int x = 100;
			int y = 100;
			g.setColor(Color.GREEN);
			g.fillOval(x,y,20,20);
			
			for(int i=0; i<vStart.size(); i++){
				Point s = vStart.elementAt(i);
				Point e = vEnd.elementAt(i);
				if((int)s.getX()>=x && (int)s.getX()<=x+20 && (int)s.getY()>=y && (int)s.getY()<=y+20) {
					g.drawImage(img,0,0,this.getWidth(),this.getHeight(),this);
					g.fillOval((int)e.getX(), (int)e.getY(),20,20);
					x = (int)e.getX();
					y = (int)e.getY();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new DragCircle();
	}
}
