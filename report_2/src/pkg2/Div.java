/*
 
 파일명: Div.java
 입력: -
 출력: Calc2.java 파일에 더하기 연산자에 대한 결과값 리턴 
 
 이름: 차유진
 소속: 중앙대학교 영어영문학과
 학번: 20151816

 */

package pkg2;

public class Div {
	int a,b;
	public void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	public double calculate(){
		return (double)a/b;
	}
}
