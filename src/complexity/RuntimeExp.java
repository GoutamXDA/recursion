package complexity;

public class RuntimeExp {

	public static void main(String[] args) {
	
		int[] array= {12,5,9,12,34};
		maxMinElement(array);
		minMaxElement(array);
	}

	// using a single loop, time complexity O(n), space O(1);
	private static void maxMinElement(int[] array) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for (int i : array) {
			if(i<min) min=i;
			if(i>max) max=i;
		}
		System.out.println("MinValue:"+min+"  "+"MaxValue:"+max);
	}
	
	// using two loops but have single condition in each loop
	// time O(n) space O(1)
	//O(n+n)=O(2n)==> O(n) , drop constant
	public static void minMaxElement(int[]arry) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for (int i : arry) {
			if(i<min) min=i;
		}
		System.out.println("MinValue:"+min);
		for (int i : arry) {
			if(i>max) max=i;
		}
		System.out.println("MaxValue:"+max);
	}
	
}
