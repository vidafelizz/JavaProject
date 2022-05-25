package jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberList {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
//		jdbc:oracle:thin:@호스트:포트번호:서비스이름
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "java";		 // 오라클 접속 아이디
		String pwd = "java1234"; // 비밀번호
		Connection conn = null;	 // DB 접속 객체
		PreparedStatement pstmt = null; // SQL문 실행시키는 객체
		ResultSet rs = null; // 질의어(query문)의 결과값을 반환시키는 객체 (select문에서만 사용됨)
		
		try { // 입출력, 네트워크, DB관련은 필수 예외처리
			Class.forName(driver); // jdbc driver 로딩(생략가능)
			conn = DriverManager.getConnection(url,id,pwd);
			System.out.println("오라클 서버에 접속되었습니다.");
			String sql = "select * from member"; // 질의어(query문), select문
			pstmt = conn.prepareStatement(sql);  // SQL문 실행
			rs = pstmt.executeQuery();			 // 결과값을 리턴받을 수 있도록 실행
			System.out.println("아이디\t비번\t이름");
			
			while(rs.next()) { // 다음 레코드가 존재하면 true
				String userid = rs.getString("userid");
				String passwd = rs.getString("passwd");
				String name = rs.getString("name");
				System.out.println(userid+"\t"+passwd+"\t"+name);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { // 리소스를 닫을때도 열을 때의 역순으로 닫아야함
				if(rs!=null) rs.close(); // 1) ResultSet Close
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(conn!=null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}