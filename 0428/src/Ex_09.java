import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� : " );
		String id = sc.next();
		System.out.println("��й�ȣ : ");
		String pw = sc.next();
		
		if(id.equals("��")) {
			if(pw.equals("0220")) {
			   System.out.println("�α��� ����.");
		    }else {
			System.out.println("����");
		    }
		}else {
			System.out.println("����");
		}
			
	}

 }

