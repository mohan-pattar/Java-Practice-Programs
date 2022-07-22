package demo;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
	
		Anagram ag = new Anagram();
		ag.checkAnagram("Arc", "Car");
		ag.checkAnagram("Cat", "Act");
		ag.checkAnagram("Mat", "Bat");
		
	}
	
	
	public void checkAnagram(String str1, String str2){
		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		String sortedString1 = String.valueOf(ch1);
		String sortedString2 = String.valueOf(ch2);
		
		if (sortedString1.equalsIgnoreCase(sortedString2)) {
			System.out.println("\""+str1 +"\""+" and "+ "\"" +str2 + "\"" + " are Anagram words");
		}
		else {
			System.out.println("\""+str1 +"\""+" and "+ "\"" +str2 + "\"" + " are NOT Anagram words");
		}
	}

}
