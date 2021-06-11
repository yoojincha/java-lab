/*
 
 파일명: PrimeNumber.java
 입력: -
 출력: 가장 작은 소수부터 50개를 10개씩 50줄로 총 50개 출력
 
 이름: 차유진
 소속: 중앙대학교 영어영문학과
 학번: 20151816
 
 [ Report 1 ]
 
 문제 4. 소수 50개 출력하기 
 
 Write a program that displays the first 50 prime numbers
 in five lines, each of which contains 10 numbers.

 */


public class PrimeNumber {

	public static void main(String[] args) {
		
		int[] prime = new int[50]; // 50개의 데이터를 저장할 수 있는 배열 prime 생성 
		int temp = 1; // 조건문을 위해 임시로 설정한 변수 
		int num = 2; // 소수인지 검사를 진행하게 될 숫자에 대한 변수 선언, 1을 빼고 2부터 시작 
		
		for(int i=0; i<50; num++) { // 50개의 소수를 찾아낼때까지 반복하기 위해 임시로 변수 i 선언, 검사할 숫자 num을 1씩 증가하며 반복 
			for(int j= 2; j<=Math.sqrt(num); j++) { // 검사하려는 숫자의 제곱근 만큼 반복, j가 2부터 제곱근일때까지 1씩 커짐  
				if( num%j == 0 ) { // 검사숫자가 j로 나누어 떨어질 경우 -> 1과 자기자신을 제외한 숫자로 나눌 수 있으므로 소수 아님 
					temp = 0; // 밑 조건문에 걸리지 않도록 temp를 0으로 변경 
					break; // break로 인해 반복문에서 빠져나옴 
					}
				}
			if (temp != 0) { // temp가 0으로 바뀌지 않았다면 위 if문에서 나누어 떨어지는 숫자가 없었다는 것이므로 소수 
				prime[i]=num; // i번째 소수! prime 배열의 i번째 자리에 검사한 숫자 num 저장 
				i++; // 다음 소수를 찾았을 때 배열의 올바른 자리에 저장하기 위해 i에 1 증가 
				}
			temp = 1; // 다시 temp를 1로 초기화 
		}
		
		// 모든 50개의 소수를 배열 prime에 저장하였으니, 데이터 10개씩 다섯 줄 출력하기 
		
		for(int i=0; i<50; ) { // 배열 [0]자리에 있는 데이터 부터 [49]까지모두 출력할 때 까지 반복 
			for(int j=0; j<10; j++) { // 열 개의 데이터 출력 후 줄 바꾸기 위한 반복문 
				System.out.print(prime[i]+" "); // 순서대로 데이터 출력 후 띄어쓰기 
				i++; // 다음 데이터 출력을 위해 i 에 1 증가 
			}
			System.out.println(); // 열 개 출력 후 줄 바꿈 
		}
		
	}
}
