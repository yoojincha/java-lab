
import java.io.*;
import java.util.*;

public class FileMerge {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        FileReader first = null;
        FileReader second = null;
        FileWriter merged = null;
        
        try {
        	int c;
        	System.out.print("첫번째 파일이름을 입력하세요 >> ");
        	first = new FileReader(scanner.next());
        	System.out.print("두번째 파일이름을 입력하세요 >> ");
        	second = new FileReader(scanner.next());
        	merged = new FileWriter("append.txt");
            while((c = first.read())!=-1){
            	merged.write(c);
            }
            while((c = second.read())!=-1){
            	merged.write(c);
            }
            System.out.print("프로젝트 폴더 밑에 append.txt 파일을 생성합니다.");

            first.close();
            second.close();
            merged.close();
        }
        catch (IOException e) {
            System.out.println("파일 입출력 오류");
        }
    }
}
