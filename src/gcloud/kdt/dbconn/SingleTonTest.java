package gcloud.kdt.dbconn;

public class SingleTonTest {
//	1. 싱글톤 객체는 메모리에 1개만 인스턴스화 해서 공유함
//	2. 다른 클래스에서 new 연산자를 사용해서 인스턴스화 할 수 없음
//	3. public 메소드를 이요해서 이스턴스를 얻을 수 있음
	
	static SingleTonTest stt = new SingleTonTest();
	
	private SingleTonTest() {
		
	}
	
	public static SingleTonTest getInstance() {
		if(stt == null) {
			stt = new SingleTonTest();
		}
		return stt;
	}

	public void test() {
		// TODO Auto-generated method stub
		
	}
}
