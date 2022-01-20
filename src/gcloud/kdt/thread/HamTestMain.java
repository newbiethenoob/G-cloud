package gcloud.kdt.thread;

public class HamTestMain {

	static Supply sp = new Supply();
	
	public static void main(String[] args) {
		sp.start();
		Consumer cs = new Consumer();
		Consumer cs1 = new Consumer();
		Consumer cs2 = new Consumer();
		Consumer cs3 = new Consumer();
		
		cs.start();
		cs1.start();
		cs2.start();
		cs3.start();
	}
}
