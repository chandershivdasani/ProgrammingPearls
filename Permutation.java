package Column1;

/**
 * Compute all the permutations of the given string.
 * Reference: http://newton.ex.ac.uk/teaching/jmr/recursion.html
 * 
 * @author Chander
 *
 */
public class Permutation {

	/**
	 * The String out here is represented as 
	 * a char array for simplicity. This program can 
	 * be easily modified to use a String instead of char array.
	 * 
	 * @param inputString
	 * @param p
	 */
	void permute(char[] inputString, int p)
	{
		if((p+1) == inputString.length)
			System.out.println(inputString);
		else 
		{
			/* Traverse the string, swapping each element 
			 * in turn with element at p
			 */
			char temp;
			for(int i = p; i < inputString.length; i++)
			{
				temp = inputString[i];
				inputString[i] = inputString[p];
				inputString[p] = temp;
				
				permute(inputString, p+1);
				
				//Restore the original text
				inputString[p] = inputString[i];
				inputString[i] = temp;
 			}
		}
	}
	
	public static void main(String[] args) 
	{
		char[] input = {'A','B','C','D','E','F'};
		Permutation p = new Permutation();
		long before = System.currentTimeMillis();
		p.permute(input,0);
		long after = System.currentTimeMillis();
		System.out.println("Time : " + (after - before) + "ms");
		
	}
}
