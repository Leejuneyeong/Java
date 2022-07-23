import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01_Insert {

	public static void main(String[] args) {
		
		// �ֹ߼� ������ : class�� ���ุ ������ �� ����Ǵ� ������
		// ���ֹ߼� ������ : ������ �����ص� �����ִ� ������
		
		Scanner sc = new Scanner(System.in);
		PreparedStatement psmt = null;
		Connection conn =null;
		
		System.out.println("ID�� �Է����ּ��� >> ");
		String id = sc.next();
		System.out.println("PW�� �Է����ּ��� >> ");
		String pw = sc.next();
		System.out.println("�̸��� �Է����ּ��� >> ");
		String name = sc.next();
		
		// 1. JDBC ---> ojdbc6.jar ���� ��������
		// 1-1) ����̹� �����ε�
		// �����ϴ� ������ �ڷ����� �����Ǵ� ��
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// � �����ͺ��̽��� ����̹��� ������ �ð��� �����ִ� �ڵ�
			
			// ���� ( try-catch ) ���
			// 1) ��Ÿ�� ����
			// 2) ������ ����
			
			// oracle.jdbc.driver ---> ��Ű��
			// OracleDriver ---> Ŭ����
			
			// url, id, pw 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			//jdbc:oracle:thin : ����̹�
			//@localhost : ip�ּ�
			// 1521 : ��Ʈ��ȣ
			// xe : DB��
			String user = "hr"; // ������ ���̽� ����
			String password = "hr"; // ��й�ȣ
			
			conn = DriverManager.getConnection(url,user,password);
			
			// 2. SQL���� �غ�
			// 2-1 ) SQL�� �����
			String sql = "insert into mem values(?, ?, ?)";
			// 2-2 ) SQL�� ����
			psmt = conn.prepareStatement(sql);
			// --- > sql���� ��Ŀ� �°� ����ִ� ����
			
			// ? ���ڸ� ä���� �����ٰſ���!!!!!! <---- �Է¹��� �����ͷ� ä������!!!
			psmt.setString(1, id); // ù�� ° ?  ������ id�� ����
			psmt.setString(2, pw); // �ι� ° ? ������ pw�� ����
			psmt.setString(3, name); // ���� °  ? ������ name�� ����
			
			// ? ���ڰ� table�� �°� ä�������� �� Ȯ�����ּ���!!!!
			// ������ ���� ��(���̺�)�� �ִ��� Ȯ���� ���ִ� ���
			int row = psmt.executeUpdate();
			
			// row > 0 : ������ ���� ���̺��� �ִ� !
			// �װ� �ƴ϶�� �����Ͱ� �Է��� �ȵƴ�.
			if(row>0) {
				System.out.println("������ �߰� ����!!");
			}else {
				System.out.println("������ �߰� ���� �Ф�");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("���� ����");
			e.printStackTrace();
		} finally {
			// �߰��� ���ܻ�Ȳ�� ������� �ѹ��� �� �����Ű�� ����� ����
			// 4. �ݱ�
			//�ڡڡڡڡڡ� (����� �ݴ�������� ���� !!! �������� ���� !!!)�ڡڡڡڡڡ�
			
			try {
				//psmt�� �����ִٸ� �ݾ�����~!!!
				// psmt�� ���� �������� ��, null ���� �ƴ϶�� ������� ������
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
