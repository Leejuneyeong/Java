
public class Ex_02 {

	public static void main(String[] args) {
		
		// 1. 배열 생성
		// String 형태의 'team' 배열 생성
		// 크기는 팀원의 수 만큼!
		
		String[] team = new String[5];
		
		// 2. 각각의 공간에 팀원 이름 저장
		
		team[0] = "이준영";
		team[1] = "이준호";
		team[2] = "노준호";
		team[3] = "박예림";
		team[4] = "이새롬";
		
		// 3. 전체 팀원 이름 출력하기!
		// 반복문을 활용하여 출력!
		
		for(int i =0;i<team.length;i++) {
		System.out.println(team[i]+ " ");
		}
		
	}

}
