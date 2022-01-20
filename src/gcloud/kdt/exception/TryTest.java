package gcloud.kdt.exception;

public class TryTest {

//예외 처리를 하지 않으면 문법 적으로 에러가 발생
//1. DB 접속
//2. Networking
//3. I/O : 하드디스크에서 파일 읽어오기
//4. 쓰레드
	
	public void test(int num) {
		try {
			int result = 4/num;
			System.out.println(result);
		}catch(Exception e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("네트워크가 원할하지 않습니다. 다시 시도해주세요.");
		}finally {
			System.out.println("이 코드는 예외 발생 유무에 상관없이 실행됩니다.");
		}
	}
	
}
