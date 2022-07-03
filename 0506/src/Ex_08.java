
public class Ex_08 {

	public static void main(String[] args) {
		
		// int[층][호] -> int[행][열]
		
		// 5행 5열 짜리 이차원배열(arr) 생성하기
		
		int[][] arr = new int[5][5];
		
		// 이차원 배열에 입력한 숫자 1~25까지 입력
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
