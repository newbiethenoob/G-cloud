package gcloud.kdt.collection;

import java.util.ArrayList;
import gcloud.kdt.inheritance.InterElec;
import gcloud.kdt.inheritance.InterRadio;
import gcloud.kdt.inheritance.InterTv;


//ArrayList(동기화기능이 없음)와 Vector(동기화 기능 있음)은 기능이 똑같음
public class ArrayListTest {
	
	ArrayList<InterElec> ar;
	int[] mabang;
	long time;
	
	public void test() {
		time = System.currentTimeMillis();
		System.out.println(time);
		//ar = new ArrayList<InterElec>();
		ar = new ArrayList<>();
		mabang = new int[5];
		
		ar.add(new InterRadio());
		ar.add(new InterTv());
		
		//익명클래스 사용법
		ar.add(new InterElec() {

			@Override
			public void up() {
				System.out.println("Mp3 Up");
			}

			@Override
			public void down() {
				System.out.println("Mp3 Down");
			}
			
		});
		
		System.out.println(ar.size());
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		for(InterElec aa : ar) {
			aa.up();
			aa.down();
		}
		System.out.println(System.currentTimeMillis()-time);
	}
	
	public static void main(String[] args) {
		ArrayListTest alt = new ArrayListTest();
		alt.test();
	}
}
