import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = null;
		
		while(true) {
			System.out.print(">> ");
			sentence = scanner.nextLine();
			
			if(sentence.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			
			StringTokenizer tokens = new StringTokenizer(sentence, " ,.");
			
			int a = tokens.countTokens();
			System.out.println("단어 개수는 " + a);
			while(tokens.hasMoreTokens()) {
				System.out.println(tokens.nextToken());
			}
		}
		scanner.close();
	}
}