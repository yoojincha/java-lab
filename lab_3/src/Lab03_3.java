import java.util.Scanner;

public class Lab03_3 {

	public static void main(String[] args) {
		int money;
			
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >> ");
		money = scanner.nextInt();
		
		System.out.println("50000원짜리: "+(money/50000)+"개");
		money = money%50000;
		System.out.println("10000원짜리: "+(money/10000)+"개");
		money = money%10000;
		System.out.println("5000원짜리: "+(money/5000)+"개");
		money = money%5000;
		System.out.println("1000원짜리: "+(money/1000)+"개");
		money = money%1000;
		System.out.println("500원짜리: "+(money/500)+"개");
		money = money%500;
		System.out.println("100원짜리: "+(money/100)+"개");
		money = money%100;
		System.out.println("50원짜리: "+(money/50)+"개");
		money = money%50;
		System.out.println("10원짜리: "+(money/10)+"개");
		money = money%10;
		System.out.println("5원짜리: "+(money/5)+"개");
		money = money%5;
		System.out.println("1원짜리: "+money+"개");
		
		scanner.close();

	}

}
