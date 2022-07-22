package patternPrograms;

public class NewStar {
	static int i;
	static int maxNum = 20;
	static String star = "";
	public static void main(String[] args) throws InterruptedException {
		
		
		
		while (true) {
			increase(true);
			decreaseStars(true);
			
		}
		
	}
	
	
	public static void increase(Boolean condition) throws InterruptedException {
		
		while (condition) {
			star = star+"*";
			System.out.println(star);
			Thread.sleep(50);	
			if (i==maxNum) {
				condition = false;
				i=0;
			}
			i++;
			
		}

	}
	
	public static void decreaseStars(Boolean condition) throws InterruptedException {
		while (condition) {
			star = star.substring(0, star.length()-1);
			System.out.println(star);
			Thread.sleep(50);	
			
			if (i==maxNum) {
				condition = false;
				i=0;
			}
			i++;
		}
	}
	
	

}
