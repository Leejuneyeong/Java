import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		
		//1. Scanner 기능 불러오기
		
		Scanner sc = new Scanner(System.in);
		
		//2. 몇개의 농구공이 있는지 입력 받기
		
		System.out.print("농구공의 개수를 입력하세요 : ");
		int num = sc.nextInt();
	
		//3. 5개씩 몇개의 상자가 필요한지 연산 하기 (삼항 연산자)
		//조건식 ? 참 : 거짓 ;
		
		int result = num%5==0? num/5:num/5+1;
		
		System.out.println("필요한 상자의 수 : "+result);
	
	}

}
