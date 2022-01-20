package gcloud.kdt.inter;


//인터페이스에 선언하는 메소드는 전부 추상메소드임
//인터페이스에 선언하는 변수는 전부 public final static
//인터페이스는 인스턴스화 할 수 없음
public interface InterTest {
	double PI = 3.14d; 	//interface 안의 변수는 대문자
	
	int TOTAL_ACCOUNT = 9;
	
	public void volumeUp();
	public void voloumeDown();
}
