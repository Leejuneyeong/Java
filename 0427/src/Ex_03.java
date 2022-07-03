import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		
		// 사용자에게 num에 들어갈 데이터 값 받아오기
		// 데이터를 입력하는 방법 -> 마우스,키보드,음성
		
		// 키보드를 사용할 수 있는 기능을 불러오자->Scanner
		// Scanner 불러오기 -> import 작업(★★★★★)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		//int num = 528;
		//Scanner를 통하여 변수 num에 데이터값 저장하기
		
		int num = sc.nextInt();
		// 백의0 자리 이하의 숫자 버리기
		// 1. 현재 내가 가지고 있는 숫자로 부터 백의 자리 위치를 알아야한다
		
		int a = num/100;
		
		int result = a*100;
		// a=4;
		
		System.out.println("결과 : "+result);
	}

}
