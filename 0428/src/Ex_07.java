import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~3 ������ ���� �Է� : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("1�Դϴ�.");
			break;
			
		case 2 :
			System.out.println("2�Դϴ�.");
			break;
		
		case 3 :
			System.out.println("3�Դϴ�.");
			break;
		
		default:
			System.out.println("�߸��� ���Դϴ�.");
			break;
		}
	}

}
