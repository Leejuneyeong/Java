import java.sql.ResultSet;
import java.util.Scanner;
public class JDBCMain {
	public static void main(String[] args) {
		// [1]추가 [2]수정 [3]검색 [4]탈퇴 [5]종료
		// 사용자가 사용하고자 하는 기능 입력받기
		// 5번이 입력되기 전까지 계속 메뉴를 반복할 수 있는 구조 갖기!
		Scanner sc = new Scanner(System.in);
		Controller controller = new Controller();
		// 사용자의 결과를 확인하기 위한 전역변수
		int row = 0;
		while (true) {
			System.out.print("[1]추가 [2]수정 [3]검색 [4]탈퇴 [5]종료 >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("==회원 가입==");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				System.out.print("name : ");
				String name = sc.next();
				// insert 메소드를 호출!
				MemDTO dto = new MemDTO(id, pw, name);
				row = controller.insert(dto);
				if (row > 0) {
					System.out.println("데이터 추가 성공");
				} else {
					System.out.println("추가 실패");
				}
			} else if (menu == 2) {
				System.out.print("id : ");
				String id = sc.next();
				System.out.print("변경 pw : ");
				String pw = sc.next();
				System.out.print("변경 name : ");
				String name = sc.next();
				MemDTO dto = new MemDTO(id, pw, name);
				row = controller.update(dto);
				if (row > 0) {
					System.out.println("데이터 수정 성공");
				} else {
					System.out.println("추가 실패");
				}
			} else if (menu == 3) {
				// 이름을 입력해서
				// 해당 이름에대한 아이디와 패스워드를 출력해주는
				// select문 사용해서 검색하는 기능 만들자!
				System.out.println("검색할 이름을 입력하세요 >> ");
				String name = sc.next();
				MemDTO dto = new MemDTO(name);
				//MemDTO dto2 = controller.select(dto);
				dto = controller.select(dto);
				
				System.out.println(dto.getId()+"/"+dto.getPw());
				
			} else if (menu == 4) {
				// 데이터 삭제
				System.out.print("삭제할 id : ");
				String id = sc.next();
				controller.delete(id);
				if(row > 0) {
					System.out.println("삭제가 성공 되었습니다.");
				}else {
					System.out.println("삭제 실패!");
				}
				
			} else {
				break;
			}
		}
	}
}