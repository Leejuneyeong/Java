import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int month = sc.nextInt();
		
		switch(month/3) {
		case  1: 
			System.out.println(month+"���� ���Դϴ�.");
			break;
		case  2:
			System.out.println(month+"���� �����Դϴ�.");
			break;
		case  3:
			System.out.println(month+"���� �����Դϴ�.");
			break;
		default :
			System.out.println(month+"���� �ܿ��Դϴ�.");
			break;
	}
 }
}
