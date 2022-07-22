package javaPractice;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
	public static void main(String[] args) {
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Mohan");
		set1.add("Pattar");
		set1.add("QA");
		set1.add("Automation");
		
		System.out.println("---------- FOR EACH LOOP ----------");
		System.out.println("Set1:- "+  set1);
		System.out.println("Set Size:- "+ set1.size());
		for (String string : set1) {
			System.out.println(string);
		}
		
		System.out.println("---------- ToArray For LOOP ----------");
		Object[] setAry = set1.toArray();
		for (int i = 0; i < setAry.length; i++) {
			System.out.println(setAry[i]);
		}
		
		System.out.println("---------- iterator ----------");
		Iterator<String> itr = set1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}

}
