package 자바페스티벌;

public class Ex_bonus03 {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 15;
		char op ='-';
		
		System.out.println(cal(num1,num2,op));
	}
	
	public static int cal(int num1, int num2, char op) { 
		int a = num1;
		int b = num2;
		char c = op;
		int result = 0;
		switch(op) {
		case '+': 
			result = a+b;
			break;
		case '-': 
			result = a>b?a-b:b-a;
			break;
		case '*': 
			result = a*b;
			break;
		case '/': 
			result = a/b;
			break;
		}
		return result;

	}

}
