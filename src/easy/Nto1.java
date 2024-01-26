package easy;

public class Nto1 {

	public static void main(String[] args) {
		int number=5;
		numberPrint(number);
		numberPrintReverse(number);
		numberPrintBoth(number);
	}
	// decreasing order
	public static void numberPrint(int number) {
		if(number==0) {
			return ;
		}
		System.out.println(number);
		numberPrint(number-1);
	}
	// increasing order
	public static void numberPrintReverse(int number) {
		if(number==0) {
			return ;
		}
		numberPrintReverse(number-1);
		System.out.println(number);
	}
	
	// both
	public static void numberPrintBoth(int number) {
		if(number==0) {
			return ;
		}
		System.out.println(number);
		numberPrintBoth(number-1);
		System.out.println(number);
	}
	
}
