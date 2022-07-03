import java.util.Scanner;

public class 자판기2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액입력 : ");
		int mon = sc.nextInt();
	
		
		if (mon > 0) {
			System.out.println("메뉴골라");
			System.out.print("1.콜라800원 2.생수500원 3. 비타민워터1500원 >> ");
			
			int i = sc.nextInt();
			
			
			switch (i) {
			case 1:
				if (mon >= 800) {
					mon = mon - 800;
					System.out.println("잔돈 : " + mon);
					System.out.print("천원 : " + (mon / 1000) + "개, ");
					System.out.print("오백원 : " + (mon % 1000 / 500) + "개, ");
					System.out.print("백원 : " + (mon % 1000 % 500 / 100) + "개");
					break;
				} else {
					System.out.println("돈이 부족함");
				}
			case 2:
				if (mon >= 500) {
					mon = mon - 500;
					System.out.println("잔돈 : " + mon);
					System.out.print("천원 : " + (mon / 1000) + "개, ");
					System.out.print("오백원 : " + (mon % 1000 / 500) + "개, ");
					System.out.print("백원 : " + (mon % 1000 % 500 / 100) + "개");
					break;
				} else {
					System.out.println("돈이 부족함");
				}
			case 3:
				if (mon >= 1500) {
					mon = mon - 1500;
					System.out.println("잔돈 : " + mon);
					System.out.print("천원 : " + (mon / 1000) + "개, ");
					System.out.print("오백원 : " + (mon % 1000 / 500) + "개, ");
					System.out.print("백원 : " + (mon % 1000 % 500 / 100) + "개");
					break;
				} else {
					System.out.println("돈이 부족함");
				}
				default:
				break;
			}

		}
		else {
			System.out.println("돈울 넣어주세요.");
		}
	}
}