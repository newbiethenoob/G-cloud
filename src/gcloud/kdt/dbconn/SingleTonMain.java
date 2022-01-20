package gcloud.kdt.dbconn;

public class SingleTonMain {

	public static void main(String[] args) {
		SingleTonTest human = SingleTonTest.getInstance();
		human.test();
	}
}
