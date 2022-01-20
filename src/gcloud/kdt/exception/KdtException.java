package gcloud.kdt.exception;

public class KdtException extends Exception{

	public KdtException(Exception e) {
		//프로젝트에서 발생하는 예외를 모두 받아서 예외의 종류에 따라 예외 처리하는 코드를 넣으면 됨
		System.out.println("KdtException에서 error를 처리합니다." + e.getMessage());
	}
}
