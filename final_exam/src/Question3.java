import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Frame extends JFrame {
	
	public static JPanel enter = new JPanel();
	public static JTextField input = new JTextField("");
	
	public Frame() {
		setTitle("산술 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		enter.setBackground(Color.LIGHT_GRAY);
		enter.setLayout(new BorderLayout(5,5));
		enter.add(new JLabel("\t\t연산수식"), BorderLayout.WEST);
		enter.add(input, BorderLayout.CENTER);
		enter.add(new JLabel(""),BorderLayout.EAST);
		
		JPanel buttons = new JPanel();
		buttons.setBackground(Color.WHITE);
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
			button[i].addActionListener(new MyActionListener());
			buttons.add(button[i]);
		}
		
		JPanel result = new JPanel();
		result.setBackground(Color.YELLOW);
		result.setLayout(new BorderLayout(5,5));
		result.add(new JLabel("\t\t계산 결과 "), BorderLayout.WEST);
		result.add(new JTextField(""),BorderLayout.CENTER);
		result.add(new JLabel(""),BorderLayout.EAST);
		
		
		c.add(enter, BorderLayout.NORTH);
		c.add(buttons, BorderLayout.CENTER);
		c.add(result, BorderLayout.SOUTH);
		
		setSize(300,300);
		setVisible(true);
	}
}

class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		switch(b.getText()) {
		case "0":
			Frame.input.setText("0");
			break;
		case "1":
			Frame.input.setText("1");
			break;
		case "2":
			Frame.input.setText("2");
			break;
		case "3":
			Frame.input.setText("3");
			break;
		case "4":
			Frame.input.setText("4");
			break;
		case "5":
			Frame.input.setText("5");
			break;
		case "6":
			Frame.input.setText("6");
			break;
		case "7":
			Frame.input.setText("7");
			break;
		case "8":
			Frame.input.setText("8");
			break;
		case "9":
			Frame.input.setText("9");
			break;
		case "+":
			Frame.input.setText("+");
			break;
		case "*":
			Frame.input.setText("*");
			break;
		case "-":
			Frame.input.setText("-");
			break;
		case "/":
			Frame.input.setText("/");
			break;
		}
	}
}

public class Question3 {
	
	public static void main(String[] args) {
		new Frame();
	}
}
