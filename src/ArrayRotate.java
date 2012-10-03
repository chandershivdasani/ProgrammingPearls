/**
 * Rotate a two dimensional array by 90degree. 
 * e.g:
 * 0100  RightRotate  0000     
 * 0100  ->           1111 
 * 0100               1000
 * 0110               0000
 *   
 *       Left Rotate  0000
 *        ->          1111
 *                    0001
 *                    0000
 *                  
 * @author chandershivdasani
 *
 */
public class ArrayRotate {

	/*
	 * Looking at the above example, we can see that: Top row is moved into last
	 * column Second row is moved to second last column and so on....
	 * 
	 * The algorithm is simply reading rows from the original array and storing
	 * it as columns in the destination array
	 */
	public static int[][] rotateRight(int[][] input, int rows, int columns) {
		int[][] result = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				result[j][columns-1 - i] = input[i][j];
			}
		}

		return result;
	}
	
	/* For left rotation:
	 * The top row becomes the first column and so on
	 * 
	 */
	public static int[][] rotateLeft(int[][] input, int rows, int columns) {
		int[][] result = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				result[j][i] = input[i][j];
			}
		}

		return result;
	}
	
	public static void printArray(int[][]input, int rows, int columns) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(input[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int rows = 4;
		int columns = 4;
		int[][] input = new int[][]{{0,1,0,0}, {0,1,0,0}, {0,1,0,0}, {0,1,1,0}};
		int[][] outRight = rotateRight(input,4,4);
		int[][] outLeft = rotateLeft(input,4,4);
		System.out.println("----Input Array ------");
		printArray(input,4,4);
		System.out.println("----Right Rotated Array ------");
		printArray(outRight,4,4);
		System.out.println("----Left Rotated Array ------");
		printArray(outLeft,4,4);
		
	}
}
