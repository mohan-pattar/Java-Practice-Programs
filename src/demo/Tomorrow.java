package demo;

import java.util.Arrays;

public class Tomorrow {
	public static void main(String[] args) {
		Tomorrow tom = new Tomorrow();
		tom.replaceCharWithStar("Tomorrow", 'o');
		tom.replaceCharWithStar("Moon", 'o');
		tom.replaceCharWithStar("Banana", 'a');
		tom.replaceCharWithStar("Tata", 'a');
		
	}
	
	public void replaceCharWithStar(String str, char chr) {
//		String str = "Tomorrow";
		String ch = "";
		
		String[] strArray = new String[str.length()];
		char[] strChar = str.toCharArray();
		
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			String charVal = Character.toString(strChar[i]);
//			System.out.println("charVal:- "+ charVal);
			if (strChar[i]==chr) {
//				System.out.println("Character at ["+i+"]:- "+ strChar[i]);
				for (int j = 0; j < count; j++) {
					ch = ch+"*";
				}
				
				charVal = ch;
				count++;
			}
			strArray[i] = charVal;
			
		}
		
//		System.out.println("I/P:- "+ Arrays.toString(strChar));
//		System.out.println("O/P:- "+ Arrays.toString(strArray));
		System.out.println("I/P:- "+ str);
		System.out.println("O/P:- "+String.join("", strArray));
		System.out.println();
	}
	
	
	

}
