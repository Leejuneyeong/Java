import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		
		// ����ڿ��� num�� �� ������ �� �޾ƿ���
		// �����͸� �Է��ϴ� ��� -> ���콺,Ű����,����
		
		// Ű���带 ����� �� �ִ� ����� �ҷ�����->Scanner
		// Scanner �ҷ����� -> import �۾�(�ڡڡڡڡ�)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		//int num = 528;
		//Scanner�� ���Ͽ� ���� num�� �����Ͱ� �����ϱ�
		
		int num = sc.nextInt();
		// ����0 �ڸ� ������ ���� ������
		// 1. ���� ���� ������ �ִ� ���ڷ� ���� ���� �ڸ� ��ġ�� �˾ƾ��Ѵ�
		
		int a = num/100;
		
		int result = a*100;
		// a=4;
		
		System.out.println("��� : "+result);
	}

}
