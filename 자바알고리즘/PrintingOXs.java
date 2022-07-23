import java.util.Scanner;

public class PrintingOXs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = Integer.parseInt(new Scanner(System.in).nextLine());

		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= input - i; j++) {
				System.out.print("O ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("X ");
			}
			System.out.println();
		}
		
		System.out.println();
		
	    for (int i = 0; i < input ; i++)
	        System.out.println(String.format("%0" + input + "d", Integer.parseInt(Integer.toBinaryString((int) (Math.pow(2, i + 1) - 1)))).replaceAll("0", "O ").replaceAll("1", "X "));
	}
}
