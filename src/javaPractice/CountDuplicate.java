package javaPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountDuplicate {
	public static void main(String[] args) {
		String str = "My Name Is Mohan Pattar";
		str = str.replaceAll(" ", "").toLowerCase();
		String[] strAry = str.split("");
		System.out.println(strAry.length);
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < strAry.length; i++) {
			System.out.println("Loop:- "+ i);
			if (map.containsKey(strAry[i])) {
				map.put(strAry[i], map.get(strAry[i])+1);	
			}
			else {
				map.put(strAry[i], 1);
			}
		}
		
		System.out.println(map);
		
		System.out.println("------------------------------------");
		
		char[] ch1 = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = i; j < ch1.length; j++) {
				
				if (ch1[i]==ch1[j]) {
					count++;
				}
			}
			String currentChar = ch1[i]+"";
			if (!str.substring(0, i).contains(currentChar)) {
				System.out.println(ch1[i] +" count is "+ count);
			}
			
		}
		
	}

}
