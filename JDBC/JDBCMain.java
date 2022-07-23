import java.sql.ResultSet;
import java.util.Scanner;
public class JDBCMain {
	public static void main(String[] args) {
		// [1]�߰� [2]���� [3]�˻� [4]Ż�� [5]����
		// ����ڰ� ����ϰ��� �ϴ� ��� �Է¹ޱ�
		// 5���� �ԷµǱ� ������ ��� �޴��� �ݺ��� �� �ִ� ���� ����!
		Scanner sc = new Scanner(System.in);
		Controller controller = new Controller();
		// ������� ����� Ȯ���ϱ� ���� ��������
		int row = 0;
		while (true) {
			System.out.print("[1]�߰� [2]���� [3]�˻� [4]Ż�� [5]���� >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("==ȸ�� ����==");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				System.out.print("name : ");
				String name = sc.next();
				// insert �޼ҵ带 ȣ��!
				MemDTO dto = new MemDTO(id, pw, name);
				row = controller.insert(dto);
				if (row > 0) {
					System.out.println("������ �߰� ����");
				} else {
					System.out.println("�߰� ����");
				}
			} else if (menu == 2) {
				System.out.print("id : ");
				String id = sc.next();
				System.out.print("���� pw : ");
				String pw = sc.next();
				System.out.print("���� name : ");
				String name = sc.next();
				MemDTO dto = new MemDTO(id, pw, name);
				row = controller.update(dto);
				if (row > 0) {
					System.out.println("������ ���� ����");
				} else {
					System.out.println("�߰� ����");
				}
			} else if (menu == 3) {
				// �̸��� �Է��ؼ�
				// �ش� �̸������� ���̵�� �н����带 ������ִ�
				// select�� ����ؼ� �˻��ϴ� ��� ������!
				System.out.println("�˻��� �̸��� �Է��ϼ��� >> ");
				String name = sc.next();
				MemDTO dto = new MemDTO(name);
				//MemDTO dto2 = controller.select(dto);
				dto = controller.select(dto);
				
				System.out.println(dto.getId()+"/"+dto.getPw());
				
			} else if (menu == 4) {
				// ������ ����
				System.out.print("������ id : ");
				String id = sc.next();
				controller.delete(id);
				if(row > 0) {
					System.out.println("������ ���� �Ǿ����ϴ�.");
				}else {
					System.out.println("���� ����!");
				}
				
			} else {
				break;
			}
		}
	}
}