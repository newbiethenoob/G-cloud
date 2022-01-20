package gcloud.kdt.korea;

public class AccessTest {
//	  * 클래스
//	  1. public : 접근 제한이 없음
//    2. 디폴트 접근 제한자(아무것도 안붙어 있는것) ex) class AccessTest{ } : 같은 패키지내에 있는 클래스만 접근 가능 
//	  3. private은 붙을수 없음
//	  4. final : 상속 받을수 없음
	
//	  * 메소드
//	  1. public : 접근 제한이 없음
//    2. 디폴트 접근 제한자(아무것도 안붙어 있는것) : 같은 패키지내에 있는 클래스만 접근 가능 
//	  3. private : 다른 클래스에서 접근 못함  -> 싱글톤 만들때 사용 하게됨
//	  4. final : 오버라이딩 할 수 없음
	
//	 * 변수
//	  1. public : 접근 제한이 없음
//    2. 디폴트 접근 제한자(아무것도 안붙어 있는것) : 같은 패키지내에 있는 클래스만 접근 가능 
//	  3. private : 다른 클래스에서 접근 못함  
//	  4. final : 상수가 됨
	
	private int i =10;
	final int j=9;
	
	public void test() {
		System.out.println(i);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  
}
