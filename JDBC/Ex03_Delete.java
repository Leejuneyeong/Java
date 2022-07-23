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

		System.out.println("������ id�� �Է����ּ��� >> ");
		String id = sc.next();

		try {
			//�ڹٿ� DB���� ���
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			//jdbc - jobd ���̺귯�� thin : �ڹ� // 1521 , xe �� �ٲٸ� �ȵ�
			String user = "hr"; // ������ ���̽� ����
			String password = "hr"; // ��й�ȣ

			conn = DriverManager.getConnection(url, user, password);
			
			//---------------------------------------------------- ����Ŭ ����

			// ȯ�� ���� , sql ���� 

			String sql = "delete from mem where mem_id=? ";

			// 3. sql�� �غ�
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);

			//-----------------------------------------------------�����Ǿ����� Ȯ��
			
			int row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("���� ����");
			} else {
				System.out.println("���� ����");
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
				if (psmt != null)
					psmt.close();

				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				System.out.println("�ݳ� ����");
				e.printStackTrace();
			}
		}
	}

}
