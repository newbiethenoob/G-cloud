package gcloud.kdt.dbconn;

public class Receive {

	public void receive(int tv) {
		tv++;
		System.out.println("�� ���� Receive Ŭ�������� ���");
	}
	
	
	public void receive1(TestValue tv) {
		tv.result++;
		System.out.println(tv.result);
	}
}
