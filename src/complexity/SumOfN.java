package complexity;

public class SumOfN {
// it takes O(n) time and O(n) space
	public static void main(String[] args) {
		int number=4;
		int result=sum(number);
		System.out.println(result);
		
	}
	public static int sum(int n) {
		if(n<=0) return 0;
		return n+sum(n-1);
	}
	// each of the cell is added to the call  stack
	/*
	 * sum(4);
	 *  sum(3);
	 *   sum(2);
	 *    sum(1);
	 *     sum(0);
	 */
}
