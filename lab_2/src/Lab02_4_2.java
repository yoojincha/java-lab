import java.util.Scanner;

public class Lab02_4_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("정수 3개 입력 >> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a>=b) {
			if(a>=c) {
				if(b>=c) System.out.println("중간값은 "+b);
				else System.out.println("중간값은 "+c);
			}
			else if (a<c) System.out.println("중간값은 "+a);
		}
		else if (a<b) {
			if(b>=c) {
				if(a>=c) System.out.println("중간값은 "+a);
				else System.out.println("중간값은 "+c);
			}
			else if (b<c) System.out.println("중간값은 "+b);
		}
		scanner.close();

	}
	
}
