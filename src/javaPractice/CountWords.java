package javaPractice;

import java.util.HashMap;

public class CountWords {
	public static void main(String[] args) {
		
		String str = "My Name is Mohan Pattar";
		HashMap<String, Integer> mp = new HashMap<String, Integer>();
		int count = 1;
		String[] strAry = str.split(" ");
		for (int i = 0; i < strAry.length; i++) {
			
			mp.put(strAry[i], count);
			count++;
		}
		
		System.out.println(mp);
		
	}

}
