import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03_Delete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PreparedStatement psmt = null;
		Connection conn = null;

		System.out.println("삭제할 id를 입력해주세요 >> ");
		String id = sc.next();

		try {
			//자바와 DB연결 통로
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			//jdbc - jobd 라이브러리 thin : 자바 // 1521 , xe 는 바꾸면 안됨
			String user = "hr"; // 데이터 베이스 계정
			String password = "hr"; // 비밀번호

			conn = DriverManager.getConnection(url, user, password);
			
			//---------------------------------------------------- 오라클 연결

			// 환경 생성 , sql 전송 

			String sql = "delete from mem where mem_id=? ";

			// 3. sql문 준비
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);

			//-----------------------------------------------------수정되었는지 확인
			
			int row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("연결 실패");
			e.printStackTrace();

			// 4. 자원 반납

		} finally {
			try {
				if (psmt != null)
					psmt.close();

				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				System.out.println("반납 오류");
				e.printStackTrace();
			}
		}
	}

}
