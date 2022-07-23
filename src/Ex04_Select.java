import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04_Select {

	public static void main(String[] args) {
		// JDBC 연결에 필요한 객체 생성하기
		// Connection , PreparedStatement
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		// 1. 동적로딩 -> Class.forName()
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);

			// 3. SQL 전송
			String sql = "select * from mem";
		
			psmt = conn.prepareStatement(sql);
			
			// sql문 실행 ( ★★★★★ ) 
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				String id = rs.getString(1);
				String pw = rs.getString("mem_pw"); // 2 혹은 실제 컬럼의 이름 사용!
				String name = rs.getString("mem_name"); // 3 혹은 실제 컬럼의 이름 사용!
			
				System.out.println(id+"/"+pw+"/"+name);
				
			}
			// catch 1개만 쓰기
		} catch (Exception e) {
			System.out.println("JDBC 오류");
			e.printStackTrace();
		}
		
		
		//4. 연결해제
		//rs->psmt->conn
		finally {
			try {
				if(rs!=null) {
					rs.close();
				}if(psmt != null) {
					psmt.close();
				}if(conn!=null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
