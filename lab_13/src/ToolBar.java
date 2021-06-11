import javax.swing.*;
import java.awt.*;

public class ToolBar extends JFrame {
	public ToolBar() {
		setTitle("툴바 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Tool();
		setSize(400, 200);
		setVisible(true);
	}
	public void Tool() {
		JToolBar bar = new JToolBar();
		
		bar.setBackground(Color.LIGHT_GRAY);
		
		JButton newbutton = new JButton("New");
		JButton openbutton = new JButton("Open");
		JButton printbutton = new JButton(new ImageIcon("images2/print.gif"));
		printbutton.setToolTipText("Print");
		JButton savebutton = new JButton(new ImageIcon("images2/save.jpg"));
		savebutton.setToolTipText("Save");
		bar.add(newbutton);
		bar.add(openbutton);
		bar.add(printbutton);
		bar.add(savebutton);
		bar.add(new JLabel("search"));
		bar.add(new JTextField());
		
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("apple");
		combo.addItem("banana");
		combo.addItem("kiwi");
		combo.addItem("mango");
		bar.add(combo);
		
		add(bar, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new ToolBar();
	}
}
