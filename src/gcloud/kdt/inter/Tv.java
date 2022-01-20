package gcloud.kdt.inter;

public class Tv extends Elec{

	@Override
	public void volumeUp() {
		System.out.println("TV의 볼륨업입니다");
	}

	@Override
	public void volumeDown() {
		System.out.println("TV의 볼륨다운입니다");
	}

}
