package patternPrograms;

public class SineWave {
	public static void main(String[] args) throws InterruptedException {	
		int count = 20;
		while (true) {
			increase(count);
			decrease(count);
		}
		
	}
	
	public static void increase(int count) throws InterruptedException {
		String space = "";
		for (int i = 0; i < 20; i++) {
			Thread.sleep(20);
			System.out.println(space+"*");
			space = space+" ";
		}
	}
	
	public static void decrease(int count) throws InterruptedException {
		
		for (int i = 0; i < count; i++) {
			String space = "";
			for (int j = i; j < count; j++) {
				space = space+ " ";
			}
			Thread.sleep(20);
			System.out.println(space+"*");
			space = space+" ";
		}
	}

}
