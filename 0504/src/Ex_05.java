import java.util.Random;

public class Ex_05 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] array = new int[10];
		int[] arr = new int[10];
		
		System.out.print("array�� ����ִ� ¦���� ");
		int count=0;
		for(int i=0;i<array.length;i++) {
			array[i]=rd.nextInt(30)+1;
			arr[i]=array[i];
			if(array[i]%2==0) {
				count++;
				System.out.print(array[i]+ " ");
			}
		}
		System.out.println("�Դϴ�.");
		System.out.println("�� "+count+"���� ¦�� �Դϴ�.");
		System.out.print("�迭�� : ");
		for(int i=0;i<array.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

