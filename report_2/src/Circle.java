/*
 
 파일명: Circle.java
 
 이름: 차유진
 소속: 중앙대학교 영어영문학과
 학번: 20151816
 
 [ Report 2 ]
 
 문제 4. 인터페이스의 활용 
 
 main()메소드의 실행결과를 참고하여 인터페이스 Shape을 구현한 클래스 Circle을 작성하고, 전체 프로그램을 완성하시오.
 
 */

public class Circle implements Shape { // Shape 인터페이스를 상속받음 
	private int radius;
	   public Circle(int radius) {
	      this.radius = radius; // 메인 메소드에서 받게될 값
	   }
	   public void draw() { 
	      System.out.println("반지름이 "+radius+"인 원입니다.");
	   }
	   public double getArea() { // 면적 구하기 
	      return PI*radius*radius; // Shape 인터페이스에 PI값이 저장되어있으므로 그대로 상속받음 
	   }
}
