
import javax.swing.*;
import java.awt.*;


class Frame4 extends JFrame {
	
	public Frame4() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel enter = new JPanel();
		enter.setBackground(Color.LIGHT_GRAY);
		c.add(enter, BorderLayout.NORTH);
		enter.setLayout(new BorderLayout(5,5));
		enter.add(new JLabel("\t\t수식입력"), BorderLayout.WEST);
		enter.add(new JTextField(""), BorderLayout.CENTER);
		enter.add(new JLabel(""),BorderLayout.EAST);
		
		JPanel buttons = new JPanel();
		buttons.setBackground(Color.WHITE);
		c.add(buttons, BorderLayout.CENTER);
		buttons.setLayout(new GridLayout(4,4));
		JButton [] button = new JButton[16];
		button[0] = new JButton("0");
		button[1] = new JButton("1");
		button[2] = new JButton("2");
		button[3] = new JButton("3");
		button[4] = new JButton("4");
		button[5] = new JButton("5");
		button[6] = new JButton("6");
		button[7] = new JButton("7");
		button[8] = new JButton("8");
		button[9] = new JButton("9");
		button[10] = new JButton("CE");
		button[11] = new JButton("계산");
		button[12] = new JButton("+");
		button[13] = new JButton("-");
		button[14] = new JButton("x");
		button[15] = new JButton("/");
		
		for(int i=0; i<16; i++) {
			buttons.add(button[i]);
		}
		

		JPanel result = new JPanel();
		c.add(result, BorderLayout.SOUTH);
		result.setBackground(Color.YELLOW);
		result.setLayout(new BorderLayout(5,5));
		result.add(new JLabel("\t\t계산 결과 "), BorderLayout.WEST);
		result.add(new JTextField(""),BorderLayout.CENTER);
		result.add(new JLabel(""),BorderLayout.EAST);
		
		setSize(300,300);
		setVisible(true);
		
	}
}


public class CalculatorFrame {
	
	public static void main(String[] args) {
		Frame4 frame4 = new Frame4();
	}
}
