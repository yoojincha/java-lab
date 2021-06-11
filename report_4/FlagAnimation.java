/*
 
 파일명: FlagAnimation.java
 
 이름: 차유진
 소속: 중앙대학교 영어영문학과
 학번: 20151816
 
 [ Report 4 ]
 
 문제 3. 움직이는 국기

 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 스레드 클래스
class thread extends Thread{
	public JLabel label;
	public Container c;
	
	int x, y;
	
	public thread(Container c, JLabel label, int x, int y) {
		this.label = label;
		this.c = c; // container
		this.x = x; // label의 x 좌표
		this.y = y; // label의 y 좌표
	}
	
	@Override
	public void run() {
		label.setLocation(x,y);
		c.add(label); // container에 label 넣어줌
		
		while(true) {
			try{
				y-=5; // 객체를 위로 5씩 옮김
				label.setLocation(x,y);
				sleep(400); // 400ms마다 움직임
			}
			catch(InterruptedException e) {
				System.out.print("오류");
			}
		}
	}
}

public class FlagAnimation extends JFrame{
	JLabel label = new JLabel();
	ImageIcon img = new ImageIcon("image/us.gif");
	Thread thread =  new Thread();
	
	public FlagAnimation() {
		setTitle("Flag Animation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		setSize(300, 200);
		setLocationRelativeTo(null);
		setVisible(true);
		
		label.setIcon(img);
		label.setSize(60,40); // 사이즈 설정을 하니 이미지가 잘려서 출력되는 문제가 있음
		
		thread = new thread(c, label, 20, 100); // (20,100) 위치에서 스레드 실행
		thread.start();
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) { // 마우스 클릭시 
				thread.stop(); // 기존 스레드 정지
				thread = new thread(c, label, e.getX(), e.getY()); // 마우스 클릭 위치에서 스레드 새로 실행
				thread.start();
			}
		});
		c.requestFocus();
	}
	
	public static void main(String[] args) {
	    new FlagAnimation();
	}
}


