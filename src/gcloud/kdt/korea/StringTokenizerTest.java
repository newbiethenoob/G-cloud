package gcloud.kdt.korea;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public void test(){		
		String test1="a b d f l zz";
		
		StringTokenizer st1 = new StringTokenizer(test1);
		while(st1.hasMoreTokens()){
			System.out.println(st1.nextToken());
		}
		System.out.println();
		
		String test="a&b&d&ffgggg&l&zz";
		StringTokenizer st = new StringTokenizer(test,"&");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
	
	public static void main(String[] args) {
		StringTokenizerTest stt = new StringTokenizerTest();
		stt.test();
	}

}
