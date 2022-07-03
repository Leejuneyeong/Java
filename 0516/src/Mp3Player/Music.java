package Mp3Player;

public class Music {
	
	// mp3에 들어갈 노래를 설계
	
	// 필드
	
	// 노래 제목 ---> title
	private String title;
	// 가수 이름 ---> singer
	private String singer;
	// 플레이 타임 ---> playTime
	private int playTime;
	// 경로 ---> path
	private String path;
	
	// private
	// 생성자
	public Music(String title, String singer, int playTime, String path) {
		this.title=title;
		this.singer=singer;
		this.playTime=playTime;
		this.path=path;
	}
	// getter,setter

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}
