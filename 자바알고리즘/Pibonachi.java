import java.util.Scanner;
import java.util.*;

public class Pibonachi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(0,0);
		arr.add(1,1);
		System.out.print("정수 n 입력 : ");
		int input = sc.nextInt();
		
		for(int i=0; ;i++) {
			int sum = arr.get(i)+arr.get(i+1);
			arr.add(i+2,sum);
			if(input==sum)
				break;
		}
		System.out.println(arr);	
	}
}
