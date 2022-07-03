package Mp3Player;

import java.util.ArrayList;
import javazoom.jl.player.MP3Player;

public class Controller {

	MP3Player mp3 = new MP3Player();
	// 1. ���
	// �뷡����
	// �뷡�� ���(play) - list �� index ���� �޾ƿ�

	public void show(ArrayList<Music> list, int index) {
		// How you like that - ����ũ - _��_��
		System.out.println(list.get(index).getTitle() + "-" + list.get(index).getSinger() + "-"
				+ list.get(index).getPlayTime() / 60 + "��" + list.get(index).getPlayTime() % 60 + "��");
	}

	public int play(ArrayList<Music> list, int index) {

		if (mp3.isPlaying()) {
			mp3.stop();
		}

		show(list, index);
		mp3.play(list.get(index).getPath());

		return index;
	}
	
	public void stop() {
		mp3.stop();
		System.out.println("�뷡�� �����Ǿ����ϴ�.");
	}

	// �������� �ҷ��帮�� �޼ҵ�
	public int pre(ArrayList<Music> list, int index) {

		if (mp3.isPlaying()) {
			mp3.stop();
		}
		index--;

		if (index < 0) {
			index = list.size() - 1;
		}
		show(list, index);
		mp3.play(list.get(index).getPath());

		return index;
	}

	public int next(ArrayList<Music> list, int index) {

		if (mp3.isPlaying()) {
			mp3.stop();
		}

		index++;

		if (index > list.size() - 1) {
			System.out.println("�������� �����ϴ�.");
			index = 0; // ��ó�� ������ ���ư���
		}
		// ���� ������� �뷡 ----> ������(�ε���+1)
		// �뷡 ���� ���
		System.out.println(list.get(index).getTitle() + "-" + list.get(index).getSinger() + "-"
				+ list.get(index).getPlayTime() / 60 + "��" + list.get(index).getPlayTime() % 60 + "��");
		// play(���)
		mp3.play(list.get(index).getPath());

		return index;
	}
}
