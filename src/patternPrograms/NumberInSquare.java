package patternPrograms;

public class NumberInSquare {
	
	public static void main(String[] args) {
		
		int rowNum = 10;
		int rowCount = 1;
		int num = 1;
		int lastNum = 0;
		
//		To print in row
		for (int i = 0; i < rowNum; i++) {
			
			for (int j = 0; j < rowNum; j++) {
				
				if (rowCount%2==1) {
					System.out.print(num);
				}
				else {
					System.out.print(lastNum);
					lastNum--;
				}
				System.out.print(" ");
				if (num<10 && num!=rowNum+1) {
					System.out.print(" ");
				}
				
				num++;
			}
			
		rowCount++;
		System.out.println();
		lastNum = rowNum+num-1;
			
		}
		
		
	}

}



//		1   2  3  4  5
//		10  9  8  7  6
//		11 12 13 14 15 
//		16 17 18 19 20
//		25 24 23 22 21



