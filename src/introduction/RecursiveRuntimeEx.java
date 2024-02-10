package introduction;

public class RecursiveRuntimeEx {

	public static void main(String[] args) {
		
		int number=4;
		int answer=rec(number);
		System.out.println(answer);
		
	}
	// complexity of the code is O(2^n)
	public static int rec(int n) {
		if(n<=1) return 1;
		return rec(n-1)+rec(n-1);
	}
}
