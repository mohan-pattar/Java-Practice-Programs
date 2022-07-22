package demo1;

class ExecuteClass {
	protected int i = 10;
	protected void myMethod() {
		System.out.println("First Class Method");
	}
}

public class FirstClass{
	public static void main(String[] args) {
		ExecuteClass obj = new ExecuteClass();
		System.out.println(obj.i);
		obj.myMethod();
	}
}