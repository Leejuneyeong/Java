import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		// 1. Scanner 기능
		Scanner sc = new Scanner(System.in);
		// 2. int타입의 변수 age 선언
		int age=0;
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		// 3. age가 20보다 크거나 같은지 판단 (판단->조건문 사용)
		// - 조건에 해당했을 시 "성인입니다." 출력
		if(age>=20) {
			System.out.println("성인입니다.");
		}
		else {
			System.out.println("미성년자 입니다.");
		}
		
	}

}
