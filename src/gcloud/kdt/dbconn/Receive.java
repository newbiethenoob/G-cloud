package gcloud.kdt.dbconn;

public class Receive {

	public void receive(int tv) {
		tv++;
		System.out.println("이 값은 Receive 클래스에서 출력");
	}
	
	
	public void receive1(TestValue tv) {
		tv.result++;
		System.out.println(tv.result);
	}
}
