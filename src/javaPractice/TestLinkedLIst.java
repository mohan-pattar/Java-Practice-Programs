package javaPractice;

import java.util.Collections;
import java.util.LinkedList;

public class TestLinkedLIst {
	public static void main(String[] args) {
		String str = "Hire a progremmer with just 4 words";
		LinkedList<Character> li = new LinkedList<Character>();
//		char[] charAry = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			li.add(str.charAt(i));
		}
		System.out.println(li);
		Collections.reverse(li);
		System.out.println(li);
		String str1 = li.toString();
		System.out.println("str1:- "+ str1);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < li.size(); i++) {
			sb.append(li.get(i));
		}
		System.out.println("str:- "+ str);
		System.out.println("sb:-  "+ sb);
		
	}

}
