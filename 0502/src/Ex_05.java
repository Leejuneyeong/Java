import java.util.Random;

public class Ex_05 {

	public static void main(String[] args) {
		// 랜덤수 생성하는 방법
		// Random 클래스 필요!
		
		// 불러올때 import 작업 진행하기!
		Random rd = new Random();
		
		//0~4사이의 숫자 출력하기
		//rd.nextInt(n) -> 0~n-1 범위 생성

		int num = rd.nextInt(5)+1; //1~5까지 랜덤 생성
		
		System.out.println("랜덤수 : "+ num);

	}

}
