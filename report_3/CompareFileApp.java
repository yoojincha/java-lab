/*
 
 파일명: CompareFileApp.java
 입력: 
 출력: 
 
 이름: 차유진
 소속: 중앙대학교 영어영문학과
 학번: 20151816
 
 [ Report 3 ]
 
 문제 4. 파일 비교하기 

 */

import java.io.*;
import java.util.*;

class CompareFiles{
	public static boolean sameContent (File f1, File f2) throws IOException {
	       if(f1.length()!=f2.length())return false; // 길이 비교 후 길이가 다르면 false 리턴 
	       FileInputStream fis1 = new FileInputStream(f1);
	       FileInputStream fis2 = new FileInputStream(f2);
	       try {
	    	   // 한 글자씩 비교 
	           int temp1; 
	           while((temp1 = fis1.read())!= -1) {
	               int temp2 = fis2.read();
	               if(temp1 != temp2) return false;
	           }
	       } finally {
	           fis1.close();
	           fis2.close();
	       }
	       return true;
	}
	
}


public class CompareFileApp {
	
	public static void main(String args[]) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 파일 이름을 입력하세요>> ");
		String a = scanner.next();
		System.out.print("두번째 파일 이름을 입력하세요>> ");
		String b = scanner.next();
		System.out.println(a+"와 "+b+"를 비교합니다.");
		File f1 = new File(a);
		File f2 = new File(b);
		
		// 비교 메소드를 호출하여 리턴 값에 따라 결과를 출력하도록 함 
		if(CompareFiles.sameContent(f2, f2) == true) System.out.print("파일이 같습니다.");
		else System.out.print("파일이 다릅니다.");
		
    }

}
