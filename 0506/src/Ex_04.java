import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] team = { "이준영", "이준호", "노준호", "이새롬", "박예림" };
		System.out.print("검색할 이름을 입력하세요. >> ");
		String name = sc.next();

		for (int i = 0; i < team.length; i++) {
			if (team[i].equals(name)) {
				System.out.print(name + "님은 " +(i+1)+"번째 인덱스에 저장되어 있습니다.");
			}
		}
	}
}
