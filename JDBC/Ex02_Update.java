import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02_Update {

	public static void main(String[] args) {

		// id를 입력받아서
		// 입력받은 id의 pw, name을 수정

		Scanner sc = new Scanner(System.in);
		PreparedStatement psmt = null;
		Connection conn = null;

		System.out.println("id를 입력해주세요 >> ");
		String id = sc.next();
		System.out.println("변경할 pw를 입력해주세요 >> ");
		String pw = sc.next();
		System.out.println("변경할 name을 입력해주세요 >> ");
		String name = sc.next();

		// 1. class.forName

		try {
			
			// 2. url,user,password
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr"; // 데이터 베이스 계정
			String password ="hr"; // 비밀번호
			
			conn = DriverManager.getConnection(url,user,password);
			
			// sql 전송
			
			String sql = "update mem set mem_pw = ? , mem_name = ? where mem_id= ? ";
			
			// 3. sql문 준비
			psmt = conn.prepareStatement(sql);			
			
			psmt.setString(1, pw); 
			psmt.setString(2, name);
			psmt.setString(3, id); 
			
			int row = psmt.executeUpdate();
			
			if(row>0) {
				System.out.println("업데이트 성공");
			}else {
				System.out.println("업데이트 실패");
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
				if(psmt != null)
					psmt.close();
				
				if(conn != null)
					conn.close();
				
			} catch (SQLException e) {
				System.out.println("반납 오류");
				e.printStackTrace();
			}
		}
		


	}

}
