import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		
		// switch ���ǹ� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		// ¦������ Ȧ������ �Ǵ��ϱ�
		
		switch(num%2) {
		
		case 0 : 
			//¦���� �ش��ϴ� ��� ����
			System.out.println(num+"�� ¦�� �Դϴ�.");
		    break;
		
		case 1:
			System.out.println(num+"�� Ȧ�� �Դϴ�.");
			break;
			
		default:
		break;
		}
			
	}

}
