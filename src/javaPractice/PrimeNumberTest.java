package javaPractice;

public class PrimeNumberTest {
	public static void main(String[] args) {
		int num = 67;
		int startNumber = 2;
		int lastNumber = 100;
		int count = 0;
		
		for (int j = startNumber; j <= lastNumber; j++) {
			Boolean prime = false;			
//			System.out.println("J:- "+ j);
			for (int i = 2; i <= j/2; i++) {
				int reminder = j%i;
//				System.out.println(reminder);
				if (reminder==0) {
					prime = true;
					break;
				}
				
			}
			
			if (!prime) {
				System.out.println(j);
				count++;
			}
			
		}
		
		System.out.println("Total Number of Prime Numbers:- "+ count);
	}

}
