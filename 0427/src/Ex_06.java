import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ѱݾ� �Է� : ");
		int money = sc.nextInt();
		System.out.println("�ܵ� : "+money);
		
		int a = money/10000;
		int re1 = money-a*10000;
		
		int b = re1/5000;
		int re2 = re1-b*5000;
		
		int c = re2/1000;
		int re3 = re2-c*1000;
		
		int d = re3/500;
		int re4 = re3-d*500;
		
		int e = re4/100;
		
		System.out.println("10000�� : "+a+"��");
		System.out.println("5000�� : "+b+"��");
		System.out.println("1000�� : "+c+"��");
		System.out.println("500�� : "+d+"��");
		System.out.println("100�� : "+e+"��");
		
		
	}

}
