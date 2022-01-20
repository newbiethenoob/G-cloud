package gcloud.kdt.practice;

public class Exam2 {

	public void max(int i, int j) {
		if(i>j) System.out.println(i);
		else System.out.println(j);
	}
	
	public String toLowerString(String str) {
		StringBuilder result = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char st = str.charAt(i);
			if((byte)st>=65 && (byte)st<=90) {
				result.append((char)((byte)st+32));
			}else {
				result.append(st);
			}
		}
	
		return result.toString();
	}
	
	public boolean isLeapYear(int year) {
		boolean result = false;
		if(year%4 == 0 && !(year%4 == 0 && year%100 == 0)) {
			result = true;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Exam2 e2 = new Exam2();
		
		
		e2.max(1, 100);
		
		String resultstr = e2.toLowerString("HelLo");
		System.out.println(resultstr);
		
		int year = 2022;
		boolean result = e2.isLeapYear(year);
		if(result ) {
			System.out.println(year+"³âÀº À±³âÀÔ´Ï´Ù.");
		}else {
			System.out.println(year+"³âÀº À±³âÀÌ ¾Æ´Õ´Ï´Ù.");
		}
		
	}
}




//A = 41 > 65
//a = 61 > 97