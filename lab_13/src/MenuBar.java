import javax.swing.*;

public class MenuBar extends JFrame {
	public MenuBar() {
		setTitle("메뉴바 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Menu();
		setSize(400, 200);
		setVisible(true);
	}

	private void Menu() {
		JMenuBar mb = new JMenuBar();
		JMenu file = new JMenu("파일");
		JMenu edit = new JMenu("편집");
		JMenu find = new JMenu("보기");
		JMenu input = new JMenu("입력");
		JMenu run = new JMenu("인쇄");
		mb.add(file); 
		mb.add(edit);
		mb.add(find);
		mb.add(input);
		mb.add(run);
		
		find.add(new JMenuItem("화면확대"));
		find.add(new JMenuItem("화면축소"));
		find.addSeparator();
		find.add(new JMenuItem("쪽윤곽"));
		
		this.setJMenuBar(mb);
	}

	public static void main(String[] args) {
		new MenuBar();
	}
}
