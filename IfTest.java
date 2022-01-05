package gcloud.kdt.korea;

public class IfTest {
	
	public void test(int score) { //파라미터, 인자, parameter
		if(score>90) {
			System.out.println("A");
		}else if(score>80) {
			System.out.println("B");
		}else if(score>70) {
			System.out.println("c");
		}else {
			System.out.println("F");
		}
	}

}
