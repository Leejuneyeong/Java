import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		
		// ���� if�� -> �������� ������ ���� �Ǵ�!
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int age=sc.nextInt();
		
		/*if(age>=30) {
			System.out.println("30�� �Դϴ�.");
		}else if(age>0 && age>=20) {
			System.out.println("20�� �Դϴ�.");
		}else if(age>=10) {
			System.out.println("10�� �Դϴ�.");
		}else {
			System.out.println("��� �Դϴ�.");
		}
		System.out.println("���α׷� ����");
		*/
		// ��ø if�� -> �������� ������ �ߺ��ؼ� �Ǵ�!
			
		if(age>=30) {
			System.out.println("30�� �Դϴ�.");
		}
		
		if(age<=30 && age>=20) {
			System.out.println("20�� �Դϴ�.");
		}
		
		if(age<=20 && age>=10) {
			System.out.println("10�� �Դϴ�.");
		}
		
		if(age<=0 && age>=0) {
			System.out.println("��� �Դϴ�.");
		}
		
	}

}
