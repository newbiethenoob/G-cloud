package gcloud.kdt.korea;

public class IfTest {

	//	public void test(int score){//파라미터(parameter), 인자, 아규먼트(arguement)
	//		if(score>90){
	//			System.out.println("A");
	//		}else if(score>80){
	//			System.out.println("B");
	//		}else if(score>70){
	//			System.out.println("c");
	//		}else{
	//			System.out.println("F");
	//		}			
	//
	//	}	

	public String test(int score) {
		String grade=null;
		if(score>90){
			grade= "A";
		}else if(score>80){
			grade= "B";
		}else if(score>70){
			grade= "c";
		}else{
			grade="F";
		}


		return grade;
	}

	public void test1(int score){//파라미터(parameter), 인자, 아규먼트(arguement)
		if(score>90){
			System.out.println("A");
		}else{
			System.out.println("F");
		}	


	}	



	public void switchTest(int score){
		//		switch문에 문자열도 자바 1.7이후부터는 가능
		switch (score) {
		case 90:
			System.out.println("A");			
			break;
		case 80:
			System.out.println("B");			
			break;
		case 70:
			System.out.println("C");			
			break;			
		default:
			System.out.println("F");
			break;
		}
	}








}
