package easy;

public class SumOfDigit {

	public static void main(String[] args) {
		int n=1342;
		int answer=calculateSumOfDigit(n);
		System.out.println(answer);
	}

	private static int calculateSumOfDigit(int n) {
		if(n==0) return 0;
		return (n%10)+calculateSumOfDigit(n/10);
	}
}
