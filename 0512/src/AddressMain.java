import java.util.ArrayList;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {

		// ����ڰ� �޴��� �����Ͽ� �ּҷ��� ����� �� �ִ� ��� ����!
		// [5]�� �����ϸ� ���α׷��� ����ǰ�
		// �̿��� �޴����� �ݺ������� ������ �� �ִ� ���� �����!

		Scanner sc = new Scanner(System.in);

		// ��� �޴����� ArrayList�� ����� �� �ֵ��� �����ϱ�

		ArrayList<Address> list = new ArrayList<>(); // ���׸�
		// ArrayList<Ÿ��> �̸� = NEW ArrayList<>();
		
		while (true) {
			System.out.print("[1]��� [2]�˻� [3]���� [4]���� [5]���� >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("=====���=====");
				// ����ڷκ��� �̸��� ����ó �Է� �ޱ�!
				System.out.print("�̸� : ");
				String name = sc.next();

				System.out.print("����ó : ");
				String tell = sc.next();

				// �ּҷ� ���赵�� �Էµ� ����� �����ϱ�
				// ->������ �޼ҵ� Ȱ��!
				Address address = new Address(name, tell); // ������ ��ü
				list.add(address); // ���׸��� ��ü �迭 ���� (��ü �迭)

			} else if (menu == 2) {
				System.out.println("=====�˻�=====");
				// � �̸��� �˻��� ���� �Է� �ޱ�!
				System.out.print("�˻��� �̸� : ");
				String find = sc.next();
				// �ش��ϴ� �̸��� ����ó�� ����� �ټ� �ֵ���
				// main�� ���赵 �����ϱ�
				for (int i = 0; i < list.size(); i++) {
					if (find.equals(list.get(i).getName())) {
						System.out.println(list.get(i).getTell());
					}
				}
			} else if (menu == 3) {
				System.out.println("=====����=====");
				System.out.print("������ �̸� : ");
				String find = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (find.equals(list.get(i).getName())) {
						System.out.print("������ ��ȣ �Է� : ");
						String tell = sc.next();
						list.get(i).setTell(tell);
						System.out.println(list.get(i).getTell());
					}
				}
			} else if (menu == 4) {
				System.out.println("=====����=====");
				System.out.print("������ �̸� : ");
				String name = sc.next();
				for (int i = 0; i < list.size(); i++) {
					if (name.equals(list.get(i).getName())) {
						list.remove(i);
						System.out.println("�����Ǿ����ϴ�.");
					}
				}
			} else {
				System.out.println("���α׷��� ���� �Ǿ����ϴ�.");
				break;
			}
		}
	}

}
