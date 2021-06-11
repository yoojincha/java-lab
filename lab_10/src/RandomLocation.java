
import java.util.*;
import java.awt.event.*;
import javax.swing.*;


public class RandomLocation extends JFrame {
	JLabel label;
	int x, y;
	
	RandomLocation(){
		setTitle("클릭 연습 용 응용프로그램");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
	
		label = new JLabel("C");
		label.setSize(20, 20);
		label.setLocation(100, 100);
		
		label.addMouseListener(new MouseAdapter () {
			public void mouseClicked (MouseEvent e) {
				Random ran = new Random(); 
				x = ran.nextInt(280);
				y = ran.nextInt(280);
				label.setLocation(x, y);
			}
		});
		add(label);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RandomLocation();
	}
}