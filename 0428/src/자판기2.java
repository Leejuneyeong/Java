import java.util.Scanner;

public class ���Ǳ�2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ��Է� : ");
		int mon = sc.nextInt();
	
		
		if (mon > 0) {
			System.out.println("�޴����");
			System.out.print("1.�ݶ�800�� 2.����500�� 3. ��Ÿ�ο���1500�� >> ");
			
			int i = sc.nextInt();
			
			
			switch (i) {
			case 1:
				if (mon >= 800) {
					mon = mon - 800;
					System.out.println("�ܵ� : " + mon);
					System.out.print("õ�� : " + (mon / 1000) + "��, ");
					System.out.print("����� : " + (mon % 1000 / 500) + "��, ");
					System.out.print("��� : " + (mon % 1000 % 500 / 100) + "��");
					break;
				} else {
					System.out.println("���� ������");
				}
			case 2:
				if (mon >= 500) {
					mon = mon - 500;
					System.out.println("�ܵ� : " + mon);
					System.out.print("õ�� : " + (mon / 1000) + "��, ");
					System.out.print("����� : " + (mon % 1000 / 500) + "��, ");
					System.out.print("��� : " + (mon % 1000 % 500 / 100) + "��");
					break;
				} else {
					System.out.println("���� ������");
				}
			case 3:
				if (mon >= 1500) {
					mon = mon - 1500;
					System.out.println("�ܵ� : " + mon);
					System.out.print("õ�� : " + (mon / 1000) + "��, ");
					System.out.print("����� : " + (mon % 1000 / 500) + "��, ");
					System.out.print("��� : " + (mon % 1000 % 500 / 100) + "��");
					break;
				} else {
					System.out.println("���� ������");
				}
				default:
				break;
			}

		}
		else {
			System.out.println("���� �־��ּ���.");
		}
	}
}