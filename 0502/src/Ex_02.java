import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true) {
		System.out.print("첫 번째 정수를 입력하세요>> ");
		int finput = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요>> ");
		int sinput = sc.nextInt();
		
		System.out.print("[1]더하기   [2]빼기>> ");
		int select = sc.nextInt();
		
		int sum = finput+sinput;
		
		int sub = finput<sinput ? sinput-finput : finput-sinput;
		
		if(select == 1) {
			System.out.println("더하기 연산 결과는 "+sum+" 입니다.");
		}else if(select == 2) {
			System.out.println("빼기 연산 결과는 "+sub+" 입니다.");
		}else {
			System.out.println("1번 또는 2번을 선택해주세요.");
		}
		System.out.println();
		System.out.print("다시 실행하시겠습니까? (Y/N) >> ");
		String s = sc.next();
		
		if(s.equals("Y")) {
			continue;
		}else if(s.equals("N")) {
			System.out.println();
			System.out.println("종료되었습니다.");
			break;
		}else {
			System.out.println("잘못 입력하셨습니다. 종료합니다.");
			break;
		}
	}
  }
}