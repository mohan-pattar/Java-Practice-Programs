package javaPractice;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String [] str = {"cat", "mat", "act", "tac"};
		

		for (int i = 0; i < str.length; i++) {

			char[] ch1 = str[i].toCharArray();
			
			for (int j = i+1; j < str.length; j++) {
				System.out.println(" "+str[i] + " " + str[j]);
				char[] ch2 = str[j].toCharArray();
				
				Arrays.sort(ch1);
				Arrays.sort(ch2);
				
				System.out.println(Arrays.equals(ch1, ch2));
			}
			
		}
	}

}
