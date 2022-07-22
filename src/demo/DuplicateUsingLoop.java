package demo;

public class DuplicateUsingLoop {
	public static void main(String[] args) {
		DuplicateUsingLoop dup = new DuplicateUsingLoop();
		dup.findDuplicate("Tomorrow");
		dup.findDuplicate("Moon");
		dup.findDuplicate("Tata");
		
		
		
	}
	
	public void findDuplicate(String str) {
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i+1; j < ch.length; j++) {
				if (ch[i]==ch[j]) {
					count++;
				}
			}
			
			if (!str.substring(0, i).contains(String.valueOf(ch[i]))) {
				System.out.println(ch[i] + " - "+ count);
			}
		}
		System.out.println();
	}

}
