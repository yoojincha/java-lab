
import java.io.*;
import java.util.*;

public class FileCopy {
	public static void main(String[] args) {

		BufferedInputStream srcStream = null;
		BufferedOutputStream destStream = null;
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 파일과 출력 파일을 입력하시오 >> ");
		String a = scanner.next();
		String b = scanner.next();
		File srcFile = new File(a);
		File destFile = new File(b);
		
		try {
			srcStream = new BufferedInputStream(new FileInputStream(srcFile));
			destStream = new BufferedOutputStream(new FileOutputStream(destFile));
			
			int done = 0;
			int count = 0;
			byte[] buf = new byte[1024];
			
			System.out.println("a.jpg를 b.jpg로 복사합니다.");
			System.out.println("10%마다 *를 출력합니다.");
			
			while(true){
				count = srcStream.read(buf, 0, buf.length);
				if(count == -1) {
					if(done > 0) {
						System.out.print("*");
					}
					break;
				}
				if(count>0)
					destStream.write(buf,0,count);
				
				done+=count;
				if(done >= (srcFile.length()/10)) {
					System.out.print("*");
					done = 0;
				}
			}
           	srcStream.close();
           	destStream.close();
		}
		catch (IOException e){
			System.out.println("입출력 오류가 발생했습니다.");
		}
	}
}