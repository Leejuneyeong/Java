import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true) {
		System.out.print("ù ��° ������ �Է��ϼ���>> ");
		int finput = sc.nextInt();
		System.out.print("�� ��° ������ �Է��ϼ���>> ");
		int sinput = sc.nextInt();
		
		System.out.print("[1]���ϱ�   [2]����>> ");
		int select = sc.nextInt();
		
		int sum = finput+sinput;
		
		int sub = finput<sinput ? sinput-finput : finput-sinput;
		
		if(select == 1) {
			System.out.println("���ϱ� ���� ����� "+sum+" �Դϴ�.");
		}else if(select == 2) {
			System.out.println("���� ���� ����� "+sub+" �Դϴ�.");
		}else {
			System.out.println("1�� �Ǵ� 2���� �������ּ���.");
		}
		System.out.println();
		System.out.print("�ٽ� �����Ͻðڽ��ϱ�? (Y/N) >> ");
		String s = sc.next();
		
		if(s.equals("Y")) {
			continue;
		}else if(s.equals("N")) {
			System.out.println();
			System.out.println("����Ǿ����ϴ�.");
			break;
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �����մϴ�.");
			break;
		}
	}
  }
}