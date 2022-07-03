package Mp3Player;

import java.util.ArrayList;
import javazoom.jl.player.MP3Player;

public class Controller {

	MP3Player mp3 = new MP3Player();
	// 1. 재생
	// 노래정보
	// 노래를 재생(play) - list 와 index 값을 받아옴

	public void show(ArrayList<Music> list, int index) {
		// How you like that - 블랙핑크 - _분_초
		System.out.println(list.get(index).getTitle() + "-" + list.get(index).getSinger() + "-"
				+ list.get(index).getPlayTime() / 60 + "분" + list.get(index).getPlayTime() % 60 + "초");
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
		System.out.println("노래가 정지되었습니다.");
	}

	// 이전곡을 불러드리는 메소드
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
			System.out.println("다음곡이 없습니다.");
			index = 0; // 맨처음 곡으로 돌아가기
		}
		// 현재 재생중인 노래 ----> 다음곡(인덱스+1)
		// 노래 정보 출력
		System.out.println(list.get(index).getTitle() + "-" + list.get(index).getSinger() + "-"
				+ list.get(index).getPlayTime() / 60 + "분" + list.get(index).getPlayTime() % 60 + "초");
		// play(경로)
		mp3.play(list.get(index).getPath());

		return index;
	}
}
