import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Slider extends JFrame {
	JSlider slider = new JSlider();
	JLabel label = new JLabel();
	Container c;
	Integer pointer = 150;
	
	Slider(){
		setTitle("JSlider Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 150);
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		slider = new JSlider(JSlider.HORIZONTAL, 100, 200, pointer);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				pointer = slider.getValue();
				label.setText(pointer.toString());
			}
		});
		
		label = new JLabel(pointer.toString());
		label.setBackground(Color.GREEN);
		label.setOpaque(true);
		c.add(slider);
		c.add(label);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new Slider ();
	}
}