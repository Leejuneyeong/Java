import java.util.Random;

public class Ex_01 {

	public static void main(String[] args) {
		Random rc = new Random();
		int[] arr = new int[5];
		int max = arr[0];
		int min = 0;
		System.out.print("배열 : ");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rc.nextInt(10) + 1;
			min = arr[0];
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("가장 큰값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}
}
