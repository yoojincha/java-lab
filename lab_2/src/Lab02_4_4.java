import java.util.Scanner;

public class Lab02_4_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("연산>> ");
		int x = scanner.nextInt();
		String operator = scanner.next();
		int y = scanner.nextInt();
		
		if (operator.equals("+")==true)
			System.out.println(x + operator + y +"의 계산 결과는 "+(x+y));
		else if (operator.equals("-")==true)
			System.out.println(x + operator + y +"의 계산 결과는 "+(x-y));
		else if (operator.equals("*")==true)
			System.out.println(x + operator + y +"의 계산 결과는 "+(x*y));
		else if ((operator.equals("/")==true) && (y!=0))
			System.out.println(x + operator + y +"의 계산 결과는 "+(x/y));
		else if ((operator.equals("/")==true) && (y==0))
			System.out.println("0으로 나눌 수 없습니다.");
		else System.out.println("ERROR");
	
		scanner.close();
	}

}
