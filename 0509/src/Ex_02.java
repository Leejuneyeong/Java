
public class Ex_02 {

	// main �޼ҵ�
	public static void main(String[] args) {

		// �ΰ��� ������ Ȱ���Ͽ� ���ϱ� ������ �����ϴ� �޼ҵ� ȣ���ϱ�!
		int total = addNum(3, 4);
		System.out.println("��� �� : " + total);
		
		int total2 = addNum(10,2);
		System.out.println("��� �� : "+ total2);

	}
	// �޼ҵ� �⺻ ����
	// 1. ���� ������ ( = ���� ������ ) -> public (������ �ǹ̸� �������ִ�)
	// 2. ���� Ÿ�� : �޼ҵ� ȣ�� ���� ������� ���ƿü� �ֵ��� �ϴ� ���!
	// void -> ������ Ÿ���� �������� �ʴ� ���!
	// 3. �޼ҵ��� �̸�
	// 4. �Ű����� : �޼ҵ带 ����� �� ��ᰪ�� �� �� �ִ� �����͸� �ǹ�!
	// 5. �޼ҵ��� ���� �˰����� �ۼ� : {} ��ü �ȿ� �����ϰ��� �ϴ� ���� �۾��� �ۼ��Ѵ�!
	// 6. return Ű���� ���! : ���� �޼ҵ带 ���� �� �� �߻��Ǵ� ������� ������ �� �ִ� ���!
	// void -> ������ Ÿ���� void�� ���� return �̶�� Ű���带 �ۼ����� �ʴ´�.!

	// �޼ҵ� ��� ���
	// 1. �޼ҵ带 ����(����)�Ѵ�.
	// - �޼ҵ带 ���� �� ������ ������ �������� �ʵ��� �����Ѵ�!

	// addNum(3,4);
	public static int addNum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
}