import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02_Update {

	public static void main(String[] args) {

		// id�� �Է¹޾Ƽ�
		// �Է¹��� id�� pw, name�� ����

		Scanner sc = new Scanner(System.in);
		PreparedStatement psmt = null;
		Connection conn = null;

		System.out.println("id�� �Է����ּ��� >> ");
		String id = sc.next();
		System.out.println("������ pw�� �Է����ּ��� >> ");
		String pw = sc.next();
		System.out.println("������ name�� �Է����ּ��� >> ");
		String name = sc.next();

		// 1. class.forName

		try {
			
			// 2. url,user,password
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr"; // ������ ���̽� ����
			String password ="hr"; // ��й�ȣ
			
			conn = DriverManager.getConnection(url,user,password);
			
			// sql ����
			
			String sql = "update mem set mem_pw = ? , mem_name = ? where mem_id= ? ";
			
			// 3. sql�� �غ�
			psmt = conn.prepareStatement(sql);			
			
			psmt.setString(1, pw); 
			psmt.setString(2, name);
			psmt.setString(3, id); 
			
			int row = psmt.executeUpdate();
			
			if(row>0) {
				System.out.println("������Ʈ ����");
			}else {
				System.out.println("������Ʈ ����");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("���� ����");
			e.printStackTrace();
			
			// 4. �ڿ� �ݳ�

		} finally {
			try {
				if(psmt != null)
					psmt.close();
				
				if(conn != null)
					conn.close();
				
			} catch (SQLException e) {
				System.out.println("�ݳ� ����");
				e.printStackTrace();
			}
		}
		


	}

}
