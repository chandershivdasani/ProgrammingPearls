package Column1;

import java.util.ArrayList;

/**
 * For a given set S, compute all the subsets of S. In general,
 * there are 2^N-l subsets, where N is the cardinality of the 
 * set S
 * 
 * @author Chander
 *
 */
public class Subsets {

	/**
	 * Return the bit in the binary representation of value 
	 * at the position given by pos
	 * @param value
	 * @param pos
	 */
	public static int getBit(int value, int pos) {
		 int bit = value & (int)(Math.pow(2, pos));
		 if(bit > 0)
			 return 1;
		 else 
			 return 0;
	}
	
	
	
	public static void computeSubsets(int a[]) {	
		int numberOfCombinations = (int) Math.pow(2, a.length);
		ArrayList<ArrayList<String>> subsets = new ArrayList<ArrayList<String>>();
		
		for(int i = 0; i <numberOfCombinations; i++) {
			ArrayList<String> subset = new ArrayList<String>();
			for(int bitIndex = 0; bitIndex < a.length ; bitIndex++){
				if(getBit(i,bitIndex) == 1){
					subset.add(new Integer(a[bitIndex]).toString());
				}				
			}
			subsets.add(subset);			
		}		
		
		printSubsets(subsets);
	}
	
	//Print the subsets
	public static void printSubsets(ArrayList<ArrayList<String>> subsets) {
		for(ArrayList<String> subset: subsets) {
			for(String str: subset)
				System.out.print(str);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		computeSubsets(arr);
	}
	
	
}
