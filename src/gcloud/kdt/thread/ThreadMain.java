package gcloud.kdt.thread;

public class ThreadMain {
	static long total = 0;

	public static void main(String[] args) {
//		MakeThreadExtends mte = new MakeThreadExtends();
//		mte.start();
//		
//		MakeThreadImplements mti = new MakeThreadImplements();
//		new Thread(mti).start();
		
//		SumTest st = new SumTest();
//		st.test();
		
		SumTestThread stt = new SumTestThread(30_000_000_000L);
		SumTestThread stt1 = new SumTestThread(60_000_000_000L);
		SumTestThread stt2 = new SumTestThread(90_000_000_000L);
		
		stt.start();
		stt1.start();
		stt2.start();
		
	
	}
}
