/*
 
 파일명: Ganji.java
 입력: 60갑자로 계산하고자 하는 년도 
 출력: 입력 받은 년도의 간지 
 
 이름: 차유진
 소속: 중앙대학교 영어영문학과
 학번: 20151816
 
 [ Report 1 ]
 
 문제 2. 60갑자 계산기
 
 년도를 입력받아 60갑자로 무슨 해인지 출력하는 프로그램을 쓰시오
 
 */


import java.util.Scanner;

public class GanjiYear {

	public static void main(String[] args) {
		
		int year; // 사용자에게 입력 받을 년도 
		char gan[] = {'경','신','임','계','갑','을','병','정','무','기'}; // gan 배열에 십간에 대한 10개 데이터 입력
		char ji[] = {'신','유','술','해','자','축','인','묘','진','사','오','미'}; // ji 배열에 십이지에 대한 12개 데이터 입력 
		int i,j; // 간지를 계산할때 사용할 임시 변수 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("년도를 입력하시오 > "); 
		year = scanner.nextInt(); // 계산할 년도를 입력받음 
		
		i = year % 10; // 입력받은 년도를 십간의 개수인 10으로 나눈 나머지 -> 열개 중 몇 번째인지 파악 
		j = year % 12; // 입력받은 년도를 십이지의 개수인 12으로 나눈 나머지 -> 열두개 중 몇 번째인지 파악 
		
		System.out.print(year + "년은 \"");
		System.out.print(gan[i]); // 위에서 구한 i로 십간 중 해당하는 문자 출력 
		System.out.print(ji[j]); // 위에서 구한 j로 십이지 중 해당하는 문자 출력 
		System.out.print("\"년입니다.");
		
		
		scanner.close(); // 스캐너 닫아주기  
	}
}
