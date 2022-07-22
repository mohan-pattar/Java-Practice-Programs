package javaPractice;


public class ChangeWords {
	public static void main(String[] args) {
		String str = "Tomorrow";
		StringBuffer sb = new StringBuffer();
		System.out.println(str);
		
		int count=1;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch=='o') {
				ch='*';
				for (int j = 1; j < count; j++) {
					sb.append('*');
				}
				count++;
			}
			sb.append(ch);
		}

		System.out.println(sb);
	}

}
