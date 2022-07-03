import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
	  /*Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		int result = input%2;
		String result2 = result==0 ? "짝수입니다." : "홀수입니다.";
		System.out.println(input+"는(은)"+result2);
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("농구공의 개수를 입력하세요 : ");
		int basketball = sc.nextInt();
		int box = basketball%5;
		int boxcount = box==0 ? basketball/5:basketball/5+1 ;
		System.out.println("필요한 상자의 수는(은)"+boxcount+ "입니다.");
	}

}
