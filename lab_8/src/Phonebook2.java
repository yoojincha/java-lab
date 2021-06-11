import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.*;

public class Phonebook2{
	public static void main(String[] args) {
		FileWriter fw = null;
		File f = new File("C:\\temp\\phone.txt");
		try {
			fw = new FileWriter(f);
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("전화번호를 입력 하시오…");
			System.out.println(f+"에 저장합니다.");
			while(true) {
				System.out.print("이름 전화번호>> ");
				String line = scanner.nextLine();
				if(line.isEmpty())
						break;
				fw.write(line+"\n");
			}
			System.out.println();
			
			scanner.close();
			fw.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		FileReader fr = null;
		try {
			fr = new FileReader(f);
			System.out.println(f+"를 출력합니다…");
			while(true) {
				int c = fr.read();
				if(c == -1)
					break;
				System.out.print((char)c);
			}
			fr.close();

			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}