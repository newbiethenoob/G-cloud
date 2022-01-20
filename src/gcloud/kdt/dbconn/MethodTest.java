package gcloud.kdt.dbconn;

public class MethodTest {
//클래스는 변수(필드) + 메소드로 구성 ---> 메소드의 형태 ~~(){ }
	int i=9;; //타입 변수명 = 값;
	
	public void test() {
		Receive rc = new Receive();
		//메소드의 파라미터로 primitive 타입이 넘어가면 값 자체가 복사됨
		//보내는 쪽과 받는 쪽이 서로 다른 값임
		rc.receive(i);
		System.out.println("이 값은 Test에서 출력 " + i);
		
		
		TestValue tv = new TestValue();
		//메소드의 파라미터로 reference 타입이 넘어가면 주소가 복사됨
		//보내는 쪽과 받는 쪽이 서로 같은 주소를 가지게 되어서 메로리에서 같은 객체임
		rc.receive1(tv);
		System.out.println(tv.result);
				
	}

}
