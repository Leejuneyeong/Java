import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Controller {
	// main���� ȣ�� �ϴ� ��ɵ��� ������ �� �ִ� Ŭ����
	// ��� �޼ҵ忡�� ��ü�� ����� �� �ֵ��� �������� ����!
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	// ��� �������� ���� �� �ִ� ���� ����
	int row = 0;
	// JDBC ������ ���� �޼ҵ� ����! -> getCon()
	public void getCon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// ��ü�� �ݾ��� �� �ִ� close() ����
	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// insert
	public int insert(MemDTO dto) {
		// JDBC ����� ���� ��ɵ��� ����� �޼ҵ�! -> �پ��� ��ɿ��� �ߺ������� ���!
		getCon();
		try {
			String sql = "insert into mem values(?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			row = psmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DB ����");
			e.printStackTrace();
		}
		finally {
			close();
		}
		return row;
	}
	// update
	public int update(MemDTO dto) {
		int row = 0;
		try {
			getCon(); // ������ ���̽� ����~
			String sql = "update mem set mem_pw = ? , mem_name = ? where mem_id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getPw());
			psmt.setString(2, dto.getName());
			psmt.setString(3, dto.getId());
			row = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			close(); // �ڿ��ݳ� �޼��� ȣ��
		}
		return row;
	}
	// delete
	// select
	public MemDTO select(MemDTO dto) {
		boolean result = false;
		try {
			getCon();
			
			String sql = "select mem_id, mem_pw from mem where mem_name = ?";
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, dto.getName());
			// sql�� ���� (�ڡڡڡڡ�)
			rs = psmt.executeQuery();
			
			
			while(rs.next()) {
				
				String id = rs.getString(1);
				String pw = rs.getString("mem_pw"); // 2 Ȥ�� ���� �÷��� �̸� ���!
				
				dto = new MemDTO(id, pw);
				// System.out.println(id + " / " + pw );
				// result = true;
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("JDBC ����");
			e.printStackTrace();
		}
		
		// 4. ��������
		finally {
			close();
		}
		return dto;
	}
	
	public int delete(String id) {
		
		int row = 0;
		try {
			getCon();
			
			String sql = "delete from mem where mem_id = ?";
			
			// DB�� �����ϱ� ���� sql�� ���!
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			
			// sql���� �����ϱ�!
			row = psmt.executeUpdate();
			
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			close();
		}
		return row;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}