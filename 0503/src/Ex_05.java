import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ют╥б >> ");
		int input = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			int result = i * input;
			System.out.print(result+" ");
		}
	}

}
