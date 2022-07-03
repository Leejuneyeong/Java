
public class Address {
	// 주소록 설계도 
	
	// 이름 String name
	// 연락처 String tell
	
	private String name;
	private String tell;
	
	public Address(String name, String tell) {
		this.name=name;
		this.tell=tell;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTell() {
		return tell;
	}

	public void setTell(String tell) {
		this.tell = tell;
	}
	
	
}
