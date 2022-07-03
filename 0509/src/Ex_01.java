
public class Ex_01 {

	public static void main(String[] args) {

		// 1. 만들고자 하는 배열의 선언 진행하기
		// - 배열 형태(int/String, 1차원/2차원)? , 배열 이름? , 배열 크기 ?

		int[][] arr = new int[5][5];
		int num = 21;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=num;
				System.out.print(arr[i][j]+"\t");
				num++;
			}
			System.out.println();
		}

		System.out.println("========================================");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("=========================================");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(20+(i + 1) + (5 * j) + "\t");
			}
			System.out.println();
		}
		
		System.out.println("=========================================");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 4; j >=0 ; j--) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
