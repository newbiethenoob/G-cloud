package gcloud.kdt.exception;

public class Test1 {
	
	public void test() {
		ThrowsTest tt = new ThrowsTest();
		try {
			tt.test(0);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Test1 class call error.");
		}
	}
}
