import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GreenYellow extends JFrame{
    JPanel contentPane = new JPanel();
    GreenYellow(){
        setTitle("드래깅동안 YELLO");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        setContentPane(contentPane);
        contentPane.setBackground(Color.GREEN);
        contentPane.addMouseMotionListener(new MyMouseMotionAdapter());
        contentPane.addMouseListener(new MyMouseAdapter2());
        setSize(300,150);
        setVisible(true);
    }
    class MyMouseMotionAdapter extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e) {
            contentPane.setBackground(Color.YELLOW);
        }
    }
    class MyMouseAdapter2 extends MouseAdapter{
        public void mouseReleased(MouseEvent e) {
            contentPane.setBackground(Color.GREEN);
        }
    }
    public static void main(String[] args) {
        new GreenYellow();
    }
}