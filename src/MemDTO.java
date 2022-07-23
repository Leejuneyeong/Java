public class MemDTO {
	// Model
	// 프로그램에서 View와 Controller 사이에서 값을 주고 받을 때 사용하는 데이터 유형
	
	// DTO
	// Data Trasfer Object
	// getter, setter 전부 가지고 있는 객체
	
	// 필드
	private String id;
	private String pw;
	private String name;
	
	// 회원가입진행할때 사용하는 생성자
	public MemDTO(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	// 생성자 오버로딩(중복정의)
	public MemDTO(String name) {
		this.name = name;
	}
	
	public MemDTO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	// getter, setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}