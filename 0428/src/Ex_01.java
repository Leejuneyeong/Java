import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		
		//1. Scanner ��� �ҷ�����
		
		Scanner sc = new Scanner(System.in);
		
		//2. ��� �󱸰��� �ִ��� �Է� �ޱ�
		
		System.out.print("�󱸰��� ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
	
		//3. 5���� ��� ���ڰ� �ʿ����� ���� �ϱ� (���� ������)
		//���ǽ� ? �� : ���� ;
		
		int result = num%5==0? num/5:num/5+1;
		
		System.out.println("�ʿ��� ������ �� : "+result);
	
	}

}
