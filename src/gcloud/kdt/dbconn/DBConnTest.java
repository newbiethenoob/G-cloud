package gcloud.kdt.dbconn;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBConnTest {
	//singleton 객체 만드는 방법
	//싱글톤 객체는 메모리에 1개만 인스턴스화 되로록 하는것이며
    //외부의 다른 클래스에서 new 연산자를 통해서 인스턴스화 못하도록 해야함
	
	private static DBConnTest dbcon = new DBConnTest();
	
	public static DBConnTest getkdt() {
		if(dbcon==null) {
			dbcon= new DBConnTest();
		}
		return dbcon;
	}


	//	- 오라클 접속 방법
	//	1. 오라클 드라이버 로드(Class.forName()사용)
	//	2. DriverManager의 getConnection() 이용하여 db접속 Connection 리턴 받음
	//	3. Connection의 prepareStatement()를 이용하여 
	//	   쿼리문을 심고  PreparedStatement 리턴 받음
	//	4. PreparedStatement를 이용하여 쿼리실행
	//	5. 쿼리문 실행은 두가지가 있음
	//	  a. select문 : executeQuery() 
	//	  b. insert, delete,update 문 : executeUpdate()
	//	6. 5번의 경우에서  a는 ResultSet을 리턴 받음, 
	//	   b는 정수를 리턴받음
	//	7. select문을 쿼리로 실행했으면 ResultSet을 이용하여
	//	   리턴 받음 값을 읽어내야함	
	public ArrayList<EmployeeDto> test() {
		ArrayList<EmployeeDto> list = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:XE"; //jdbc:oracle:thin:@  이건 정해져있는것
			Connection con=DriverManager.getConnection(dbUrl, "hr", "1234");
			PreparedStatement pstmt =con.prepareStatement("SELECT FIRST_NAME, LAST_NAME FROM EMPLOYEES");
			//ResultSet이 oracle에서 받음
			ResultSet rs=pstmt.executeQuery();
			EmployeeDto ed =null;
			list = new ArrayList<>();
			while(rs.next()) {
				ed = new EmployeeDto();
				ed.setFirstName(rs.getString("FIRST_NAME"));
				ed.setLastName(rs.getString("LAST_NAME"));		
				list.add(ed);	
			}
			rs.close();
			pstmt.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}


}
