import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 1. A, B �Է� �ޱ�
		System.out.print("A �Է�>> ");
		int num1 = sc.nextInt();
		System.out.print("B �Է�>> ");
		int num2 = sc.nextInt();
		// 1. A, B �Է� �ޱ�
		// 2. �� ���ڰ� 0���� �ƴ��� �Ǵ��ϱ�
		if(num1==0 && num2==0) {
			break;
		}
	
		// 3. A-B ���� ó��
		System.out.println("��� >> "+(num1-num2));
		// �ݺ��� �ǵ��� �����
		}
	}

}
