package gcloud.kdt.exception;

public class Test {

	public void test() {
		ThrowsTest tt = new ThrowsTest();
		try {
			tt.test(0);
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Test class call error.");
		}
	}
}
