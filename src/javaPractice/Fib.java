package javaPractice;

public class Fib {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int fib;
		int lastNum = 200;
		boolean cond = true;
	
//		for (int i = 0; i < 10; i++) {
//			fib = n1+n2;
//			n1 = n2;
//			n2 = fib;
//			System.out.println(fib);
//		}
		
//		while (cond) {
//			fib = n1+n2;
//			n1 = n2;
//			n2 = fib;
//			if (lastNum<fib) {
//				cond = false;
//			}
//			else {
//				System.out.println(fib);
//			}
//			
//		}
		
		for (;  ; ) {
			fib = n1+n2;
			n1 = n2;
			n2 = fib;
			if (lastNum<fib) {
				break;
			}
			System.out.println(fib);
		}
	}

}
