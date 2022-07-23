public class MemDTO {
	// Model
	// ���α׷����� View�� Controller ���̿��� ���� �ְ� ���� �� ����ϴ� ������ ����
	
	// DTO
	// Data Trasfer Object
	// getter, setter ���� ������ �ִ� ��ü
	
	// �ʵ�
	private String id;
	private String pw;
	private String name;
	
	// ȸ�����������Ҷ� ����ϴ� ������
	public MemDTO(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	// ������ �����ε�(�ߺ�����)
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