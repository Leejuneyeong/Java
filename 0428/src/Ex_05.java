import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int grade = sc.nextInt();
		
		String s = "" ;
		
		if(100>=grade && grade>=90) {
			//System.out.println("A���� �Դϴ�.");
			s="A";
		}
		else if(grade<90 && grade>=80) {
			//System.out.println("B���� �Դϴ�.");
			s="B";
		}
		else if(grade>=70 && grade<80) {
			//System.out.println("C���� �Դϴ�.");
			s="c";
		}else {
			s="D";
		}
		System.out.println(s+"�����Դϴ�.");
	}

}
