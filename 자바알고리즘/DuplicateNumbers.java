import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DuplicateNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("sample inputs : ");
		String[] str = sc.next().split(""); 
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList(str)); 
		Collections.sort(arr);
		int count = 0;
		
		for (int i=0; i<arr.size()-1; i++) {
			if (arr.get(i).equals(arr.get(i+1))) {
				count++;
				break;
			}
		}
		
		if (count > 0 || arr.size() != 10) {
			System.out.println("False");
		} else {
			System.out.println("True");
		}
	}

}
