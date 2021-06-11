/*
 
 파일명: Calculator.java
 
 이름: 차유진
 소속: 중앙대학교 영어영문학과
 학번: 20151816
 
 [ Report 4 ]
 
 문제 2. 잔돈 계산기

 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calc extends JFrame {
    int[] type = {50000, 10000, 1000, 500, 100, 50, 10, 1};
    String[] str = {"금액", "오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
    
    JLabel label = new JLabel();
    JTextField[] tf = new JTextField[str.length]; // 화폐단위 수 만큼 텍스트필드 만들기
    JButton button = new JButton("계산");
    JCheckBox[] cb = new JCheckBox[type.length-1]; // 1원 단위 제외한 만큼 체크박스 만들기
    // 체크박스 체크 확인 여부를 위한 변수
    boolean bool=true;
    boolean[] bool2=new boolean[type.length];
    
    Calc() {
        this.setTitle("Money Changer with CheckBox");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.PINK);
        this.setLayout(null);
        
        label = new JLabel(str[0]); // "금액" 출력
        label.setSize(40, 20);
        label.setLocation(20, 20);
        this.add(label);
        
        tf[0] = new JTextField(30); // 사용자가 금액을 입력할 텍스트필드
        tf[0].setSize(100, 20);
        tf[0].setLocation(100, 20);
        this.add(tf[0]);
        
        // 계산 버튼
        button.setSize(70, 20);
        button.setLocation(210, 20);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = tf[0].getText();
	            if(input.length() == 0) // 금액을 입력하지 않았을 경우
	                return;
	            
	            int money = Integer.parseInt(input); // 입력한 금액을 정수형 변수로 저장
	            int temp;
	            
	            for(int i=0; i<type.length; i++) {
	                if(bool2[i]==true) { // 체크박스 체크 되어있는 경우
	                	temp = money/type[i]; // 입력받은 금액을 해당 화폐 단위로 나눔 
	                	tf[i + 1].setText(Integer.toString(temp)); // 텍스트필드에 출력
	                	if(temp > 0) 
	                		money = money % type[i]; // 더 작은 단위로 나머지 넘기기 위해 변수 재설정
	                }
	                else if(bool2[i]==false) { // 체크박스 체크 안되어있는 경우
	                    tf[i+1].setText("0"); // 0 출력
	                }
	            }
            }
        });
        this.add(button);
        
        for(int i = 1; i < str.length; i++) {
        	label = new JLabel(str[i]); // 화폐단위 표시하는 라벨
        	label.setHorizontalAlignment(JLabel.RIGHT);
        	label.setSize(50, 20);
        	label.setLocation(50, 50+(i*20));
            
            tf[i] = new JTextField(30); // 금액 표시하는 텍스트 필드
            tf[i].setHorizontalAlignment(JTextField.CENTER);
            tf[i].setSize(70, 20);
            tf[i].setLocation(120, 50+(i*20));
            
            if(i<str.length-1){
            	cb[i-1] = new JCheckBox(); // 체크박스
            	cb[i-1].addItemListener(new MyItemListener());
            	cb[i-1].setHorizontalAlignment(JCheckBox.CENTER);
            	cb[i-1].setSize(20, 20);
            	cb[i-1].setLocation(210, 50+(i*20));
            	cb[i-1].setSelected(true);
            	// 프로그램 실행시 디폴트를 체크 상태로 해줌
                this.add(cb[i-1]); 
            }
            this.add(label);
            this.add(tf[i]);
        }
        setSize(300, 300);
        setVisible(true);
    }
    
    // 체크 박스 체크 여부 확인하기
    class MyItemListener implements ItemListener{
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange()==ItemEvent.SELECTED) // 체크 된 경우
            	bool=true;
            else // 체크 되지 않은 경우
            	bool=false;
            
            // bool2 배열에 체크 여부 저장 
            for(int i=0; i<bool2.length; i++){
                if(i==bool2.length-1)
                	bool2[i]=true;
                else if(e.getItem()==cb[i])
                	bool2[i]=bool;
            }
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        new Calc();
    }
}

