package javaPractice;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		
		TreeSet<String> set1 =  new TreeSet<String>();
		set1.add("Mohan");
		set1.add("Pattar");
		set1.add("QA");
		set1.add("Automation");
		set1.add("Livearea");
		set1.add("A Merkle Company");
		
		System.out.println("Set1:- "+  set1);
		
		System.out.println("----------------------");
		Iterator<String> it = set1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("----------------------");
		Iterator<String> descendingSet = set1.descendingIterator();
		while (descendingSet.hasNext()) {
			System.out.println(descendingSet.next());
			
		}
		
	}

}
