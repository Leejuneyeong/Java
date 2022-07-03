import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+1+"번째 입력>>");
			arr[i] = sc.nextInt();
			
		}
		System.out.print("입력된 점수 : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
