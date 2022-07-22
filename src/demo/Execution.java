package demo;

import java.util.Arrays;

public class Execution extends Calculation{
	public static void main(String[] args) {
//		int result = Calculation.sumOfTwoNum(10, 20);
//		System.out.println(result);
//		System.out.println(Calculation.getName());
//		System.out.println(Calculation.id);
//		Calculation.empDetails();
//		System.out.println("-----------------");
//		System.out.println(Calculation.getName());
//		Calculation.empDetails();
		
		
		int[] ar = {31,20,21,58,69,55,89};
		System.out.println(Arrays.toString(ar));
		for (int i = 0; i < ar.length; i++) {
			
			for (int j = 0; j < ar.length-1; j++) {
				int temp;
				if (ar[j]>ar[j+1]) {
					temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(ar));
		
		
	}


	
}
