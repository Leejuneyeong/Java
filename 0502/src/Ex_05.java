import java.util.Random;

public class Ex_05 {

	public static void main(String[] args) {
		// ������ �����ϴ� ���
		// Random Ŭ���� �ʿ�!
		
		// �ҷ��ö� import �۾� �����ϱ�!
		Random rd = new Random();
		
		//0~4������ ���� ����ϱ�
		//rd.nextInt(n) -> 0~n-1 ���� ����

		int num = rd.nextInt(5)+1; //1~5���� ���� ����
		
		System.out.println("������ : "+ num);

	}

}
