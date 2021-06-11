/*
 
 파일명: Count.java
 입력: -
 출력: 문자, 단어, 문장 개수 
 
 이름: 차유진
 소속: 중앙대학교 영어영문학과
 학번: 20151816
 
 [ Report 3 ]
 
 문제 2. 문자,단어,문장 개수 세기

 */

import java.io.*;

public class Count {
	public static void main(String[] args) {
		String[] wordArray = null;
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		String temp = "";
		int countSentence = 0; // 문장 개수 
		int countWord = 0; // 단어 개수 
		int countLetter = 0; // 문자 개수 
	
		try {
			
			fr = new FileReader("input2.txt"); // 읽어올 파일 
			fw = new FileWriter("output.txt",false); // 쓸 파일 
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			while((temp= br.readLine()) != null){ // 각 줄을 읽어 temp에 임시 저장 
				wordArray = temp.split(" "); // 띄어쓰기를 기준으로 분리해 word 배열에 저장 
				countWord += wordArray.length; // countWord에 누적하여 더함
				for(int i = 0;i<wordArray.length;i++) {
					countLetter += wordArray[i].length(); // 각 문자를 누적하여 더함 
				}
				
				for(int i = 0;i<wordArray.length;i++) { //.?!로 끝나는 단어의 수 계산 
					if(wordArray[i].endsWith(".")||wordArray[i].endsWith("?")||wordArray[i].endsWith("!")) {
						countSentence++;
					}
				}
			}
			String output = "문자 수는 " + countLetter + "개 입니다.\n"
					+ "단어 수는 " + countWord + "개 입니다.\n"
					+ "문장 수는 " + countSentence + "개 입니다.\n";
			bw.write(output); // 결과를 output 파일로 쓰고 출력 
			System.out.println(output);
		}
		catch (IOException e) {
			System.out.println("파일 입출력 오류");
		}
		finally {
			if(br != null) try{br.close();}catch(IOException e){}
			if(fr != null) try{fr.close();}catch(IOException e){}
			
			if(bw != null) try{bw.close();}catch(IOException e){}
			if(fw != null) try{fw.close();}catch(IOException e){}

		}
	}
	
}
