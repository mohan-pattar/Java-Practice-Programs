package javaPractice;

import java.util.Arrays;

public class SortNumber {
	public static void main(String[] args) {
//		int[] num = {4,2,7,8,5,9,0};
		int[] num = {15, 4, 23, 7, 39, 19, 0, 9, 14};
		int[] newAry = new int[num.length];
		newAry = num.clone();
		
		Arrays.sort(newAry);
		System.out.println(newAry[newAry.length-2]);
		System.out.println(Arrays.toString(newAry));
		
		System.out.println("---------------------");
		
		for (int j = 0; j < num.length; j++) {
			for (int i = 0; i < num.length-1; i++) {
				int temp;
				if (num[i]>num[i+1]) {
					temp = num[i];
					num[i] = num[i+1];
					num[i+1]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(num));
	}

}
