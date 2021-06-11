import java.util.Scanner;

class DicApp {
	
	private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String [] eng = {"love","baby","money","future","hope"};
	
	public DicApp() {
	}
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length;i++) {
			if(word.equals(kor[i])) {
				if(word.equals(kor[0])||word.equals(kor[2])||word.equals(kor[4])) {
					return(word+"은 "+eng[i]+"\n");
				}
				else return(word+"는 "+eng[i]+"\n");
				}
			}
		return("잘못된 입력입니다.\n");
		}
	}

public class Dictionary {
	
	public static void main(String[] args) {
		System.out.println("한영 단어 검색 프로그램입니다.");
		Scanner scanner = new Scanner(System.in);
			
		while(true) {
			System.out.print("한글 단어> ");
			String temp =  scanner.next();
				
			if(temp.equals("그만")) {
				break;
			}
			else {
				System.out.print(DicApp.kor2Eng(temp));
			}
		}
		scanner.close();
	}
}
