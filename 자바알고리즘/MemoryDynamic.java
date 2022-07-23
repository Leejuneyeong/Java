import static java.lang.System.in;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MemoryDynamic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		int num = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList();

		IntStream.range(0, num).forEach(i -> {
			arr.add(sc.nextInt());
		}); 

		System.out.println("Че : " + arr.stream().mapToInt(Integer::intValue).sum());
		System.out.println("ЦђБе : " + arr.stream().mapToInt(Integer::intValue).average().orElse(0));

		arr.clear();
	}

}
