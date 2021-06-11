/*
 
 파일명: IrregularArray.java
 입력: 배열 행의 개수, 열의 개수 및 각 열에 저장할 데이터 
 출력: 비정방형 배열 
 
 이름: 차유진
 소속: 중앙대학교 영어영문학과
 학번: 20151816
 
 [ Report 1 ]
 
 문제 3. 비정방형 2차원 배열 출력하기  
 
 불규칙한 비정방형 2차원 배열을 생성하여 정수를 입력 받아 저장하려고 한다. 
 아래 실행 예를 참고하여 동일한 결과를 나오도록 프로그램을 쓰시오.
 열의 개수와 데이터 입력시 첫번째 정수는 열의 크기를 의미하고 두번째 정수부터는 데이터이다.
 비정방형 배열의 출력 결과를 나타낼 때는 while 문과 for-each 문을 이용하여 출력하시오.

 */


import java.util.Scanner;

public class IrregularArray {

	public static void main(String[] args) {
		
		int row, column; // 행과 열 변수 선언 
		
		System.out.println("배열의 정보를 입력하시오.");
		Scanner scanner = new Scanner(System.in); // 스캐너 생성 
		System.out.print("행의 개수 > "); 
		row = scanner.nextInt(); // 행의 개수 입력받기 
		
		int array[][] = new int[row][]; // 입력받은 row를 통해 row개 만큼의 행이 있는 이차원 배열 만들어줌 
		
		System.out.println("열의 개수와 데이터를 입력하시오 > "); 
		
		for(int i=0;i<row;i++) { // 이하를 첫번째 행부터 마지막 행까지, 행의 개수 만큼 반복할 것 
			column = scanner.nextInt();  // 해당 행의 열의 개수 입력받기 
			array[i]=new int[column]; // 해당 행에 입력받은 column을 통해 column개 만큼의 열 공간을 만들어줌 
			for(int j=0;j<column;j++) { // 이하를 위에서 입력받은 column의 개수 만큼 반복할 것 
				array[i][j] = scanner.nextInt(); // 해당 열의 각 행에 저장할 데이터를 순서대로 입력받음 
			} 
		}
		
		int i=0; // 임시변수
		
		while(i<array.length) { // 위 배열 행의 개수만큼 반복 
			for(int x : array[i]) { // for-each 문을 통해 각 행의 데이터 출력하기 
				System.out.print(x);
				System.out.print(" ");
			}
			System.out.println(); // 한 행의 출력을 마칠 때마다 줄 넘김 
			i++; // 다음 행으로 넘어감 
		}
		
		scanner.close(); // 스캐너 닫아주기 

	}

}
