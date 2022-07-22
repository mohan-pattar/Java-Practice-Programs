package patternPrograms;

public class FloydTriangle1 {
	public static void main(String[] args) {
		int triangleHeight = 7;
		int count= 1;
		for (int i = 0; i < triangleHeight; i++) {
			int space=triangleHeight-1-i;
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			
			int printCount = 1+2*i;
			for (int j = 0; j <printCount; j++) {
				System.out.print("*");
				count++;
			}
			System.out.println();
		}
	}

}
