import javax.swing.*;
import java.awt.*;

public class Question2 extends JFrame{
	
	public Question2() {
		setTitle("Graphics 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		Panel panel = new Panel();
		c.add(panel); // 컨테이너에 판넬 붙이기
		
		setSize(250,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Question2();
	}
}

class Panel extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.BLUE); // 파란색
        g.drawString("자바 그래픽",20,20); // (20,20) 위치에 글씨 써넣기
		
		g.setColor(Color.RED); // 빨간색으로 변경
		g.drawRect(30, 30, 80, 80); // (30,30) 위치에 (80,80) 크기의 사각형 그리기
		
		g.setColor(Color.GREEN); // 초록색으로 변경
		g.fillOval(120, 30, 80, 80); // (120,30) 위치에 (80,80) 크기의 원 칠하기
	}
}