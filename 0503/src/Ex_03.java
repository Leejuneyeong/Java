
public class Ex_03 {

	public static void main(String[] args) {
		
		// 96 -> 53까지 반복
		for(int i=96;i>=53;i--) {
			System.out.print(i+" ");
		}
		
        System.out.println();

		// 21 -> 57 까지 반복하는데 만약 홀수  출력
		for(int j=21;j<=57;j++) {
			if(j%2!=0) {
				System.out.print(j+" ");
				
			}
		}
		System.out.println();
		
		// 21 -> 57 까지 반복하는데 홀수만 출력
		for(int z=21;z<=57;z=z+2) {
			System.out.print(z+" ");
		}
	}

}
