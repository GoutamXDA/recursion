package easy;

public class Factorial {
	public static void main(String[] args) {
		
		int n=5;
		int answer=fact(n);
		System.out.println(answer);
	}
	public static int fact(int n) {
		if(n<=1) return 1;
		
		return n*fact(n-1);
	}

}
