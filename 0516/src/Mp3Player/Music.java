package Mp3Player;

public class Music {
	
	// mp3�� �� �뷡�� ����
	
	// �ʵ�
	
	// �뷡 ���� ---> title
	private String title;
	// ���� �̸� ---> singer
	private String singer;
	// �÷��� Ÿ�� ---> playTime
	private int playTime;
	// ��� ---> path
	private String path;
	
	// private
	// ������
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
