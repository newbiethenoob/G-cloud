package gcloud.kdt.dbconn;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBConnTest {
	//singleton ��ü ����� ���
	//�̱��� ��ü�� �޸𸮿� 1���� �ν��Ͻ�ȭ �Ƿη� �ϴ°��̸�
    //�ܺ��� �ٸ� Ŭ�������� new �����ڸ� ���ؼ� �ν��Ͻ�ȭ ���ϵ��� �ؾ���
	
	private static DBConnTest dbcon = new DBConnTest();
	
	public static DBConnTest getkdt() {
		if(dbcon==null) {
			dbcon= new DBConnTest();
		}
		return dbcon;
	}


	//	- ����Ŭ ���� ���
	//	1. ����Ŭ ����̹� �ε�(Class.forName()���)
	//	2. DriverManager�� getConnection() �̿��Ͽ� db���� Connection ���� ����
	//	3. Connection�� prepareStatement()�� �̿��Ͽ� 
	//	   �������� �ɰ�  PreparedStatement ���� ����
	//	4. PreparedStatement�� �̿��Ͽ� ��������
	//	5. ������ ������ �ΰ����� ����
	//	  a. select�� : executeQuery() 
	//	  b. insert, delete,update �� : executeUpdate()
	//	6. 5���� ��쿡��  a�� ResultSet�� ���� ����, 
	//	   b�� ������ ���Ϲ���
	//	7. select���� ������ ���������� ResultSet�� �̿��Ͽ�
	//	   ���� ���� ���� �о����	
	public ArrayList<EmployeeDto> test() {
		ArrayList<EmployeeDto> list = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:XE"; //jdbc:oracle:thin:@  �̰� �������ִ°�
			Connection con=DriverManager.getConnection(dbUrl, "hr", "1234");
			PreparedStatement pstmt =con.prepareStatement("SELECT FIRST_NAME, LAST_NAME FROM EMPLOYEES");
			//ResultSet�� oracle���� ����
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
