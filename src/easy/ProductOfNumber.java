package easy;

public class ProductOfNumber {

	public static void main(String[] args) {
		
		int n=1234;
		int answer=calculateProduct(n);
		System.out.println(answer);
	}

	private static int calculateProduct(int n) {
		if(n%10==n) return n;
		
		return (n%10)*calculateProduct(n/10);
	}
}
