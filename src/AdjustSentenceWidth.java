/**
 * Given a sentence and line width, adjust the line uniformly accross the width
 * 
 * e.g "Dog is Cute" (11 characters) and line width is 15
 * 
 * @author chandershivdasani
 * 
 */
public class AdjustSentenceWidth {

	public static String adjustWidth(String text, int width) {
		String[] words = text.split("\\s+");
		String result = "";
		int numWords = words.length;
		int textLength = text.length();

		if (width > textLength) {
			// textLength already includes single space between
			// two words
			int extraSpace = width - textLength;
			int gapBetweenWords = numWords - 1;
			int spaces = extraSpace / gapBetweenWords;
			int remainderSpaces = extraSpace % gapBetweenWords;

			// Distribute the spaces as evenly as possible
			for (int i = 0; i < words.length; i++) {
				for (int j = 0; j < spaces; j++) {
					words[i] = words[i] + " ";
				}
			}

			// If spaces are not perfectly divisible by gapBetweenWords
			// We append the remaining spaces from left to right
			for (int i = 0; i < words.length; i++) {
				if (remainderSpaces > 0) {
					words[i] = words[i] + " ";
					remainderSpaces--;
				}
			}
			
			//Reconstruct the result
			for (String word : words) {
				result = result + word;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(adjustWidth("dog is cute", 12));
	}
}
