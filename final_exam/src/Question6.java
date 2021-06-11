import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Question6 extends JFrame {
    Container c = getContentPane();
    // 버튼 생성
    JButton yellow = new JButton("Yellow");
    JButton blue = new JButton("Blue");
    
    Question6() {
    	setTitle("MouseListener Ex"); // 초기 타이틀
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        c.setLayout(new FlowLayout());
        
        // 버튼 및 컨테이너에 마우스리스너 달기
        yellow.addMouseListener(new MyMouseListener());
        blue.addMouseListener(new MyMouseListener());
        c.addMouseListener(new MyMouseListener());
        c.add(yellow);
        c.add(blue);
        
        setSize(300, 200);
        setVisible(true);
    }
    
    class MyMouseListener implements MouseListener, MouseMotionListener{

		public void mouseDragged(MouseEvent e) { // 마우스를 드래그 한 경우
			Question6.this.setTitle("MouseDragged ("+e.getX()+","+e.getY()+")"); // 타이틀을 마우스의 좌표로 변경
		}
		public void mouseClicked(MouseEvent e) { // 마우스를 클릭 한 경우
			JButton b = (JButton)e.getSource(); // 이벤트가 발생한 버튼
    		String select = b.getText(); // 버튼의 텍스트 가져오기
    		if(select.equals("Blue")) { // 텍스트가 Blue 일 경우
    			c.setBackground(Color.BLUE); // 파란색으로 배경색 변경
    		}
		}
		public void mousePressed(MouseEvent e) { // 마우스를 프레스 한 경우
			JButton b = (JButton)e.getSource(); // 이벤트가 발생한 버튼
    		String select = b.getText(); // 버튼의 텍스트 가져오기
    		if(select.equals("Yellow")) { // 텍스트가 Yellow 일 경우
    			c.setBackground(Color.YELLOW); // 노란색으로 배경색 변경
    		}
		}
		public void mouseReleased(MouseEvent e) { // 마우스를 릴리즈 한 경우
			c.setBackground(null); // 기본 배경색으로 변경
		}

		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mouseMoved(MouseEvent e) {}

    }
    
    public static void main(String[] args) {
        new Question6();
    }
}
