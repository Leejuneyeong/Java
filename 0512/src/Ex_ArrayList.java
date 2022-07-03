import java.util.ArrayList;

public class Ex_ArrayList {

	public static void main(String[] args) {

		// �迭 : �������� ���°� ���� �ڷ���� �ѹ��� ������ �� �ִ� ���
		// �迭�� Ư¡
		// 1. ũ�Ⱑ �����Ǿ� �ִ�.
		// 2. �ε��� ��ȣ([0],[1])�� ����Ͽ� ��ġ���� �˾Ƴ��� �ִ�.

		// ArrayList(���� ����Ʈ) : �������� ����(��ü ����)�� ���� �ڷ���� �ѹ��� ������ �� �ִ� ���
		// + �迭�� ũ�Ⱑ �������� ���� ���!

		// 1. ArrayList�� ����(����)
		// 2. : ��ü�� ���� Ÿ���� ������ �� �ִ� ���׸� ���
		// �߰��ϱ� -> add("")
		ArrayList<String> names = new ArrayList<>();
		names.add("���ؿ�");
		names.add("ȫ�浿");
		names.add("������");

		// 3. �����͸� ���(Ȯ��)�غ���! -> get(index)
		// Ȯ���� ���� �޼ҵ�!
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("names�� ũ�� : "+names.size());
		//4. ���ϴ� ������ �����ϱ� -> remove(index)
		names.remove(1);
		System.out.println("======");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("names�� ũ�� : "+names.size());
		
		names.add(1,"�ȳ��");
		System.out.println("======");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}

}
