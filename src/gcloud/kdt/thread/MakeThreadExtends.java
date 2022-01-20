package gcloud.kdt.thread;

public class MakeThreadExtends extends Thread{

	@Override
	public void run() {
		int result = 0;
		for(int i=0;i<100;i++) {
			result += i;
		}
		System.out.println(result);
		
			
			
	}
	

}
