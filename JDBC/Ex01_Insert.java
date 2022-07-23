import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01_Insert {

	public static void main(String[] args) {
		
		// 휘발성 데이터 : class를 실행만 시켰을 때 저장되는 데이터
		// 비휘발성 데이터 : 실행을 종료해도 남아있는 데이터
		
		Scanner sc = new Scanner(System.in);
		PreparedStatement psmt = null;
		Connection conn =null;
		
		System.out.println("ID를 입력해주세요 >> ");
		String id = sc.next();
		System.out.println("PW를 입력해주세요 >> ");
		String pw = sc.next();
		System.out.println("이름을 입력해주세요 >> ");
		String name = sc.next();
		
		// 1. JDBC ---> ojdbc6.jar 파일 가져오기
		// 1-1) 드라이버 동적로딩
		// 실행하는 순간에 자료형이 결정되는 것
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 어떤 데이터베이스의 드라이버를 가지고 올건지 정해주는 코드
			
			// 오류 ( try-catch ) 사용
			// 1) 런타임 오류
			// 2) 컴파일 오류
			
			// oracle.jdbc.driver ---> 패키지
			// OracleDriver ---> 클래스
			
			// url, id, pw 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			//jdbc:oracle:thin : 드라이버
			//@localhost : ip주소
			// 1521 : 포트번호
			// xe : DB이
			String user = "hr"; // 데이터 베이스 계정
			String password = "hr"; // 비밀번호
			
			conn = DriverManager.getConnection(url,user,password);
			
			// 2. SQL문을 준비
			// 2-1 ) SQL문 만들기
			String sql = "insert into mem values(?, ?, ?)";
			// 2-2 ) SQL문 전송
			psmt = conn.prepareStatement(sql);
			// --- > sql구문 양식에 맞게 담아주는 구문
			
			// ? 인자를 채워서 보내줄거에요!!!!!! <---- 입력받은 데이터로 채워주자!!!
			psmt.setString(1, id); // 첫번 째 ?  값에는 id를 보냄
			psmt.setString(2, pw); // 두번 째 ? 값에는 pw를 보냄
			psmt.setString(3, name); // 세번 째  ? 값에는 name을 보냄
			
			// ? 인자가 table에 맞게 채워졌는지 꼭 확인해주세요!!!!
			// 영향을 받은 줄(테이블)이 있는지 확인을 해주는 기능
			int row = psmt.executeUpdate();
			
			// row > 0 : 영향을 받은 테이블이 있다 !
			// 그게 아니라면 데이터가 입력이 안됐다.
			if(row>0) {
				System.out.println("데이터 추가 성공!!");
			}else {
				System.out.println("데이터 추가 실패 ㅠㅜ");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 오류");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("연결 실패");
			e.printStackTrace();
		} finally {
			// 중간에 예외상황이 생기더라도 한번은 꼭 실행시키게 만드는 구문
			// 4. 닫기
			//★★★★★★ (사용한 반대방향으로 닫자 !!! 역순으로 닫자 !!!)★★★★★★
			
			try {
				//psmt가 열려있다면 닫아주자~!!!
				// psmt가 값이 들어가있으면 즉, null 값이 아니라면 사용중인 상태임
				if(psmt != null)
					psmt.close();
				
				if(conn != null)
					conn.close();
				
			} catch (SQLException e) {
				System.out.println("반납 오류");
				e.printStackTrace();
			}
		}
	
	}

}
