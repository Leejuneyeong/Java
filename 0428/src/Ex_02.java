import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		// 1. Scanner ���
		Scanner sc = new Scanner(System.in);
		// 2. intŸ���� ���� age ����
		int age=0;
		System.out.print("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		
		// 3. age�� 20���� ũ�ų� ������ �Ǵ� (�Ǵ�->���ǹ� ���)
		// - ���ǿ� �ش����� �� "�����Դϴ�." ���
		if(age>=20) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("�̼����� �Դϴ�.");
		}
		
	}

}
