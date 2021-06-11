/*
 
 파일명: Calc2.java
 입력: 두 정수와 연산자
 출력: 연산자에 따른 두 정수의 연산 결과 6회 
 
 이름: 차유진
 소속: 중앙대학교 영어영문학과
 학번: 20151816
 
 [ Report 2 ]
 
 문제 2-2. 계산2
 
 다수의 클래스를 만들고 활용하는 연습을 해보자.
 더하기(+), 빼기(-), 곱하기(*) 나누기(/)를 수행하는 각 클래스 Add, Sub, Mul, Div를 만들어라.
 이들은 모두 다음과 같은 필드와 메소드들을 가진다. 
- int 타입의 a, b 필드 : 2개의 피연산자 
- void setValue(int a, int b) : 피연산자 값을 객체 내에 저장
- int calculate() : 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다.
Calc 클래스에 있는 main() 메소드에서는 다음 실행 사례와 같이 두 정수와 연산자를 입력받고
Add, Sub, Mul, Div 중에서 이 연산을 실행할 수 있는 객체를 생성하고 setValue()와 calculate()를 호출하여 출력하도록 작성하라.
For-loop를 이용하여 6번 반복 연산을 수행하도록 하여 아래 실행 결과를 모두 보여줄 수 있도록 하라.
* pkg1 패키지에 Calc 클래스, pkg2 패키지에 Add, Sub, Mul, Div 클래스를 가지도록 작성하라

 */


package pkg1;

import java.util.Scanner;
import pkg2.Add; // pkg2에 있는 연산자 파일들 불러오기
import pkg2.Sub;
import pkg2.Mul;
import pkg2.Div;

public class Calc2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<6;i++) { // 6번 반복
			System.out.print("두 정수의 연산식을 입력하시오(5 + 7) >> ");
			int a = scanner.nextInt(); // 첫 번째 정수 입력 
			char cal = scanner.next().charAt(0); // 연산자 입력 
			int b = scanner.nextInt(); // 두 번째 정수 입력 
	
			if(cal=='+'){ // 입력받은 연산자가 더하기 일 경우 
				Add add = new Add(); // Add 클래스 호출 
				add.setValue(a, b);
				System.out.println(add.calculate());
			}
	        	
	    	else if(cal=='-') { // 입력받은 연산자가 빼기 일 경우 
	    		Sub sub = new Sub(); // Sub 클래스 호출 
	    		sub.setValue(a, b);
	    		System.out.println(sub.calculate());
	    	}
	        	
	    	else if(cal=='*') { // 입력받은 연산자가 곱하기 일 경우 
	    		Mul mul = new Mul(); // Mul 클래스 호출 
	    		mul.setValue(a, b);
	    		System.out.println(mul.calculate());
	    	}
	    	
	    	else if(cal=='/') { // 입력받은 연산자가 나누기 일 경우 
	    		if(b==0) System.out.println("0으로 나눌 수 없습니다."); // 두 번째 입력받은 정수가 0 이면 오류 메세지 표시 
	    		Div div = new Div(); // Div 클래스 호출 
	    		div.setValue(a, b);
	    		System.out.println(div.calculate());
	    	}
	    	
	    	else System.out.println("잘못된 연산자입니다."); // 연산자가 +-*/ 중 하나가 아닐 경우 오류 메세지 표시
		}
	
		scanner.close();
	}

}
