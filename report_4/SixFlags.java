/*
 
 파일명: SixFlags.java
 
 이름: 차유진
 소속: 중앙대학교 영어영문학과
 학번: 20151816
 
 [ Report 4 ]
 
 문제 1. 여섯가지 국기

 */

import javax.swing.*;
import java.awt.*;

public class SixFlags extends JFrame{
	
	public SixFlags() {
		setTitle("SixFlags");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		GridLayout grid = new GridLayout(2, 3, 5, 5); // 2x3로 배치, 가로 세로 간격 5

		Container c = getContentPane();
		c.setLayout(grid); // 컨테이너에 그리드 레이아웃 적용
		
		// 각 국기를 넣어줄 패널들
		Panel1 panel1 = new Panel1();
		Panel2 panel2 = new Panel2();
		Panel3 panel3 = new Panel3();
		Panel4 panel4 = new Panel4();
		Panel5 panel5 = new Panel5();
		Panel6 panel6 = new Panel6();
		
		// 컨테이너에 패널 추가
		c.add(panel1);
		c.add(panel2);
		c.add(panel3);
		c.add(panel4);
		c.add(panel5);
		c.add(panel6);
		
		setSize(500,230);
		setVisible(true);
	}
	
	// 각 패널에 이미지 넣기
	class Panel1 extends JPanel{
		ImageIcon icon1 = new ImageIcon("image/us.gif");
		Image img1 = icon1.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img1,0,0,this.getWidth(),this.getHeight(),this); // 패널 크기에 맞게 넣어줌
		}
	}	
	class Panel2 extends JPanel{
		ImageIcon icon2 = new ImageIcon("image/ca.gif");
		Image img2 = icon2.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img2,0,0,this.getWidth(),this.getHeight(),this);
		}
	}	
	class Panel3 extends JPanel{
		ImageIcon icon3 = new ImageIcon("image/india.gif");
		Image img3 = icon3.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img3,0,0,this.getWidth(),this.getHeight(),this);
		}
	}	
	class Panel4 extends JPanel{
		ImageIcon icon4 = new ImageIcon("image/uk.gif");
		Image img4 = icon4.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img4,0,0,this.getWidth(),this.getHeight(),this);
		}
	}	
	class Panel5 extends JPanel{
		ImageIcon icon5 = new ImageIcon("image/china.gif");
		Image img5 = icon5.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img5,0,0,this.getWidth(),this.getHeight(),this);
		}
	}	
	class Panel6 extends JPanel{
		ImageIcon icon6 = new ImageIcon("image/norway.gif");
		Image img6 = icon6.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img6,0,0,this.getWidth(),this.getHeight(),this);
		}
	}	
	
	public static void main(String[] args) {
		new SixFlags();
	}
}
