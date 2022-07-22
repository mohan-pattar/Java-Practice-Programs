package demo1;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Test";
		String revers="";
		for (int i = str.length()-1; i >=0 ; i--) {
			revers  = revers+str.charAt(i)+"";
		}
		
		System.out.println(revers);
		
	}

}
