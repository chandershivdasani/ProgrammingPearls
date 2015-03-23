/**
 * Given a two dimensional array. Find the maximum sub subarray
 * 
 * http://okckd.github.io/blog/2014/08/01/Max-Sum-In-2D-Array/
 * 
 */
class MaximumSum2DArray {
	
	public static int maxSum(int[][] input) {
		int rows = input.length;
		int cols = input[0].length;
		int maxResult = Integer.MIN_VALUE;
		
		for(int i=0; i < rows; i++) {
			int[] flatten = new int[cols];
			
			for(int j=i; j < rows; j++) {
				for (int k=0; k < cols; k++) {
					flatten[k] = flatten[k] + input[j][k];
				}
				maxResult = Math.max(maxResult, maxSumOneDimensionalArray(flatten));
			}
		}
	return maxResult;	
	}
	
	public static int maxSumOneDimensionalArray(int[] input) {
		int sum = Integer.MIN_VALUE;
		int currentSum = 0;
		
		for(int i: input) {
			currentSum = currentSum + i;
			
			currentSum = Math.max(currentSum, 0);
			sum = Math.max(currentSum, sum);
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int[][] input = new int[][] {
				{1,2,-1,-4,-20},
				{-8,-3,4,2,1},
				{3,8,10,1,3},
				{-4,-1,1,7,-6}
				
		};
		
		int[] input2 = new int[] {-1,-2,-3,4,-5};
		
		System.out.println(maxSum(input));
		
		//System.out.println(maxSumOneDimensionalArray(input2));
	}
}
