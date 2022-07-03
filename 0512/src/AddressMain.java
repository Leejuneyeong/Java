import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {

		// 사용자가 메뉴를 선택하여 주소록을 사용할 수 있는 기능 구현!
		// [5]을 선택하면 프로그램이 종료되고
		// 이외의 메뉴들은 반복적으로 선택할 수 있는 구조 만들기!

		Scanner sc = new Scanner(System.in);

		// 모든 메뉴에서 ArrayList를 사용할 수 있도록 생성하기

		ArrayList<Address> list = new ArrayList<>(); // 제네릭
		// ArrayList<타입> 이름 = NEW ArrayList<>();
		
		while (true) {
			System.out.print("[1]등록 [2]검색 [3]수정 [4]삭제 [5]종료 >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("=====등록=====");
				// 사용자로부터 이름과 연락처 입력 받기!
				System.out.print("이름 : ");
				String name = sc.next();

				System.out.print("연락처 : ");
				String tell = sc.next();

				// 주소록 설계도에 입력된 내용들 전달하기
				// ->생성자 메소드 활용!
				Address address = new Address(name, tell); // 생성자 객체
				list.add(address); // 제네릭에 객체 배열 연결 (객체 배열)

			} else if (menu == 2) {
				System.out.println("=====검색=====");
				// 어떤 이름을 검색할 건지 입력 받기!
				System.out.print("검색할 이름 : ");
				String find = sc.next();
				// 해당하는 이름의 연락처를 출력해 줄수 있도록
				// main과 설계도 수정하기
				for (int i = 0; i < list.size(); i++) {
					if (find.equals(list.get(i).getName())) {
						System.out.println(list.get(i).getTell());
					}
				}
			} else if (menu == 3) {
				System.out.println("=====수정=====");
				System.out.print("수정할 이름 : ");
				String find = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (find.equals(list.get(i).getName())) {
						System.out.print("수정할 번호 입력 : ");
						String tell = sc.next();
						list.get(i).setTell(tell);
						System.out.println(list.get(i).getTell());
					}
				}
			} else if (menu == 4) {
				System.out.println("=====삭제=====");
				System.out.print("삭제할 이름 : ");
				String name = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).getName())) {
						list.remove(i);
						System.out.println("삭제되었습니다.");
					}
				}
			} else {
				System.out.println("프로그램이 종료 되었습니다.");
				break;
			}
		}
	}

}
