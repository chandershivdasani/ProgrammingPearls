/**
 * Compute all the permutations of the given string. Reference:
 * http://newton.ex.ac.uk/teaching/jmr/recursion.html
 * 
 * Total number of permutations for a string of len(n): n!
 * 
 * @author Chander
 * 
 */
public class Permutation {

	public static char[] swap(char[] input, int i, int j) {
		char temp;
		temp = input[i];
		input[i] = input[j];
		input[j] = temp;

		return input;

	}
	
	public static void permuteString(String soFar, String rest) {
		if(rest.equals(""))
			System.out.println(soFar);
		else{
			for(int i = 0; i < rest.length(); i++) {
				String next = soFar + rest.charAt(i);
				String remaining = rest.substring(0,i) + rest.substring(i+1);
				permuteString(next, remaining);
			}
		}
	}
	
	/**
	 * Problem formulation: Assume at a given step of recursion, we can come up
	 * with the following generalization:
	 * 
	 * if close < open : INVALID, since we cannot have more open brackets than
	 * close close == open : PRINT the string, since we are not left with any
	 * brackets open - 1, close : if open > 0 try a open parenthesis and recurse
	 * on remaining. open, close - 1 if close > 0 try a close parenthesis and
	 * recurse on remaining
	 * 
	 * @param inputString
	 * @param close
	 *            - close brackets
	 * @param open
	 *            - open brackets
	 */
	public static void permuteParanthesis(StringBuilder inputString, int close,
			int open) {
		if (close < open)
			return;

		if (close == open)
			System.out.println(inputString);

		if (open > 0)
			permuteParanthesis(inputString.append("{"), close, open - 1);
		if (close > 0 && close > open)
			permuteParanthesis(inputString.append("}"), close - 1, open);
	}

	public static void main(String[] args) {
//		char[] input = { 'A', 'B' , 'A'};
//		
//		boolean[] visited = new boolean[255];
//		
//		for(int i = 0; i < visited.length; i++) {
//			visited[i] = false;
//		}
//		
//		// char[] input = {'A','A'};
//		long before = System.currentTimeMillis();
//		//permuteStrings(input,visited, 0, input.length - 1);
//		 permuteParanthesis(new StringBuilder(""), 2, 2);
//		long after = System.currentTimeMillis();
//		System.out.println("Time : " + (after - before) + "ms");
		
		permuteString("","ABC");

	}
}
