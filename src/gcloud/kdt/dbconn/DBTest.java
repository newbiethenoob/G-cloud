package gcloud.kdt.dbconn;		//sql structure 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import oracle.net.aso.b;
import oracle.security.o3logon.a;

public class DBTest {

//	- ����Ŭ ���� ��� 
//	1. ����Ŭ ����̹� �ε�(Class.forName()���)
//	2. DriverManager�� getConnection()�� �̿��Ͽ� db����
//	3. Connection�� prepareStatement()�� �̿��Ͽ� �������� �ɰ� PreparedStatement�� ���� ����
//	4. PreparedStatement�� �̿��Ͽ� ���� ����
//	5. ������ ������ �ΰ����� ����
//		a. select�� : executeQuery()
//		b.class insert, delete, update �� : executeUpdate()
//	6. 5���� ��쿡�� a�� ResultSet�� ���� ����, 
//		b�� ������ ���� ����
//	7. select���� ������ ���������� ResultSet�� �̿��Ͽ� ���� ���� ���� �о����

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
