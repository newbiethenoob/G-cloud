package gcloud.kdt.dbconn;

import java.util.ArrayList;

public class DBConnMain {

	public static void main(String[] args) {
		ArrayList<EmployeeDto> list = DBConnTest.getkdt().test();
		
	}
}
