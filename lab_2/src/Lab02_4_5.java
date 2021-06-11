import java.util.Scanner;

public class Lab02_4_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("연산>> ");
		double x = scanner.nextDouble();
		String operator = scanner.next();
		double y = scanner.nextDouble();
		
		switch (operator) {
		case "+": 
			System.out.println(x + operator + y +"의 계산 결과는 "+(x+y));
			break;
		case "-":
			System.out.println(x + operator + y +"의 계산 결과는 "+(x-y));
			break;
		case "*":
			System.out.println(x + operator + y +"의 계산 결과는 "+(x*y));
			break;
		case "/":
			if(y!=0) System.out.println(x + operator + y +"의 계산 결과는 "+(x/y));
			else if (y==0) System.out.println("0으로 나눌 수 없습니다.");
			break;
		default:
			System.out.println("ERROR");
		}
		
		scanner.close();
	}

}
