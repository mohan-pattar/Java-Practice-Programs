package patternPrograms;

public class NumberInSquare1 {
	public static void main(String[] args) {
		
		int rows = 80, columns = 5;
        int[][] marks = new int[rows][columns];
  
        // initializing the array elements using for loop
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                marks[i][j] = i + j;
            }
        }
  
        // printing the first three rows of marks array
        System.out.println("First three rows are: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf(marks[i][j] + " ");
            }
            System.out.println();
        } 
		
	}

}


//		1  2  3  4  5
//		16 17 18 19 6
//		15 24 25 20 7
//		14 23 22 21 8
//		13 12 11 10 9			

