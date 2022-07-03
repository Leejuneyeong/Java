import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		
		// 다중 if문 -> 여러개의 조건을 만들어서 판단!
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age=sc.nextInt();
		
		/*if(age>=30) {
			System.out.println("30대 입니다.");
		}else if(age>0 && age>=20) {
			System.out.println("20대 입니다.");
		}else if(age>=10) {
			System.out.println("10대 입니다.");
		}else {
			System.out.println("어린이 입니다.");
		}
		System.out.println("프로그램 종료");
		*/
		// 중첩 if문 -> 여러개의 조건을 중복해서 판단!
			
		if(age>=30) {
			System.out.println("30대 입니다.");
		}
		
		if(age<=30 && age>=20) {
			System.out.println("20대 입니다.");
		}
		
		if(age<=20 && age>=10) {
			System.out.println("10대 입니다.");
		}
		
		if(age<=0 && age>=0) {
			System.out.println("어린이 입니다.");
		}
		
	}

}
