import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04_Select {

	public static void main(String[] args) {
		// JDBC ���ῡ �ʿ��� ��ü �����ϱ�
		// Connection , PreparedStatement
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		// 1. �����ε� -> Class.forName()
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);

			// 3. SQL ����
			String sql = "select * from mem";
		
			psmt = conn.prepareStatement(sql);
			
			// sql�� ���� ( �ڡڡڡڡ� ) 
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				
				String id = rs.getString(1);
				String pw = rs.getString("mem_pw"); // 2 Ȥ�� ���� �÷��� �̸� ���!
				String name = rs.getString("mem_name"); // 3 Ȥ�� ���� �÷��� �̸� ���!
			
				System.out.println(id+"/"+pw+"/"+name);
				
			}
			// catch 1���� ����
		} catch (Exception e) {
			System.out.println("JDBC ����");
			e.printStackTrace();
		}
		
		
		//4. ��������
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
