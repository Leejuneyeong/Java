import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Tab {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(new File("D:\\코딩파일\\file.txt"));
		
		while (scanner.hasNextLine()) {
			String str = scanner.nextLine();
			System.out.println("tab : ");
			System.out.println(str);
			str.replace("/t", "    ");
			System.out.println("4 space : ");
			System.out.println(str);
		}

	}

}
