import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
	  /*Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int input = sc.nextInt();
		int result = input%2;
		String result2 = result==0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.";
		System.out.println(input+"��(��)"+result2);
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�󱸰��� ������ �Է��ϼ��� : ");
		int basketball = sc.nextInt();
		int box = basketball%5;
		int boxcount = box==0 ? basketball/5:basketball/5+1 ;
		System.out.println("�ʿ��� ������ ����(��)"+boxcount+ "�Դϴ�.");
	}

}
