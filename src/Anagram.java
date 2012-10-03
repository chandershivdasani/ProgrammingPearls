/**
 * Given a word and a dictionary, check whether it 
 * is a valid anagram
 * 
 * etix -> exit
 * qeruy -> query
 * 
 * @author chandershivdasani
 *
 */
import java.util.*;
public class Anagram {
	
	public static boolean isAnagram(String soFar, String rest,ArrayList<String> dict) {
		if(rest.equals("")) {
			if(dict.contains(soFar)) {
				System.out.println(soFar);
				return true;
			}
		}
		else {
			for(int i = 0; i < rest.length(); i++) {
				String next = soFar + rest.charAt(i);
				String remaining = rest.substring(0,i) + rest.substring(i+1);
				
				//We always have to include!
				if(isAnagram(next,remaining,dict)) 
					return true;
			}
		}
		return false;
	}
}
