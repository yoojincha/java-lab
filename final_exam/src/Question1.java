import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Question1 extends JFrame {
	
	JComboBox cb = new JComboBox();
	JTextField tf = new JTextField(10);
	Container c;
	
	Question1(){
		setTitle("Question-1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(new FlowLayout());
    	c.add(tf); // 텍스트필드
        c.add(cb); // 콤보박스
    	tf.addKeyListener(new MyKeyListener());
    	setSize(300,200);
    	setVisible(true);
	}
	
	class MyKeyListener implements KeyListener {
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_ENTER) { // 엔터키 입력시 
				cb.addItem(tf.getText()); // 텍스트필드에 있는 텍스트 가져와 콤보박스에 넣기
    			tf.setText(""); // 텍스트필드 초기화
    		}
    	}
    	public void keyReleased(KeyEvent e){}
    	public void keyTyped(KeyEvent e) {}
	}
	
	public static void main(String[] args) {
		new Question1();
	}
}