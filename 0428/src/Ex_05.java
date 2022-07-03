import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int grade = sc.nextInt();
		
		String s = "" ;
		
		if(100>=grade && grade>=90) {
			//System.out.println("A학점 입니다.");
			s="A";
		}
		else if(grade<90 && grade>=80) {
			//System.out.println("B학점 입니다.");
			s="B";
		}
		else if(grade>=70 && grade<80) {
			//System.out.println("C학점 입니다.");
			s="c";
		}else {
			s="D";
		}
		System.out.println(s+"학점입니다.");
	}

}
