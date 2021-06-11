import java.util.Scanner;

class Add {
	int a,b;
	void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	int calculate(){
		return a+b;
	}
}

class Sub {
	int a,b;
	void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	int calculate(){
		return a-b;
	}
}

class Mul {
	int a,b;
	void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	int calculate(){
		return a*b;
	}
}

class Div {
	int a,b;
	void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	double calculate(){
		return (double)a/b;
	}
}


public class Calculator {
 
    public static void main(String[] args) {
    	
        System.out.print("두 정수를 입력하세요 >> ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b =scanner.nextInt();
        
        for(int i=0;i<4;i++) {
        	System.out.print("두 정수의 연산식을 입력하시오("+a+" "+b+") >> ");
        	
        	char cal = scanner.next().charAt(0);
        	
        	switch(cal){
        	
        	case '+':
        		Add add = new Add();
        		add.setValue(a, b);
        		System.out.println(add.calculate());
        		break;
        	
        	case '-':
        		Sub sub = new Sub();
        		sub.setValue(a, b);
        		System.out.println(sub.calculate());
        		break;
        	
        	case '*':
        		Mul mul = new Mul();	
        		mul.setValue(a, b);
        		System.out.println(mul.calculate());
        		break;
        	
        	case '/':	
        		Div div = new Div();
        		div.setValue(a, b);
        		System.out.println(div.calculate());
        		break;
        	}
        }
        scanner.close();
    }
}

