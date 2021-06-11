import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoveJavaSize extends JFrame {
	JLabel label;
	int fontSize;
	
	LoveJavaSize(){
		setTitle("+,- 키로 폰트 크기 조절");
		setSize(300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		fontSize = 2;
		label = new JLabel("Love Java");
		label.setSize(50, 50);
		label.setFont(new Font(null, Font.BOLD, 5 * fontSize));
		label.addKeyListener(new KeyAdapter () {
			public void keyPressed (KeyEvent e) {
				if(e.getKeyChar() == '+') {
					fontSize += 5;
					label.setFont(new Font(null, Font.BOLD, 5 * fontSize));
				}
				else if(e.getKeyChar() == '-') {
					fontSize -= 5;
					label.setFont(new Font(null, Font.BOLD, 5 * fontSize));
				}
			}
		});
		add(label);
		setVisible(true);
		label.requestFocus();
	}
	public static void main(String[] args) {
		new LoveJavaSize ();
	}

}
