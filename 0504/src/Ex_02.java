
public class Ex_02 {

	public static void main(String[] args) {
		
		// 1. �迭 ����
		// String ������ 'team' �迭 ����
		// ũ��� ������ �� ��ŭ!
		
		String[] team = new String[5];
		
		// 2. ������ ������ ���� �̸� ����
		
		team[0] = "���ؿ�";
		team[1] = "����ȣ";
		team[2] = "����ȣ";
		team[3] = "�ڿ���";
		team[4] = "�̻���";
		
		// 3. ��ü ���� �̸� ����ϱ�!
		// �ݺ����� Ȱ���Ͽ� ���!
		
		for(int i =0;i<team.length;i++) {
		System.out.println(team[i]+ " ");
		}
		
	}

}
