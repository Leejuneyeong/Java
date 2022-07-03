import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {

		// 1. 두 개의 정수 입력받기(int)
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 입력 >> ");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수 입력 >> ");
		int num2 = sc.nextInt();

		// 2. 연산자 입력 받기(String)

		System.out.print("연산자 입력(+,-,*,/) >> ");
		String op = sc.next();

		// 3. 연산에 따라 각각 다른 메소드를 호출할 수 있도록 만든다
		// - 메소드 선언 작업 진행하기
		// - 각 메소드에 따른 작업처리 작성하기

		// 메소드의 결과값을 담을 수 있는 변수 선언!

		int result = 0;

		if (op.equals("+")) {
			// 더하기에 관련된 메소드 호출!
			result = add(num1, num2);
		} else if (op.equals("-")) {
			// 빼기에 관련된 메소드
			result = sub(num1, num2);
		} else if (op.equals("*")) {
			// 곱하기
			result = mul(num1, num2);
		} else {
			// 나누기(몫)
			result = div(num1, num2);
		}
		System.out.println("결과값 : " + result);
	}

	// 매개변수 : 함수에서만 사용이 가능한 변수 -> x값 -> 재료값 / 입력값
	public static int add(int num1, int num2) {

		return num1 + num2;
	}

	public static int sub(int num1, int num2) {

		return num1 > num2 ? num1 - num2 : num2 - num1;
		// 삼항연산자 = 조건 ? 참 : 거짓
	}

	public static int mul(int num1, int num2) {

		return num1 * num2;
	}

	public static int div(int num1, int num2) {

		if (num1 == 0 && num2 == 0) {
			return 0;
		}
		
		return num1 > num2 ? num1 / num2 : num2 / num1;
		// 삼항연산자 = 조건 ? 참 : 거짓
	}

}
