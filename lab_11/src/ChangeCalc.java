import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calc extends JFrame {
	
    int[] type = {50000, 10000, 1000, 500, 100, 50, 10, 1};
    String[] str = {"금액", "오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
    
    JLabel label = new JLabel();
    JTextField[] tf = new JTextField[str.length];
    JButton button = new JButton("계산");
    JCheckBox[] cb = new JCheckBox[type.length-1];
    boolean bool=true;
    boolean[] bool2=new boolean[type.length];
    
    Calc() {
        this.setTitle("Money Changer with CheckBox");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.PINK);
        this.setLayout(null);
        
        label = new JLabel(str[0]);
        label.setSize(40, 20);
        label.setLocation(20, 20);
        this.add(label);
        
        tf[0] = new JTextField(30);
        tf[0].setSize(100, 20);
        tf[0].setLocation(100, 20);
        this.add(tf[0]);
        
        button.setSize(70, 20);
        button.setLocation(210, 20);
        
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = tf[0].getText();
            if(input.length() == 0) 
                return;
            
            int money = Integer.parseInt(input);
            int temp;
            
            for(int i=0; i<type.length; i++) 
            {
                if(bool2[i]==true){
                temp = money/type[i];
                tf[i + 1].setText(Integer.toString(temp));
                if(temp > 0) 
                    money = money % type[i];
                }
                else if(bool2[i]==false){
                    tf[i+1].setText("0");
                }
            }
            }
        });
        this.add(button);
        
        for(int i = 1; i < str.length; i++) {
        	label = new JLabel(str[i]);
        	label.setHorizontalAlignment(JLabel.RIGHT);
        	label.setSize(50, 20);
        	label.setLocation(50, 50+(i*20));
            
            tf[i] = new JTextField(30);
            tf[i].setHorizontalAlignment(JTextField.CENTER);
            tf[i].setSize(70, 20);
            tf[i].setLocation(120, 50+(i*20));
            
            if(i<str.length-1){
            	cb[i-1] = new JCheckBox();
            	cb[i-1].addItemListener(new MyItemListener());
            	cb[i-1].setHorizontalAlignment(JCheckBox.CENTER);
            	cb[i-1].setSize(20, 20);
            	cb[i-1].setLocation(210, 50+(i*20));
                this.add(cb[i-1]);
            }
            this.add(label);
            this.add(tf[i]);
        }
        setSize(300, 300);
        setVisible(true);
    }
    
    class MyItemListener implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange()==ItemEvent.SELECTED)
            	bool=true;
            else
            	bool=false;
            
            for(int i=0; i<bool2.length; i++){
                if(i==bool2.length-1)
                	bool2[i]=true;
                else if(e.getItem()==cb[i])
                	bool2[i]=bool;
            }
        }
    }
}

public class ChangeCalc {
    public static void main(String[] args) {
        new Calc();
    }
}

