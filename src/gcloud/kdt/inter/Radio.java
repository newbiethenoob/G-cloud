package gcloud.kdt.inter;

public class Radio extends Elec {

	@Override//애노테이션
	public void volumeUp() {
		System.out.println("Radio의 볼륨업입니다");
	}

	@Override//메소드 오버라이딩(overriding)
	public void volumeDown() {
		System.out.println("Radio의 볼륨다운입니다");
	}

	
	
}
