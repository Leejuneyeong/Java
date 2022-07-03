import java.util.Random;

public class Ex_05 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] array = new int[10];
		int[] arr = new int[10];
		
		System.out.print("array에 들어있는 짝수는 ");
		int count=0;
		for(int i=0;i<array.length;i++) {
			array[i]=rd.nextInt(30)+1;
			arr[i]=array[i];
			if(array[i]%2==0) {
				count++;
				System.out.print(array[i]+ " ");
			}
		}
		System.out.println("입니다.");
		System.out.println("총 "+count+"개가 짝수 입니다.");
		System.out.print("배열값 : ");
		for(int i=0;i<array.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

