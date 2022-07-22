package patternPrograms;

public class Star {
	
	public static void main(String[] args) throws InterruptedException {
		
		String star = "";
		for (int i = 0; i < 9; i++) {
			System.out.println(i);
			
			if (i==8) {
				
			}
			else {
				star = star+"*";
				System.out.println(star);
				Thread.sleep(100);
			}
		}
	}

}
