package gcloud.kdt.dbconn;		//sql structure 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import oracle.net.aso.b;
import oracle.security.o3logon.a;

public class DBTest {

//	- 오라클 접속 방법 
//	1. 오라클 드라이버 로드(Class.forName()사용)
//	2. DriverManager의 getConnection()을 이용하여 db접속
//	3. Connection의 prepareStatement()를 이용하여 쿼리문을 심고 PreparedStatement을 리턴 받음
//	4. PreparedStatement를 이용하여 쿼리 실행
//	5. 쿼리문 실행은 두가지가 있음
//		a. select문 : executeQuery()
//		b.class insert, delete, update 문 : executeUpdate()
//	6. 5번의 경우에서 a는 ResultSet을 리턴 받음, 
//		b는 정수를 리턴 받음
//	7. select문을 쿼리로 실행했으면 ResultSet을 이용하여 리턴 받은 값이 읽어내야함

	public void test() {
		PreparedStatement pstmt;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
			Connection con = DriverManager.getConnection(url, "hr", "1234");
			pstmt = con.prepareStatement("select FIRST_NAME, LAST_NAME, salary from employees");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getString("FIRST_NAME")+" ");
				System.out.print(rs.getString("LAST_NAME")+" ");
				System.out.println(rs.getString("salary")+" ");
			}
			rs.close();
			pstmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DBTest ddb = new DBTest();
		ddb.test();
	}
}
