package jdbc.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import jdbc.DB;

public class MemberInsert {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DB.oraConn(); // static이기 때문에 new 안해도 됨
			
			Scanner sc = new Scanner(System.in);
			System.out.print("아이디 : ");
			String userid = sc.next();
			System.out.print("비밀번호 : ");
			String passwd = sc.next();
			System.out.print("이름 : ");
			String name = sc.next();
			sc.close();
			
			String sql = "insert into member (userid, passwd, name) values"
					+ "(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, passwd);
			pstmt.setString(3, name);
			pstmt.executeUpdate(); // insert문, delete문, update문에서 사용
			System.out.println("저장되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}			
		}
	}
}
