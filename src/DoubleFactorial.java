/**
 * Double factorial of a number n, represented as n!! is defined
 * as follows:
 * 
 * n!! = n*(n-2)(n-4)....4*2 - if n is even
 *     = n*(n-2)(n-4)....3*1 - if n is odd
 *     = 1                   - if n is -1,0 
 * 
 * The following solution contains both recursive and 
 * non-recursive methods of computing double factorial
 * 
 * @author chandershivdasani
 *
 */
public class DoubleFactorial {

	public static int doubleFactorial(int n) {
		if(n == 0 || n == -1) 
			return 1;
		else 
			return n*doubleFactorial(n-2);
	}
	
	public static int doubleFactorialIterative(int n) {
		int fact=1;
		int i=0;
		
		if(n%2 == 0){
			i=2;
		}else {
			i=1;
		}
		for(int j=i; j<=n; j+=2) {
			 fact = fact*j;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		System.out.println("Recursive-----");
		System.out.println(doubleFactorial(1));
		System.out.println(doubleFactorial(-1));
		System.out.println(doubleFactorial(0));
		System.out.println(doubleFactorial(2));
		System.out.println(doubleFactorial(3));
		System.out.println(doubleFactorial(5));
		System.out.println(doubleFactorial(10));
		
		System.out.println("Iterative-----");
		System.out.println(doubleFactorialIterative(1));
		System.out.println(doubleFactorialIterative(-1));
		System.out.println(doubleFactorialIterative(0));
		System.out.println(doubleFactorialIterative(2));
		System.out.println(doubleFactorialIterative(3));
		System.out.println(doubleFactorialIterative(5));
		System.out.println(doubleFactorialIterative(10));
	}
}
