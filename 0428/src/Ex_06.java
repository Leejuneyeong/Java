import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		
		// switch 조건문 사용하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		// 짝수인지 홀수인지 판단하기
		
		switch(num%2) {
		
		case 0 : 
			//짝수에 해당하는 명령 진행
			System.out.println(num+"은 짝수 입니다.");
		    break;
		
		case 1:
			System.out.println(num+"은 홀수 입니다.");
			break;
			
		default:
		break;
		}
			
	}

}
