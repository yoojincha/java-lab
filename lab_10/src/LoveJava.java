import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoveJava extends JFrame{
 
	LoveJava(){
        setTitle("마우스 올리기 내리기");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Java");
        label.addMouseListener(new MyMouseAdapter());
         
        label.setSize(100,30);
        add(label);
        setSize(300,150);
        setVisible(true);
         
    }
    public static void main(String[] args) {
        new LoveJava();
    }
 
}

class MyMouseAdapter extends MouseAdapter{
    public void mouseEntered(MouseEvent e) {
        JLabel l = (JLabel)e.getSource();
        l.setText("Love Java");
    }
    public void mouseExited(MouseEvent e) {
        JLabel l = (JLabel)e.getSource();
        l.setText("Java");
    }
}