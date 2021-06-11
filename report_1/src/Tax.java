/*
 
 파일명: Tax.java
 입력: 소득 금액
 출력: 소득세 및 지방소득세
 
 이름: 차유진
 소속: 중앙대학교 영어영문학과
 학번: 20151816
 
 [ Report 1 ]
 
 문제 1. 종합소득 세율 계산
 
 아래 종합소득 세율표에 있는 2020년 귀속 종합소득세율표를 참고하여 소득 금액별 세부담(소득세, 지방소득세)를 계산하시오.
 
 */


import java.util.Scanner;

public class Tax {
	
	public static void main(String[] args) {
		int income; // 입력받을 소득금액 (천원 단위로 입력받기 때문에 int형으로)
		double income_tax; // 출력할 소득세 (밑에서 소수와 곱해야 하기 떄문에 double형으로)
		double region_tax; // 출력할 지방소득세 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("소득금액을 천원 단위로 입력하시오 > ");
		income = scanner.nextInt(); // income 변수에 소득금액 입력받기  
		
		if(income>=0) { // 소득 입력 받을 때 0 이상이 되어야 함. 0보다 크거나 같은 정수가 아닐 경우 else로 넘어감  
			
			if(income<=12000) { // 소득금액이 12000천원(1천2백만원) 이하일 경우  
				income_tax = income*0.06; // 소득세 = 소득금액의 6% 
				region_tax = income_tax*0.1; // 지방소득세 = 소득세의 10%
				}
			else if(income>12000 && income<=46000) { // 소득금액이 1천2백만원 초과, 4천6백만원 이하일 경우 
				income_tax = income*0.15 - 1080; // 소득세 = 소득금액의 15% 
				region_tax = income_tax*0.1; // 지방소득세 = 소득세의 10%
				}
			else if(income>46000 && income<=88000) { // 소득금액이 4천6백만원 초과, 8천8백만원 이하일 경우 
				income_tax = income*0.24 - 5220; // 소득세 = 소득금액의 24%
				region_tax = income_tax*0.1; // 지방소득세 = 소득세의 10%
				}
			else if(income>88000 && income<=150000) { // 소득금액이 8천8백만원 초과, 1억5천만원 이하일 경우 
				income_tax = income*0.35 - 14900; // 소득세 = 소득금액의 35%
				region_tax = income_tax*0.1; // 지방소득세 = 소득세의 10%
				}
			else if(income>150000 && income<=300000) { // 소득금액이 1억5천만원 초과, 3억원 이하일 경우 
				income_tax = income*0.38 - 19400; // 소득세 = 소득금액의 38%
				region_tax = income_tax*0.1; // 지방소득세 = 소득세의 10%
				}	
			else if(income>300000 && income<=500000) { // 소득금액이 3억원 초과, 5억원 이하일 경우 
				income_tax = income*0.40 - 25400; // 소득세 = 소득금액의 40%
				region_tax = income_tax*0.1; // 지방소득세 = 소득세의 10%
				}
			else {  // 소득금액이 5억원 초과일 경우 
				income_tax = income*0.42 - 35400; // 소득세 = 소득금액의 42%
				region_tax = income_tax*0.1; // 지방소득세 = 소득세의 10%
				}
			
			System.out.print(income + "천원의 소득세는 " + income_tax + "천원이고, 지방세는 " + region_tax + "천원 입니다.");
			// 입력받은 소득금액에 대한 소득세와 지방소득세를 출력 
		}
		
		else System.out.print("입력한 금액이 잘못됐습니다."); // 위에서 입력받은 숫자가 0보다 크거나 같은 정수가 아닐 경우 출력 
		
		
		scanner.close(); // 스캐너 닫아주기 
		
	}
	
}