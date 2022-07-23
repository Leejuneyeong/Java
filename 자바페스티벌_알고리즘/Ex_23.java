package 자바페스티벌;

public class Ex_23 {

	public static void main(String[] args) {

		int[][] num = new int[5][5];

		System.out.println("=====원본=====");

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (i == 0) {
					System.out.print((i + 1) + j + " ");
				} else if (i == 1) {
					System.out.print((i + 5) + j + " ");
				} else if (i == 2) {
					System.out.print((i + 9) + j + " ");
				} else if (i == 3) {
					System.out.print((i + 13) + j + " ");
				} else {
					System.out.print((i + 17) + j + " ");
				}
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("=====90도 회전=====");
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (i == 0 && j == 0) {
					System.out.print(5 + " ");
				} else if (i == 0 && j != 0) {
					System.out.print((i + 5) + j * 5 + " ");
				} else if (i == 1) {
					System.out.print((i + 3) + j * 5 + " ");
				} else if (i == 2) {
					System.out.print((i + 1) + j * 5 + " ");
				} else if (i == 3) {
					System.out.print((i - 1) + j * 5 + " ");
				} else {
					System.out.print((i - 3) + j * 5 + " ");
				}
			}
			System.out.println();
		}
	}

}
