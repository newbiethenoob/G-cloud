package gcloud.kdt.inter;

public class InheritMain {
	
	public static void main(String[] args) {
	

		Radio rd = new Radio();
		Tv tv = new Tv();
		
		rd.volumeDown();
		rd.volumeUp();
		
		//upcasting
		Elec elec = new Radio();
		elec.volumeDown();
	}
}
