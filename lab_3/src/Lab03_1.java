import java.util.Scanner;

public class Lab03_1 {

	public static void main(String[] args) {
		int random;
		int input=-1;
		random = (int)(Math.random()*100)+1;
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100");
		System.out.println();
			
		while(input!=random) {
			System.out.print("Enter your guess: ");
			input = scanner.nextInt();
				
			if(input>random) {
				System.out.println("Your guess is too high");
			}
			else if(input<random) {
				System.out.println("Your guess is too low");
			}
			else {
				System.out.println("Yes, the number is " + random);
				break;
			}
				
		}
		scanner.close();

	}

}
