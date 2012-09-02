
/**
 *  This class demonstrates a simple algorithm to rotate
 *  a Vector V to the left by I positions
 *  
 * O(n) time and O(1) space.
 *  
 * @author Owner
 *
 */

public class Rotate {

	/**
	 * Function that reverses the first i elements of 
	 * the array
	 *  
	 * @param input - vector
	 * @param i - rotation pivot
	 */
	
	public static void reverse(char[] input, int x, int y) {
		
		char t;
		
		while(x<y) {
			t = input[x];
			input[x] = input[y];
			input[y] = t;
			x++;
			y--;
		}
	}
	
	public static void main(String[] args) {
		
		if(args.length < 2) {
			
			System.out.println("Usage: Rotate Vector I");
			System.exit(0);
		}
		
		char[] chars = args[0].toCharArray();
		int i = Integer.parseInt(args[1]);
		
		reverse(chars, 0, i-1); 
		reverse(chars, i, chars.length-1);
		reverse(chars, 0, chars.length-1);

		System.out.println("Rotated Output: " + new String(chars));
	}
}
