package demo;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Duplicate {
	public static void main(String[] args) {

		Duplicate dup = new Duplicate();
		dup.countCharacters("Tomorrow");
		dup.countCharacters("Moon");
		dup.countCharacters("My Name Is Mohan");
		
	}

	
	public void countCharacters(String str){
//		String str = "Tomorrow";
		System.out.println(str);
		
//		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		
		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
//			System.out.println("Loop:- "+ i);
			if (hm.containsKey(ch[i])) {
//				System.out.println(ch[i]+" Present");
				hm.put(ch[i], hm.get(ch[i])+1);
			}
			else {
				hm.put(ch[i], 1);
			}
		}
		
		System.out.println(hm);
		System.out.println();
	}
}
