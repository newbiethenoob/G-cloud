package gcloud.kdt.inheritance;

public class InheritMain {

	public static void main(String[] args) {
	

//			Radio rd = new Radio();
//		Tv tv = new Tv();
//		
//		rd.volumeDown();
//		rd.volumeUp();
		
		//upcasting
//		Elec elec = new Radio();               
//		Elec.volumeDown();                         
		
		InterElec interElec = new InterRadio();           
		InterElec interElec1 = new InterTv();                
	
		interElec.up();                    
		interElec.down(); 
		
		interElec1.up();                
		interElec1.down();                    
		
	}
	
}
