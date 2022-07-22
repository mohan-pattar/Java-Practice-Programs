package javaPractice;

public class TestVariables {
	public static void main(String[] args) {
		int $ = 5;
//		System.out.println($);
		
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		a1.n = 4;
		a2.n = 14;
		a3.n = 24;
		
		a1.myMethod();
		a2.myMethod();
		a3.myMethod();
	}

}

class A{
	int n  = 4;
	
	 void myMethod() {
		n++;
		System.out.println(n);
	}
}
