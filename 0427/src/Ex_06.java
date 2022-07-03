import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int money = sc.nextInt();
		System.out.println("잔돈 : "+money);
		
		int a = money/10000;
		int re1 = money-a*10000;
		
		int b = re1/5000;
		int re2 = re1-b*5000;
		
		int c = re2/1000;
		int re3 = re2-c*1000;
		
		int d = re3/500;
		int re4 = re3-d*500;
		
		int e = re4/100;
		
		System.out.println("10000원 : "+a+"개");
		System.out.println("5000원 : "+b+"개");
		System.out.println("1000원 : "+c+"개");
		System.out.println("500원 : "+d+"개");
		System.out.println("100원 : "+e+"개");
		
		
	}

}
