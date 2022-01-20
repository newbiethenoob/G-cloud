package gcloud.kdt.inheritance;

public interface InterElec {
	
	public default void up() {
		System.out.println("Radio Up");
	}
	
	public default void down() {
		System.out.println("Radio Down");
	}
}
