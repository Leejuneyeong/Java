package 자바페스티벌;

public class Ex_bonus02 {

	public static void main(String[] args) {
		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("test"));
	}

	public static String getMiddle(String string) {
		String s = string;
		int length = s.length();
		String result = (length % 2 == 0) ? s.substring((length / 2) - 1, (length / 2 + 1))
				: s.substring(length / 2, (length / 2) + 1);

		return result;
	}

}
