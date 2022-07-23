import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Controller {
	// main에서 호출 하는 기능들을 관리할 수 있는 클래스
	// 모든 메소드에서 객체를 사용할 수 있도록 전역변수 지정!
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	// 기능 수행결과를 담을 수 있는 변수 생성
	int row = 0;
	// JDBC 접속을 위한 메소드 생성! -> getCon()
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
	// 객체를 닫아줄 수 있는 close() 생성
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
		// JDBC 사용을 위한 기능들이 저장된 메소드! -> 다양한 기능에서 중복적으로 사용!
		getCon();
		try {
			String sql = "insert into mem values(?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			row = psmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("DB 오류");
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
			getCon(); // 데이터 베이스 연결~
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
			close(); // 자원반납 메서드 호출
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
			// sql문 실행 (★★★★★)
			rs = psmt.executeQuery();
			
			
			while(rs.next()) {
				
				String id = rs.getString(1);
				String pw = rs.getString("mem_pw"); // 2 혹은 실제 컬럼이 이름 사용!
				
				dto = new MemDTO(id, pw);
				// System.out.println(id + " / " + pw );
				// result = true;
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("JDBC 오류");
			e.printStackTrace();
		}
		
		// 4. 연결해제
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
			
			// DB로 전송하기 위한 sql문 담기!
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			
			// sql문장 실행하기!
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