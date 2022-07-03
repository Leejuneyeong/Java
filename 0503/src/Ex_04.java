
public class Ex_04 {

	public static void main(String[] args) {

		/*
		 * for (int i = 1; i <= 100; i++) { if (i % 3 == 0) { System.out.print(i + " ");
		 * } }
		 * 
		 * System.out.println();
		 * 
		 * for (int j = 1; j <= 100; j++) { if (j % 3 == 0 && j % 5 == 0) {
		 * System.out.print(j + " "); } }
		 * 
		 * System.out.println();
		 */
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		for (int a = 1; a <= 5; a++) {
			for (int b = 5; a <= b; b--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= 5 - a; b++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= a; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		for (int a = 5; a >= 0; a--) {
			for (int b = 1; b <= 5 - a; b++) {
				System.out.print(" "); // 공백 그려주기
			}
			for (int k = 1; k <= a; k++) {
				System.out.print("*"); // 실제 별찍기
			}
			System.out.println();
		}

		System.out.println();
	}

}
