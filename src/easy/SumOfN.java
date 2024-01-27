package easy;

public class SumOfN {

	public static void main(String[] args) {
		int n=5;
		int answer=sum(n);
		System.out.println(answer);
	}

	private static int sum(int n) {
		if(n<=1) return 1;
		return n+sum(n-1);
	}
}
