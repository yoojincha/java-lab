/*
 
 파일명: CountWordEx.java
 입력: 검색하려는 알파벳 또는 exit 
 출력: input의 알파벳으로 시작하거나 끝나는 단어와 그 개수 
 
 이름: 차유진
 소속: 중앙대학교 영어영문학과
 학번: 20151816
 
 [ Report 3 ]
 
 문제 1. 단어 검색 프로그램 

 */

import java.util.*;
import java.io.*;

public class CountWordEx {
	public static void main(String[] args) {
		System.out.println("단어들의 배열을 1줄에 7개의 단어씩 나열합니다.");
		System.out.println("***************************************************************");
		CountWord.makeWordArray(); // 배열 생성 메소드 호출 
		System.out.println("***************************************************************");
		System.out.println();
		
		while(true) {
			System.out.println("특정 문자로 시작하거나 끝나는 단어를 검색합니다.");
			System.out.print("검색하려는 문자를 입력하시오. 종료하려면 \"exit\"를 입력하시오 >> ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.next(); // 검색 할 문자 입력 
			if(input.equals("exit")) break; // exit 입력시 반복문 빠져나옴 
			boolean head = true;
			boolean tail = false;
			//CountWord.countCWord(input, head);
			//CountWord.countCWord(input, tail);
		}
	}
}


class CountWord implements CountWordInterface {
	
	public static int j = 0;
	public static String[] wordArray = null;
	public static FileReader fr = null;
	public static BufferedReader br = null;
	public static String temp = "";
	
	public static void makeWordArray() { // 배열 생성 메소드 
		
		try {
			
			fr = new FileReader("input.txt"); // 프로젝트 파일과 같은 폴더 안에 있는 파일이어야 함 
			br = new BufferedReader(fr);
			
			while((temp= br.readLine()) != null){ // 한 줄씩 읽어옴 
				// 알파벳이 아닌 문자들을 띄어쓰기로 대체하거나 제거함 
				temp = temp.replaceAll("-", " ");
				temp = temp.replaceAll(",", " ");
				temp = temp.replaceAll("\n", " ");
				temp = temp.replaceAll("\t", "");
				temp = temp.replaceAll("  ", " ");
				temp = temp.replaceAll("\\s", " ");
				temp = temp.replaceAll("\\.", " ");
				temp = temp.replaceAll("\\(", "");
				temp = temp.replaceAll("\\)", "");
				
				wordArray = temp.split(" "); // 띄어쓰기가 된 부분을 기준으로 split하여 배열에 저장 
				
				CountWord.printWordArray(wordArray); // 출력 메소드 호출 
				
				
			}
		}
			
		catch (IOException e) {
			System.out.println("파일 입출력 오류");
		}
	}
	
	
	public static void printWordArray(String[] wordArray) { // 출력 메소드 
		
		for(int i = 0;i<wordArray.length; i++) {
			System.out.print(wordArray[i]+" ");
			j++; // 0으로 초기화 해 둔 j의 값이 7의 배수가 되면 줄을 바꿈
			if(j%7==0) System.out.println();
		}
		
	}
	
	
	/*public static int  countCWord(String c, boolean head) {
		for(int i=0;i)
		System.out.println(wordArray[].startsWith(c) );
		// head == true 이면 c로 시작하는 단어
        //      == false 이면 c로 끝나는 단어 
        // 총 개수 구하여 리턴
		
		return 0;
	}*/
}