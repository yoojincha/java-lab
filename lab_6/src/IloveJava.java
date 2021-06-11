import java.util.Scanner;

public class IloveJava {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = null;
		
		while(true) {
			System.out.print(">> ");
			a = scanner.nextLine();
			
			if(a.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			
			String b [] = a.split(" ");
			System.out.println("단어 개수는 " + b.length);
			for(int i =0; i<b.length; i++) {
				System.out.println(b[i]);
			}
		}
		scanner.close();
	}
}