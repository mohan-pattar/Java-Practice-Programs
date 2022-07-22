package javaPractice;

import java.util.Arrays;

public class PrintArray {
	public static void main(String[] args) {
//		String str = "Mohan";
//		char[] ch = str.toCharArray();
//		System.out.println(ch);
//		System.out.println("ch:- "+ ch);
//		
		
		String str[] = {"Men", "Women", "Kids"};
		System.out.println(str);
		Arrays.sort(str);
		
		String[] cloneAry = str.clone();
		System.out.println("CLone ARy "+Arrays.toString(cloneAry));
		System.out.println(Arrays.toString(str));
		String xyz = Arrays.toString(str);
		System.out.println(xyz.charAt(0));
		
		
	}

}
