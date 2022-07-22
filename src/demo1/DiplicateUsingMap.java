package demo1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DiplicateUsingMap {
	public static void main(String[] args) {
//		String str = "aaa bb c a bb ccc";
		String str = "My Name is Mohan";
		str = str.replaceAll(" ", "");
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		
		for (int i = 0; i < ch.length; i++) {
		
			if (mp.containsKey(ch[i])) {
				mp.put(ch[i], mp.get(ch[i])+1);
			}
			else {
				mp.put(ch[i], 1);
			}
		}
		
		
		System.out.println(mp);
		
		
//		Map.Entry<Character, Integer> xyz = (Entry<Character, Integer>) mp.entrySet();
		Set<Entry<Character, Integer>> set = mp.entrySet();
		Iterator<Entry<Character, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Entry<Character, Integer> value = it.next();
			if (value.getValue()>1) {
				System.out.println(value.getKey() + " count is "+ value.getValue());
			}
			
		}
		
	}

}
