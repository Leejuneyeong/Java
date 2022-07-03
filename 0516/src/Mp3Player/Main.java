package Mp3Player;

import java.util.ArrayList;
import java.util.Scanner;

 class Main {

	public static void main(String[] args) {
		// [1] 재생 [2] 정지 [3] 이전곡 [4] 다음곡 [5] 종료
		Scanner sc = new Scanner(System.in);
		// 외부 jar 파일 넣는 방법
		// 프로젝트 마우스 우클릭 ---> BuildPath ----> configure build path
		// library ---> classpath ----> external jars

		MP3Player mp3 = new MP3Player(); // 생성자 생성 <- 실질적 기능
		Controller c = new Controller();
		String path = "C:\\Users\\smhrd\\Desktop\\music\\"; // 파일의 확장자까지 적어줘야함

		// 1. 재생
		// mp3.play(path);
		// 2. 정지
		// mp3.stop();

		// 곡을 만들어보자~(Music)
		Music music1 = new Music("How you like that", "블랙핑크", 59, path + "How you like that.mp3");
		Music music2 = new Music("MAGO", "여자친구", 52, path + "MAGO.mp3");
		Music music3 = new Music("Maria", "화사", 60, path + "Maria.mp3");
		Music music4 = new Music("깡", "비", 89, path + "깡.mp3");
		Music music5 = new Music("살짝설렜어", "오마이걸", 130, path + "살짝설렜어.mp3");

		// Music 자료형을 담을 수 있는 ArrayList를 만들어보자
		ArrayList<Music> list = new ArrayList<>(); // <>타입에 객체생성자는 이름 넣어야됨
		list.add(music1);
		list.add(music2);
		list.add(music3);
		list.add(music4);
		list.add(music5);

		// mp3.isPlaying(); --> boolean 값임 // 노래가 재생중이니 아니니 판단
		int index = 0;
		while (true) {
			System.out.println("[1] 재생 [2] 정지 [3] 이전곡 [4] 다음곡 [5] 종료 >> ");
			int select = sc.nextInt();
			// select가 어떤 숫자인지 판단 -> 조건식
			if (select == 1) {
				index = c.play(list,index);
				// 재생
		
			} else if (select == 2) {
				// 정지
			
				c.stop();

			} else if (select == 3) {
				// 이전곡
			
				index = c.pre(list, index);
				
			} else if (select == 4) {
				// 다음곡
			
				index = c.next(list,index);

			} else if (select == 5) {
				// 프로그램 종료
				c.stop();
				System.out.println("프로그램이 종료되었습니다.");
				break;
			} else {
				System.out.println("숫자를 잘못 입력하셨습니다.");
			}
		}
	}

}
