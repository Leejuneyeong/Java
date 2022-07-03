package Mp3Player;

import java.util.ArrayList;
import java.util.Scanner;

 class Main {

	public static void main(String[] args) {
		// [1] ��� [2] ���� [3] ������ [4] ������ [5] ����
		Scanner sc = new Scanner(System.in);
		// �ܺ� jar ���� �ִ� ���
		// ������Ʈ ���콺 ��Ŭ�� ---> BuildPath ----> configure build path
		// library ---> classpath ----> external jars

		MP3Player mp3 = new MP3Player(); // ������ ���� <- ������ ���
		Controller c = new Controller();
		String path = "C:\\Users\\smhrd\\Desktop\\music\\"; // ������ Ȯ���ڱ��� ���������

		// 1. ���
		// mp3.play(path);
		// 2. ����
		// mp3.stop();

		// ���� ������~(Music)
		Music music1 = new Music("How you like that", "����ũ", 59, path + "How you like that.mp3");
		Music music2 = new Music("MAGO", "����ģ��", 52, path + "MAGO.mp3");
		Music music3 = new Music("Maria", "ȭ��", 60, path + "Maria.mp3");
		Music music4 = new Music("��", "��", 89, path + "��.mp3");
		Music music5 = new Music("��¦������", "�����̰�", 130, path + "��¦������.mp3");

		// Music �ڷ����� ���� �� �ִ� ArrayList�� ������
		ArrayList<Music> list = new ArrayList<>(); // <>Ÿ�Կ� ��ü�����ڴ� �̸� �־�ߵ�
		list.add(music1);
		list.add(music2);
		list.add(music3);
		list.add(music4);
		list.add(music5);

		// mp3.isPlaying(); --> boolean ���� // �뷡�� ������̴� �ƴϴ� �Ǵ�
		int index = 0;
		while (true) {
			System.out.println("[1] ��� [2] ���� [3] ������ [4] ������ [5] ���� >> ");
			int select = sc.nextInt();
			// select�� � �������� �Ǵ� -> ���ǽ�
			if (select == 1) {
				index = c.play(list,index);
				// ���
		
			} else if (select == 2) {
				// ����
			
				c.stop();

			} else if (select == 3) {
				// ������
			
				index = c.pre(list, index);
				
			} else if (select == 4) {
				// ������
			
				index = c.next(list,index);

			} else if (select == 5) {
				// ���α׷� ����
				c.stop();
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			} else {
				System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}

}
