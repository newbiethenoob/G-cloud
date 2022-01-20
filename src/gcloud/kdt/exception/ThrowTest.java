package gcloud.kdt.exception;

public class ThrowTest {

	public void test(int num) {
		try {
			int result = 4/num;
			System.out.println(result);
		}catch(Exception e) {
			new KdtException(e);
		}
	}
}
