import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] team = { "���ؿ�", "����ȣ", "����ȣ", "�̻���", "�ڿ���" };
		System.out.print("�˻��� �̸��� �Է��ϼ���. >> ");
		String name = sc.next();

		for (int i = 0; i < team.length; i++) {
			if (team[i].equals(name)) {
				System.out.print(name + "���� " +(i+1)+"��° �ε����� ����Ǿ� �ֽ��ϴ�.");
			}
		}
	}
}
