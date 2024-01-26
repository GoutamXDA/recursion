package introduction;

public class NfibonacNumber {
	public static void main(String[] args) {
		System.out.println(fibonacci(3));
	}

	private static int fibonacci(int number) {

		if (number < 2)
			return number;
		return fibonacci(number - 1) + fibonacci(number - 2);
	}

}
