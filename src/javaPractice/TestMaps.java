package javaPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestMaps {
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Mohan");
		hmap.put(3,null);
		hmap.put(2, "Pattar");
		hmap.put(4, "A");
		hmap.put(5, "Mohan");
		hmap.put(null, null);
		System.out.println(hmap);
		
		System.out.println("--------------------------------------");
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(1, "Mohan");
		tmap.put(3, "Pattar");
		tmap.put(2, "A");
		tmap.put(4, null);
//		tmap.put(null, null);
		System.out.println(tmap);
		
		System.out.println("--------------------------------------");
		
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();
		lmap.put(1, "Mohan");
		lmap.put(2, "Pattar");
		lmap.put(3, "QA");
		lmap.put(4, null);
		lmap.put(null, null);
		System.out.println(lmap);
		
		Iterator<Entry<Integer, String>> itr = lmap.entrySet().iterator();
		while (itr.hasNext()) {
			
			
		}
		
	}

}
