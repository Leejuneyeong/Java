import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 1. A, B 입력 받기
		System.out.print("A 입력>> ");
		int num1 = sc.nextInt();
		System.out.print("B 입력>> ");
		int num2 = sc.nextInt();
		// 1. A, B 입력 받기
		// 2. 두 숫자가 0인지 아닌지 판단하기
		if(num1==0 && num2==0) {
			break;
		}
	
		// 3. A-B 연산 처리
		System.out.println("결과 >> "+(num1-num2));
		// 반복이 되도록 만들기
		}
	}

}
