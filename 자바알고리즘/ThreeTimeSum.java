
import java.util.*;

public class ThreeTimeSum {
	public static void main(String[] args) {
		int hour;
		int min;
		int secondcount = 0;
		for (hour = 0; hour < 24; hour++)
			for (min = 0; min < 60; min++) {
				if (hour % 10 == 3 || min % 10 == 3 || min / 10 == 3)
					secondcount += 60;
			}
		System.out.println(secondcount);
	}
}