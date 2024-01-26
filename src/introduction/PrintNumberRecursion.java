package introduction;

public class PrintNumberRecursion {

	public static void main(String[] args) {
		print(1);
	}

	private static void print(int n) {
		
		if(n==5) {
			System.out.println(5);
			return;
		}
		System.out.println(n);
		print(n+1);
	}
}
