
public class Ex_08 {

	public static void main(String[] args) {
		
		// int[��][ȣ] -> int[��][��]
		
		// 5�� 5�� ¥�� �������迭(arr) �����ϱ�
		
		int[][] arr = new int[5][5];
		
		// ������ �迭�� �Է��� ���� 1~25���� �Է�
		// arr[0][0] =1;
		// arr[0][1] =2;
		// ....
		// arr[4][4] = 25;
		
		int count =1;
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]= count;
				count++;
			}
		}
		
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
