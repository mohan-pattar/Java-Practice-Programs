package demo;

import java.util.Arrays;

public class AnagramWordsInSentence {
	public static void main(String[] args) {
		String[] ary = {"Act", "Rac", "Abc", "Bac", "Arc", "Bat", "Mat", "Cat"};
		
		for (int i = 0; i < ary.length; i++) {
			for (int j = i+1; j < ary.length; j++) {
				String str1 = ary[i];
				String str2 = ary[j];
				
				char[] ch1 = str1.toLowerCase().toCharArray();
				char[] ch2 = str2.toLowerCase().toCharArray();
				
				Arrays.sort(ch1);
				Arrays.sort(ch2);
				String SortedStr1 = String.valueOf(ch1);
				String SortedStr2 = String.valueOf(ch2);
				
				if (SortedStr1.equalsIgnoreCase(SortedStr2)) {
					System.out.println("\""+str1 +"\""+" and "+ "\"" +str2 + "\"" + " are Anagram words");
				}
				else {
//					System.out.println("\""+str1 +"\""+" and "+ "\"" +str2 + "\"" + " are NOT Anagram words");
				}
			}
		}
		
	}

}
