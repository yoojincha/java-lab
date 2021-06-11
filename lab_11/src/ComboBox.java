import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBox extends JFrame {
	
	JComboBox cb = new JComboBox();
	JTextField tf = new JTextField(10);
	Container c;
	
	ComboBox(){
		setTitle("JField and ComboBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(new FlowLayout());
    	c.add(tf);
        c.add(cb);
    	tf.addKeyListener(new MyKeyListener());
    	setSize(300,200);
    	setVisible(true);
	}
	
	class MyKeyListener implements KeyListener {
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				cb.addItem(tf.getText());
    			tf.setText("");
    		}
    	}
    	public void keyReleased(KeyEvent e){}
    	public void keyTyped(KeyEvent e) {}
	}
	
	public static void main(String[] args) {
		new ComboBox();
	}
}