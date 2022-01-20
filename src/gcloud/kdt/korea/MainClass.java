package gcloud.kdt.korea;

public class MainClass {

	public static void main(String[] args) {
//		IfTest it= new IfTest();
//		String grade=it.test(66);
//		System.out.println(grade);
		
//		System.out.println(it.test(66));
		
//		it.switchTest(88);
		
//		ForTest ft = new ForTest();
//		ft.test();
		
//		ArrayTest at = new ArrayTest();
//		at.test1();
		
//		Lotto lotto = new Lotto();
//		lotto.makeLotto();
		
//		TreeSetLotto lotto = new TreeSetLotto();
//		lotto.makeLotto();
		
		Mabang m = new Mabang();	
		Mabang m1 = new Mabang();	
		Mabang m2 = new Mabang();	
		Mabang m3 = new Mabang();	
//		Mabang m = new Mabang(7);	
		m.makeMabang();
		
		System.out.println(Mabang.result);
		
		
		DefaultClass df = new DefaultClass();
//		df.temp;
//		df.temp1;
//		df.temp2;
//		df.temp3;
//		df.temp4;
//		df.temp5;
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println(df.getTemp());
		df.setTemp(30);
		System.out.println(df.getTemp());
		
		
		
		
		
		
		
		
		
		
		
	}

}
