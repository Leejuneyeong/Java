import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class SpecialSort {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> arr1= new ArrayList<Integer>();
		ArrayList<Integer> arr2= new ArrayList<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		arr.add(-1);
		arr.add(1);
		arr.add(3);
		arr.add(-2);
		arr.add(2);

		for(int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i)+" ");
		}
		
		System.out.print("ans : ");
		
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)*1<0) {
				arr1.add(arr.get(i));
			}else {
				arr2.add(arr.get(i));
			}
		}

		ans.addAll(arr1);
		ans.addAll(arr2);
		System.out.println(ans);
		  
	}

}
