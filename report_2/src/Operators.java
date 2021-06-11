/*
 
 파일명: Operators.java
 입력: -
 출력: Calc.java 파일에 각 연산자 클래스의 결과값 리턴 
 
 이름: 차유진
 소속: 중앙대학교 영어영문학과
 학번: 20151816

 */


class Add {
	int a,b;
	void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	int calculate(){
		return a+b;
	}
}
	
class Sub {
	int a,b;
	void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	int calculate(){
		return a-b;
	}
}
	
class Mul {
	int a,b;
	void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	int calculate(){
		return a*b;
	}
}
	
class Div {
	int a,b;
	void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	double calculate(){
		return (double)a/b;
	}
}
