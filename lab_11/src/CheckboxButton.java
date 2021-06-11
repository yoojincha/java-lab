import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckboxButton extends JFrame {
    Container c;
    JCheckBox enable = new JCheckBox("버튼 비활성화");
    JCheckBox visible = new JCheckBox("버튼 감추기");
    JButton button = new JButton("test button");
    
    CheckboxButton() {
        setTitle("CheckBox Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = getContentPane();
        c.setLayout(new FlowLayout());
        enable.addItemListener(new MyItemListener());
        visible.addItemListener(new MyItemListener());
        c.add(enable);
        c.add(visible);
        c.add(button);
        
        setSize(250, 150);
        setVisible(true);
    }
    
    public class MyItemListener implements ItemListener {
        boolean bool = true;
        public void itemStateChanged(ItemEvent e) 
        {
            if(e.getStateChange()==ItemEvent.SELECTED) bool = false;
            else bool = true;
            
            if(e.getItem() == enable) button.setEnabled(bool);
            else button.setVisible(bool);
        }
        
    }
    
    public static void main(String[] args) {
        new CheckboxButton();
    }
}
