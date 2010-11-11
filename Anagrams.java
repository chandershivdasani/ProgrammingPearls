package Column1;
import java.io.*;
/**
 * Problem Statement:
 * 
 * Given an Dictionary as an input output all the words that form anagrams.
 * 
 * @author Owner
 * 
 */
public class Anagrams {


	public static void computeSignatures(BufferedReader br, FileWriter fw) {
		try{
			String line = null;
			while((line = br.readLine())!= null ) {
				
				
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		if (args.length < 1 || args.length > 1) {

			System.err.println("Usage: Anagrams DictionaryFile");
			System.exit(1);
		}
		try {
			BufferedReader br = new BufferedReader(new FileReader(args[1]));
			FileWriter fw = new FileWriter("Anagrams.txt");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
