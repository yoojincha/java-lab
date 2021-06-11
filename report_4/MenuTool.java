/*
 
 파일명: MenuTool.java
 
 이름: 차유진
 소속: 중앙대학교 영어영문학과
 학번: 20151816
 
 [ Report 4 ]
 
 문제 4. 메뉴바와 툴바

 */

import javax.swing.*;
import java.awt.*;

public class MenuTool extends JFrame {
	public MenuTool() {
		setTitle("메뉴바 만들기");
		MenuBar();
		ToolBar();
		setSize(400, 200);
		setVisible(true);
	}

	private void MenuBar() {
		JMenuBar mb = new JMenuBar(); // 메뉴바 생성
		// 메뉴 생성
		JMenu file = new JMenu("파일");
		JMenu edit = new JMenu("편집");
		JMenu find = new JMenu("보기");
		JMenu input = new JMenu("입력");
		JMenu run = new JMenu("실행");
		// 메뉴바에 메뉴 삽입
		mb.add(file); 
		mb.add(edit);
		mb.add(find);
		mb.add(input);
		mb.add(run);
		
		// find 메뉴에 메뉴 아이템 생성 삽입
		find.add(new JMenuItem("화면확대"));
		find.add(new JMenuItem("화면축소"));
		find.addSeparator(); // 분리선 추가
		find.add(new JMenuItem("쪽윤곽"));
		
		this.setJMenuBar(mb);
	}
	
	private void ToolBar() {
		JToolBar bar = new JToolBar(); // 툴바 생성
		
		bar.setBackground(Color.LIGHT_GRAY);
		
		// 툴바에 메뉴로 사용할 컴포넌트 삽입
		JButton newbutton = new JButton("New");
		JButton openbutton = new JButton("Open");
		JButton printbutton = new JButton(new ImageIcon("images2/print.gif"));
		printbutton.setToolTipText("Print"); // 툴팁 텍스트 지정
		JButton savebutton = new JButton(new ImageIcon("images2/save.jpg"));
		savebutton.setToolTipText("Save"); // 툴팁 텍스트 지정
		bar.add(newbutton);
		bar.add(openbutton);
		bar.add(printbutton);
		bar.add(savebutton);
		bar.add(new JLabel("search"));
		bar.add(new JTextField());
		
		// 콤보박스 생성
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("apple");
		combo.addItem("banana");
		combo.addItem("kiwi");
		combo.addItem("mango");
		bar.add(combo);
		
		add(bar, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		new MenuTool();
	}
}
