/*
 
 파일명: Rectangle.java
 입력: -
 출력: 배열에 저장된 사각형 1,2,3 각각에 대한 넓이와 둘레 
 
 이름: 차유진
 소속: 중앙대학교 영어영문학과
 학번: 20151816
 
 [ Report 2 ]
 
 문제 1. 사각형의 넓이와 둘레
 
 사각형을 나타내는 Rectangle 클래스를 작성하라. 
- 사각형의 가로와 세로를 위한 double 자료형 변수 width, height, 각 디폴트 값은 1 이다.
- 사각형의 색깔을 위한 문자열 데이터 필드 color, 디폴트 값은 “white”
- 디폴트 값의 사각형을 위한 무인자 생성자
- 주어진 가로와 세로의 사각형을 위한 생성자
- 주어진 하나의 길이(가로와 세로로 사용)의 사각형을 위한 생성자
- 사각형의 면적을 계산하는 getArea() 메소드
- 사각형의 둘레의 길이를 계산하는 getPerimeter() 메소드

①	Rectangle 객체 배열(크기 3)을 선언하고, 세가지 다른 생성자를 호출하여 객체가 생성되도록 한다.
②	생성자 함수에서 다른 생성자 호출이 되도록 this()를 이용한다.
③	getArea() 메소드, getPerimeter() 메소드를 호출하여 사각형의 면적과 둘레를 출력한다.

 */

public class Rectangle {
	double width;
	double height;
	String color;
	
	public Rectangle() { // 아무런 값이 없는 경우 
		this(1,1,"white"); // 디폴트 값 지정
	}
	
	public Rectangle(double width, String color) { // 숫자 하나, 색상만 입력 받은 경우 
		this(width, width, color); // 가로와 세로가 같은 정사각형 
	}
	
	public Rectangle (double width, double height, String color) { // 가로, 세로, 색깔 각각 지정받은 경우 
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	public double getArea(){ // 넓이 = 가로 * 세로  
		return height * width;
	}
	
	public double getPerimeter(){ // 둘레 = 가로 * 2 + 세로 * 2
		return width*2 + height*2;
	}
	
	public static void main(String[] args) { // 메인 메소드 
		
		Rectangle [] rectangle = new Rectangle[3]; // 공간이 세 개인 객체 배열 생성 
		
		rectangle[0] = new Rectangle(3, 5, "black"); // 사각형 1: 가로 3, 세로 5, 색깔 black 
		rectangle[1] = new Rectangle(4, "red"); // 사각형 2: 가로 4, (세로 생략 => 가로와 동일하게 4), 색깔 red 
		rectangle[2] = new Rectangle(); // 값을 따로 지정하지 않음 => 디폴트 값 (가로 1, 세로 1, 색깔 white)
		
		for(int i=0; i<3; i++) { // 사각형 세 개 출력하기 위해 세 번 반복 
			double area = rectangle[i].getArea(); // i번째 사각형 객체에 대한 면적 가져오기 
			System.out.println((i+1)+"번 사각형("+rectangle[i].width+", "+rectangle[i].height+", "+rectangle[i].color+")의 면적: "+area);
			double perimeter = rectangle[i].getPerimeter(); // i번째 사각형 객체에 대한 둘레 가져오기 
			System.out.println((i+1)+"번 사각형("+rectangle[i].width+", "+rectangle[i].height+", "+rectangle[i].color+")의 둘레: "+perimeter);
			System.out.println();
		}
	
	}
	
}
