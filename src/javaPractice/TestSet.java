package javaPractice;

import java.util.LinkedHashSet;

public class TestSet {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		System.out.println("Set1:- "+ set1);
		
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(11);
		set2.add(12);
		set2.add(13);
		set2.add(14);
		set2.add(15);
		System.out.println("Set2:- "+ set2);
		
		
		LinkedHashSet<Integer> newSet = new LinkedHashSet<Integer>(set1);
		newSet.addAll(set2);
		System.out.println("New Set:- "+ newSet);
		
		
		
	}

}
