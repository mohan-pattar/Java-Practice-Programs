package javaPractice;

public class Raj {
	public static void main(String[] args) {
		String str = "Tomorrow";
		StringBuffer sb = new StringBuffer();
		System.out.println(str);
		StringBuffer replace = new StringBuffer("");
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch=='o') {
				replace.append("*");
				sb.append(replace);
				
				continue;
			}
			sb.append(ch);
		}
		
		System.out.println(sb);

	}
	

}
