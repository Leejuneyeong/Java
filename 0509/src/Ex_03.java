import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {

		// 사용자로부터 두개의 정수를 입력 받아
		// 해당하는 정수를 더하기 연산 하는 메소드를 사용해 보자!

		// 1. 두 개의 정수 입력받기

		// 2. addNum() 함수에 매개변수 값으로 입력 받은 정수 연결하기

		// 3. addNum() 메소드를 정의!
		// - 두개의 정수에 대하여 더하기 연산을 진행하고
		// - 메소드를 호출한 곳으로 결과값 리턴하기!

		// 보너스 문제
		// - 연산자 입력 받기
		// - 해당하는 연산자를 처리해 줄 수 있는 메소드 만들기
		// + -> addNum()
		// - -> divNum()
		// *
		// /

		// 선택한 연산에 따른 메소드 진행!
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 정수 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력하세요 : ");

		String op = sc.next();

		switch (op) {
		case "+":
			System.out.println("더하기 결과 : " + addNum(num1, num2));
			break;
		case "-":
			System.out.println("빼기 결과 : " + subNum(num1, num2));
			break;
		case "*":
			System.out.println("곱하기 결과 : " + mulNum(num1, num2));
			break;
		case "/":
			System.out.println("나누기 결과 : " + divNum(num1, num2));
			break;
		default:
		}
	}

	public static int addNum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	public static int subNum(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}

	public static int mulNum(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	public static int divNum(int num1, int num2) {
		int result = num1 / num2;
		return result;
	}

}
