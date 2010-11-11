package Column1;


import java.util.*;
import java.io.*;
/**
 * This class demonstrates the implementation of BitMap in Java
 * 
 * Input:
 * A file containing at most n positive integers, each less than n, 
 * where n = 10000000. It is a fatal error if any integer occurs twice in the input. 
 * No other data is associated with the integer.
 * 
 * Output:
 * 
 * Sorted list in increasing order
 * 
 * Constraints:
 * 
 * Roughly 1.5M of Memory is available
 * 
 * Analysis: We use single bit to represent each number.
 * 			 Maximum number = 10000000
 * 			 Maximum memory = 10000000 bits ~ 1.19M
 *  
 * @author Chander
 *
 */
public class Bitmap {

	public static void main(String[] args) {
		
		//Initialized to false by default
		BitSet bitmap = new BitSet(10000000);
		BufferedReader br = null;
		String line = null;
		
		try{
			
			 br = new BufferedReader(new FileReader(args[0]));
			 
			 //Setting the bitmap for the input values
			 while((line = br.readLine())!= null) {
				int num = Integer.parseInt(line);
				bitmap.set(num);
			 }
			 
			 //Outputting the sorted value
			 for(int i=0; i<bitmap.length(); i++) {
				 
				 if(bitmap.get(i)) {
					 System.out.println(bitmap.get(i));
				 }
			 }
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	
	}
	
	
}
