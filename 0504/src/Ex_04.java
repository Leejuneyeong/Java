import java.util.Random;

public class Ex_04 {

	public static void main(String[] args) {

		// 1. �������� �迭 'array'
		// ũ��� 10��
		int[] array = new int[10];
		// 2. ����(Random)�� ����� ��� �ҷ�����
		// ������ 1~20����
		Random rd = new Random();

		// 3. �� �迭�� ������ ������ �����ϱ�
		// for�� Ȱ�� ����
		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(20) + 1;
			
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();

		int sum1 = array[3] + array[8];

		System.out.println("�� : "+sum1);

		int sum2 = 0;
		double avg = 1;

		for (int i = 0; i < array.length; i++) {
			sum2 = sum2 + array[i];
		}

		avg = (double)sum2 / array.length;
		
		// ���� ���� -> ����
		// �Ǽ� �Ǽ� -> �Ǽ�
		// ���� �Ǽ� -> �Ǽ�
		
		/*
		int a =3;
		double b = 5.12;
		
		//�Ǽ� = ����; -> ������ ����ȯ
		b=a;
		System.out.println("������ ����ȯ : "+b);
		
		//����� ����ȯ
		a=(int)b;
		System.out.println("����� ����ȯ : "+a);
		*/
		
		System.out.println("��ü�� : "+sum2);
		System.out.println("��� : "+avg);
	}

}
