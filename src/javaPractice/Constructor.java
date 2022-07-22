package javaPractice;

public class Constructor {
	public static void main(String[] args) {
		
		NewClass ob1 = new NewClass();
		NewClass ob2 = new NewClass();
		ob1.myMethod();
		ob2.myMethod();
	}

}

class NewClass {
	int id;
	String name;
	
	void myMethod() {
		System.out.println(id + " "+ name);
	}
}
