/**
 * Given a sentence, reverse the order of words in the sentence
 * i/p: "Where art thou"
 * o/p: "thou art Where"
 * 
 * A simple way of doing it is to reverse the entire sentence, 
 * then reverse individual words in the sentence.
 * 
 * Pass 1: "uoht tra erehW"
 * Pass 2: "thou art Where" 
 * 
 * @author chandershivdasani
 *
 */
public class ReverseWords {
	
	public static String reverse(String input) {
		int len = input.length();
		char[] tokens = input.toCharArray();
		for(int i=0; i < len/2; i++) {
			tokens[i] = (char) (tokens[i] ^ tokens[len - i -1]);
			tokens[len - i - 1] = (char) (tokens[i] ^ tokens[len - i -1]);
			tokens[i] = (char) (tokens[i] ^ tokens[len - i -1]);
			
		}
		return new String(tokens);
	}
	
	public static String reverseWords(String input) {
		//Reverse the entire sentence
		input = reverse(input);
		
		String[] tokens = input.split("\\s+");
		String reverse = "";
		//Reverse individual words
		for(String token: tokens) {
			reverse = reverse + " " + reverse(token);
		}
		
		return reverse;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseWords("Where art thou"));
	}
}
