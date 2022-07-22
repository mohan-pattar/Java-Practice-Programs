package javaPractice;

import java.util.Scanner;

public class ReverseStr {
	public static void main(String[] args) {
		String str = "Liril";
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb);
		System.out.println(sb.reverse());
		if (str.equalsIgnoreCase(sb.toString())) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is NOT Palindrome");
		}

		System.out.println("--------------------------------");
		char chAry[] = new char[str.length()];
		int count = 0;
		for (int i = str.length()-1; i>= 0 ; i--) {
			System.out.println(str.charAt(i));
			chAry[count] = str.charAt(i);
			count++;
		}
		String newStr = new String(chAry);
		System.out.println("newStr:- "+ newStr);

		
		System.out.println("--------------------------------");
		
		int n1 = 10;
		int n2 = 5;
		
		n1 = n1+n2;
		n2 = n1-n2;
		System.out.println("n2:- "+n2);
		n1 = n1-n2;
		System.out.println("n1:- "+n1);
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num1 = in.nextInt();
		System.out.println("Enter String");
		String str1 = in.next();

		System.out.println("num1:- "+ num1);
		System.out.println("str1:- "+ str1);
		
	}
	
}
