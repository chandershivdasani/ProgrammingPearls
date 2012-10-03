
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

/**
 * For a given set S, compute all the subsets of S. In general,
 * there are 2^N-l subsets, where N is the cardinality of the 
 * set S
 * 
 * @author Chander
 *
 */
public class Subsets {
	
	public static void compute(String soFar, String remaining) {
		if(remaining.equals(""))
			System.out.println(soFar);
		else {
			//add to the subset and recur
			compute(soFar + remaining.charAt(0), remaining.substring(1));
			//dont add to the subset and recur
			compute(soFar, remaining.substring(1));
		}
	}
	
	public static int computeSum(List<Integer> input) {
		int sum = 0;
		
		for (Integer integer : input) {
			sum = sum + integer;
		}
		
		return sum;
	}
	
	public static void print(List<Integer> input) {
		for (Integer integer : input) {
			System.out.print(integer + ", ");
		}
		System.out.println();
	}
	
	/*
	 * Prints all the combinations of a set that 
	 * add up to the given number
	 */
	public static void computeSum(ArrayList<Integer> soFar, ArrayList<Integer> rest, int targetSum ) {
		int sum = computeSum(soFar);
		//System.out.println("Sum: " + sum);
		
		if(sum == targetSum)
			print(soFar);
		
		
		else if(rest.size()==0)
			return;
		
		else {
			ArrayList<Integer> remaining = new ArrayList<Integer>();
			for(int i = 1; i < rest.size(); i++) {
				remaining.add(rest.get(i));
			}
			//Include the first element
			soFar.add(0,rest.get(0));
			computeSum(soFar, remaining, targetSum);
			
			//Dont include the first element 
			soFar.remove(0);
			computeSum(soFar, remaining, targetSum);
			
			
		}
//		if(sum == targetSum) 
//			print(rest);
		
		//Nothing to do if the current sum exceeds targetSum
		//if(sum >= targetSum)
			//return;
		
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> input = new ArrayList<Integer>();
		ArrayList<Integer> remaining = new ArrayList<Integer>();
		input.add(3);
		input.add(9);
		input.add(8);
		input.add(4);
		input.add(5);
		input.add(7);
		input.add(10);
		
		ArrayList<Integer> in = new ArrayList<Integer>();
		in.add(1);
		in.add(2);
		in.add(3);
		
		computeSum(remaining,input,15);
		//compute("", "ABC");
	}
	
	
}
