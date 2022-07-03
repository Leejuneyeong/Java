import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~3 사이의 숫자 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("1입니다.");
			break;
			
		case 2 :
			System.out.println("2입니다.");
			break;
		
		case 3 :
			System.out.println("3입니다.");
			break;
		
		default:
			System.out.println("잘못된 값입니다.");
			break;
		}
	}

}
