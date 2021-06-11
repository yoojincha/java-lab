import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class SaveImage extends JFrame {
	public JLabel imgLabel = new JLabel();
	
	public SaveImage() {
		setTitle("메뉴로 배경 이미지 로딩하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CreateMenu();
		getContentPane().add(imgLabel, BorderLayout.CENTER);
		setSize(400, 400);
		setVisible(true);
	}
	
	private void CreateMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem [] menuItem = new JMenuItem [2];
		String[] itemTitle = {"열기", "저장"};
		JMenu file = new JMenu("파일");
		
		MenuActionListener listener = new MenuActionListener();
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			file.add(menuItem[i]);
		}
		mb.add(file); 
		setJMenuBar(mb);
	}
	
	class MenuActionListener implements ActionListener{
		public JFileChooser chooser;
		
		public MenuActionListener() {
			chooser = new JFileChooser();
		}
		
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			
			switch(cmd) {
			
			case "열기" :
				if(imgLabel.getIcon() != null)
					return;
				FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Imgaes", "jpg", "gif");
				chooser.setFileFilter(filter);
				int ret = chooser.showOpenDialog(null);
				
				if(ret != JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다", "경고", JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				String filePath = chooser.getSelectedFile().getPath();
				imgLabel.setIcon(new ImageIcon(filePath));
				pack();
				break;
				
			case "저장" :
				ret = chooser.showSaveDialog(null);
				filePath = chooser.getSelectedFile().getPath();
				String fileName = chooser.getSelectedFile().getName();
				
				break;
			}
		}
	}

	public static void main(String[] args) {
		new SaveImage();
	}
	
}
