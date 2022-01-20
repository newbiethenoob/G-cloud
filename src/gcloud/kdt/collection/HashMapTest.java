package gcloud.kdt.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import gcloud.kdt.inheritance.InterElec;
import gcloud.kdt.inheritance.InterRadio;
import gcloud.kdt.inheritance.InterTv;

public class HashMapTest {
	
	HashMap<String, InterElec> hm;
	
	public void test() {
			
		hm = new HashMap<>();
		hm.put("1st", new InterRadio());
		hm.put("2nd", new InterTv());
		
		//UpCasting
		InterElec el = hm.get("1st");
		el.up();
		el.down();
		
		System.out.println("--------------------------------------------");
		
		 //key���� ����
		Set<String> keys = hm.keySet();
		for(String key : keys) {
			System.out.println(key);
		}
		System.out.println("-------------------------------------------");
		
		//value���� ����
		Collection<InterElec> values = hm.values();
		for(InterElec value : values) {
			System.out.println(value);
			value.up();
			value.down();
		}
		System.out.println("--------------------------------------------");
		
		//key�� value�� ���� ����
		Set<Entry<String, InterElec>> entry = hm.entrySet();
		for(Entry<String, InterElec> aa : entry) {
			System.out.println(aa.getKey());
			System.out.println(aa.getValue());
		}
		System.out.println("-------------------------------------------------");
		
		
		
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		HashMapTest hmt = new HashMapTest();
		hmt.test();
	}

	
}

