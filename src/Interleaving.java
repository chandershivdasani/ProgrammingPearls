/**
 * Given two strings, compute all its interleavings. e.g For "AB" and "CD" we
 * have: "ABCD" "ACBD" "ACDB" "CABD" "CDAB" "CADB"
 * 
 * Working:
 *                                                                          compute("AB","CD") 
 * A +            compute(B,CD)                                                           C + compute(AB,D) 
 *    B + compute(,CD)      || C + compute(B,D)
 *      + C + compute(,D)   ||   + B + compute(D)     || D + compute(B)
 *          D + compute(,)  ||       + D + compute(,) ||    + B + compute(,)
 *          ABCD            ||             ACBD       ||       ACDB
 * @author chandershivdasani
 * 
 */
import java.util.*;
public class Interleaving {

	public static  void computeInterleavings(String first, String second, StringBuilder result) {
		/*
		 * When both the strings are empty, print the result string
		 */
		if (first.length() == 0 && second.length() == 0) {
			System.out.println(result);
			result = new StringBuilder();
		}
		/*
		 * If first string is non-empty, append the first character 
		 * to the result and recurse on the remaining. 
		 * Check the example in the description. The characters are 
		 * being deleted, when we are moving up in the stack
		 * 
		 * AB, CD -> A + compute(B,CD) ...
		 */
		if(first.length() > 0) {
			computeInterleavings(first.substring(1), second, result.append(first.charAt(0)));
			result.deleteCharAt(result.length() - 1);
		}
		
		/*
		 *Do the same thing when second string is non empty
		 *AB,CD -> C + compute(AB,D) ...  
		 */
		if(second.length() > 0) {
			computeInterleavings(first,second.substring(1), result.append(second.charAt(0)));
			result.deleteCharAt(result.length() - 1);
		}
		
	}
	
	/*
	 * Check whether the particular pattern is interleaving of two strings
	 */
	public static boolean checkInterleaving(String input1, String input2, String pattern) {
		if(pattern.length() != (input1.length() + input2.length())) {
			return false;
		}
		char[] patternTokens = pattern.toCharArray();
		char[] input1Tokens = input1.toCharArray();
		char[] input2Tokens = input2.toCharArray();
		int j=0, k=0;
		
		for(int i = 0; i < patternTokens.length; i++) {
			
			if(j < input1.length() && (patternTokens[i] == input1Tokens[j]))
				j++;
			
			else if(k < input2.length() && (patternTokens[i] == input2Tokens[k]))
				k++;
			else 
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		//computeInterleavings("ABC", "DEF", new StringBuilder());
		
		System.out.println(checkInterleaving("AB", "CD", "ABCD"));
	}
}
