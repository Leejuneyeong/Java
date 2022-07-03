import java.util.Random;
import java.util.Scanner;

public class Ex_06 {
	public static void main(String[] args) {
		// 랜덤수를 만들기 위한 Random클래스 불러오기
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		// 랜덤수 2개 생성하기 (1~20)
		int num1 = rd.nextInt(20) + 1;
		int num2 = rd.nextInt(20) + 1;

		System.out.println("==Plus Game==");

		// 문자열의 초기값 설정 = "";
		String ans = "";

		// 반복의 시작
		do {
			System.out.print(num1 + "+" + num2 + "=");
			int result = sc.nextInt();

			// 입력된 result가 정답인지 아닌지 판단!
			if (num1 + num2 == result) {
				System.out.println("Success");

				// 새로운 문제를 위하여 랜덤수 재생성!
				num1 = rd.nextInt(20) + 1;
				num2 = rd.nextInt(20) + 1;
			} else {
				System.out.println("Fail");
			}

			// 반복의 여부 확인하기
			System.out.print("계속하시겠습니까? >> ");
			ans = sc.next();

		} // 반복의 종료 (do의 영역 종료)
		while (!ans.equals("N"));
		System.out.println("종료합니다.");
		// == / !=
		// .equals() / !변수.equals()
	}
}