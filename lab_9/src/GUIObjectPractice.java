
import javax.swing.*;
import java.awt.*;


class Frame extends JFrame {
	
	public Frame() {
		setTitle("GUI Object 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JButton("OK"));
		c.add(new JLabel("Enter your name: "));
		c.add(new JTextField("Type Name Here"));
		c.add(new JCheckBox("Bold"));
		c.add(new JRadioButton("Red"));
		c.add(new JComboBox(new String[]{"Red","Green","Blue"})); 
		
		setSize(350,150);
		setVisible(true);
		
	}
}


public class GUIObjectPractice {
	
	public static void main(String[] args) {
		Frame frame = new Frame();
	}
}

