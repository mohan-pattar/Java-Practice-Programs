package demo1;

public class DuplicateString {
	public static void main(String[] args) {
		String str = "aaa bb c a";
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			boolean duplicate = false;
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					count++;
					duplicate = true;
				}
			}
			
			if (duplicate && !str.substring(0, i).contains(Character.toString(ch[i]))) {
				System.out.println(ch[i] + " count is "+ count);
			}
		}
		
	}

}


