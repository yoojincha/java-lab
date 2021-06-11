/*
 
 파일명: PrintLine.java
 입력: 검색할 단어 또는 문장 
 출력: 입력한 단어 또는 문장이 포함된 문장과 문장 번호 
 
 이름: 차유진
 소속: 중앙대학교 영어영문학과
 학번: 20151816
 
 [ Report 3 ]
 
 문제 3. 단어를 포함한 문장 찾기 

 */

import java.io.*;
import java.util.*;

public class PrintLine {
	public static void main(String[] args) {
		String searchWord = null;
		FileReader fr = null;
		BufferedReader br = null;
		String temp = "";
		Scanner scanner = new Scanner(System.in);

		int i;
		System.out.println("전체 경로명이 아닌 파일명만 입력하는 경우, 파일은 프로젝트 폴더 안에 있어야 합니다.");
		try {
			System.out.print("대상 파일명 입력 >> ");
			String filename = scanner.nextLine();
			
			while(true) {
				i=0;
				System.out.print("검색할 단어나 문장>> ");
				
				searchWord = scanner.nextLine(); // nextLine을 통해 공백이 있는 검색어도 통으로 검색 가능하도록 함 
				if(searchWord.equals("exit?")) { // exit? 을 입력할 경우 반복문에서 빠져나옴 
					System.out.print("프로그램을 종료합니다.");
					break;
				}
				fr = new FileReader(filename);
				br = new BufferedReader(fr);
				
				while((temp= br.readLine()) != null) {
					if(temp.contains(searchWord)) { // 검색한 단어를 포함하는 문장을 출력함 
						System.out.println(i+": "+temp);
					}
					i++; // 각 줄을 읽을때마다 증가하여 줄의 번호를 부여 
				}
			}
			
		}
		catch (IOException e) {
			System.out.println("파일 입출력 오류");
		}
		finally {
			if(br != null) try{br.close();}catch(IOException e){}
			if(fr != null) try{fr.close();}catch(IOException e){}
		}
		
		
	}
}