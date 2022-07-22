package patternPrograms;

public class FloydTriangle2 {
	public static void main(String[] args) {
		int rowHeight = 6;
		
		for (int i = 0; i < rowHeight; i++) {
			
			int space = rowHeight-1-i;
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			
		}
	}

}
