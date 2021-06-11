import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Question4 extends JFrame {
	
	// 라벨 세 개 생성
	JLabel namelb = new JLabel("이름");
	JLabel majorlb = new JLabel("학과");
	JLabel addresslb = new JLabel("주소");
	// 각 라벨 옆 들어갈 텍스트필드 세 개 생성
	JTextField nametf = new JTextField(20);
	JTextField majortf = new JTextField(20);
	JTextField addresstf = new JTextField(20);
	// 확인 및 취소 버튼 생성
	JButton confirm = new JButton("확인");
	JButton cancel = new JButton("취소");
	
	JFrame frame;
	
	Question4(){
		frame = new JFrame("텍스트필드 입력과 파일 저장");
		frame.setLayout(null);
		frame.setSize(300,160);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c =frame.getContentPane();
        
        // 각 개체 붙여주기
        c.setLayout(new FlowLayout());
    	c.add(namelb);
    	c.add(nametf);
    	c.add(majorlb);
    	c.add(majortf);
    	c.add(addresslb);
        c.add(addresstf);
        c.add(confirm);
        c.add(cancel);
        
        // 버튼에 액션리스너 달기
    	confirm.addActionListener(new MyActionListener());
    	cancel.addActionListener(new MyActionListener());
  
    	frame.setVisible(true);
	}
	
	class MyActionListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource(); // 액션이 발생한 버튼
			if(b.getText().equals("확인")) { // 버튼의 텍스트가 "확인"일 경우
				FileWriter fw = null;
				File f = new File("output.txt"); // 파일 만들기
				try {
					// 각각 텍스트필드의 텍스트 불러와 파일에 쓰기
					fw = new FileWriter(f);
					String line = nametf.getText();
					fw.write(line+"\n");
					line = majortf.getText();
					fw.write(line+"\n");
					line = addresstf.getText();
					fw.write(line+"\n");

					fw.close();
				} 
				catch (IOException x) {
					x.printStackTrace();
				}
			}
			else if(b.getText().equals("취소")) { // 버튼의 텍스트가 "취소"일 경우
				frame.dispose(); // 창 닫기
			}
		}
	}
	
	public static void main(String[] args) {
		new Question4();
	}
}