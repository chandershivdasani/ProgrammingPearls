/**
 * For the given integer, compute its prime factors
 * @author chandershivdasani
 *
 */
import java.util.*;

public class PrimeFactors {
	
	public static List<Integer> computeFactors(int num) {
		List<Integer> factors = new ArrayList<Integer>();
		int temp = num;
		for(int i = 2; i <= num; i++) {
			while(temp%i == 0) {
				factors.add(i);
				temp = temp/i;
			}
		}
		return factors;
	}	

	
	public static void main(String[] args) {
		for(Integer i: computeFactors(33)) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(Integer i: computeFactors(20)) {
			System.out.print(i + " ");
		}
	}
	
}
