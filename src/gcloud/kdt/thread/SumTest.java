package gcloud.kdt.thread;


public class SumTest {

	long total;
	long i;
	public void test() {
		long before = System.currentTimeMillis();
		for(i=0;i<=900_000_000_000L;i++) {
			total += i;
		}
		System.out.println(System.currentTimeMillis()-before);
		System.out.println(total);
	}
}
