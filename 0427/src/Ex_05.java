import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수입력 : ");
		int num2 = sc.nextInt();
		
		int sum = num1+num2;
		int sub = num1-num2;
		int mul = num1*num2;
		int div = num1/num2;
		
		System.out.println("두 수의 더하기 : "+sum);
		System.out.println("두 수의 빼기 : "+sub);
		System.out.println("두 수의 곱하기 : "+mul);
		System.out.println("두 수의 나누기(몫) : "+div);
		
		}

}
