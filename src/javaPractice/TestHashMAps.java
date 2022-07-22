package javaPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestHashMAps {
	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(2103, "Mohan");
		map1.put(2104, "Chethan");
		map1.put(2102, "Prathapu");
		System.out.println(map1);
		
		Set<Integer> set1 = map1.keySet();
		System.out.println("set1:- "+ set1);
		
		System.out.println("2103:- "+ map1.get(2103));
		
		Set<Entry<Integer, String>> set2 = map1.entrySet();
		set2.stream().sorted(Map.Entry.comparingByKey());
		System.out.println("Sorted Set:- "+ set1);
		System.out.println("set2:- "+ set2);
		
		System.out.println("-----------------------------");
		Iterator<Entry<Integer, String>> itr = set2.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----------------------------");
		for (Map.Entry<Integer, String> mp : map1.entrySet()) {
			System.out.println("Key:- "+ mp.getKey());
			System.out.println("Value:- "+ mp.getValue());
		}
		
		System.out.println("------------------");
		Map.Entry<Integer, String> mp1 = (Entry<Integer, String>) map1.entrySet();
		
		
		
	}

}

