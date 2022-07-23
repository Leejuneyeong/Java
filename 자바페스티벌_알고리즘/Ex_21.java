package 자바페스티벌;

public class Ex_21 {

	public static void main(String[] args) {
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int min = Math.abs(point[0] - point[1]);
		int length = 0;
		int[] arr = new int[2];
		for (int i = 0; i < point.length; i++) {
			for (int j = i + 1; j < point.length; j++) {
				length = point[i] - point[j];
				length = Math.abs(length);
				if (length < min) {
					min = length;
					arr[0] = i;
					arr[1] = j;
				}

			}
		}
		System.out.println("result = [" + arr[0] + "," + arr[1] + "]");
	}

}
