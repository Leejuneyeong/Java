import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		// 스캐너 사용하는 방법
		// 1. Scanner 도구 불러오기 -> import
		// import 단축키 : crtl + shift + 'o(문자)';
		Scanner sc = new Scanner(System.in);
		
		// 2. 입력받는 데이터의 형태에 따라 next~~결정하기
		String word = sc.next(); // 여려개의 문자열 입력 받을 때
		int num = sc.nextInt(); // 정수형 받을 때
		double num2 = sc.nextDouble(); // 실수형 받을 때
		
	}

}
