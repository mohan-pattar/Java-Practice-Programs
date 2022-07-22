package patternPrograms;

public class FloydTriangle {
	public static void main(String[] args) {
		int rowNum = 5;
		int count=1;
		for (int i = 0; i < rowNum; i++) {
			
			for (int j = 0; j <= i; j++) {
				System.out.print(count+" ");
				if (count<10) {
					System.out.print(" ");
				}
				count++;
			}
			System.out.println();
		}
		
		
	}

}
