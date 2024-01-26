package easy;

public class Nto1 {

	public static void main(String[] args) {
		int number=5;
		numberPrint(number);
	}
	public static void numberPrint(int number) {
		if(number==0) {
			return ;
		}
		System.out.println(number);
		numberPrint(number-1);
	}
}
