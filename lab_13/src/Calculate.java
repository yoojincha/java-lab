import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator extends JFrame {
	JPanel panel = new JPanel();
    JButton button = new JButton("Calculate");
    JLabel label = new JLabel("계산 결과 출력");
    
    Dialog dialog;
    
    Calculator() {
        this.setTitle("다이얼로그 만들기");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        button.addActionListener(new ButtonActionListener());
		label.setBackground(Color.GREEN);
		label.setOpaque(true);
        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.setSize(300, 300);
        this.setVisible(true);
    }
    
    class ButtonActionListener implements ActionListener {
    	public void actionPerformed(ActionEvent e) {
	        if(e.getActionCommand().equals("Calculate")) {
                dialog = new Dialog();
	        }
	        else if(e.getActionCommand().equals("Add")) {
	            float x = Float.parseFloat(dialog.a.getText());
	            float y = Float.parseFloat(dialog.b.getText());
	            if(x!=(int)x || y!=(int)y) {
	            	JOptionPane.showMessageDialog(null, "입력한 숫자가 정수가 아닙니다.", "경고", JOptionPane.ERROR_MESSAGE);
	            }
	            else {
		            int sum = (int)x+(int)y;
		            label.setText(Integer.toString(sum));
	            }
	        }
        }
    }
        
    class Dialog extends JDialog {
	    JPanel panel = new JPanel();
	    JLabel la = new JLabel("두 수를 더합니다.");
	    JTextField a = new JTextField(10);
	    JTextField b = new JTextField(10);
	    JButton add = new JButton("Add");
	    Dialog() {
	        this.setTitle("Calculation Dialog");
	        add.addActionListener(new ButtonActionListener());
	        panel.add(la);
	        panel.add(a);
	        panel.add(b);
	        panel.add(add);
	        this.add(panel);
	        this.setSize(150, 200);
	        this.setVisible(true);
        }
    }
}

public class Calculate {
	public static void main(String[] args) {
		new Calculator();
	}
}