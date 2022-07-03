import java.util.Scanner;

public class Ex_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : " );
		String id = sc.next();
		System.out.println("비밀번호 : ");
		String pw = sc.next();
		
		if(id.equals("나")) {
			if(pw.equals("0220")) {
			   System.out.println("로그인 성공.");
		    }else {
			System.out.println("실패");
		    }
		}else {
			System.out.println("실패");
		}
			
	}

 }

