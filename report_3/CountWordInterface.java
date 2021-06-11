import java.io.*;

public interface CountWordInterface {
	public static void makeWordArray(FileReader fr) {
	}  // 단어들의 배열 생성
	public  static void printWordArray(String[] wordArray) {
	} // 단어들의 배열 출력
	public static int  countCWord(String c, boolean head) {
		return 0;
	} 
                                 // head == true 이면 c로 시작하는 단어
                                 //      == false 이면 c로 끝나는 단어 
                                 // 총 개수 구하여 리턴

}
