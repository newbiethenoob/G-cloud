package gcloud.kdt.korea;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetLotto {
	
	private TreeSet<Integer> ts = new TreeSet<Integer>();
	private Random rd = new Random();	
	
	public void makeLotto() {
		while(ts.size()<6) {
			ts.add(rd.nextInt(45)+1);
		}
		
		System.out.println(ts);
	}

}
