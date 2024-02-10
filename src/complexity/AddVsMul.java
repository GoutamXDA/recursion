package complexity;


public class AddVsMul {

	public static void main(String[] args) {
		int[] arrA= {1,4,7,10,3};
		int[] arrB= {3,5,8,11};
	//	addRuntime(arrA, arrB);
		multiplyRunTime(arrA, arrB);
		
	}
	// add 
	// time complexity is based on length of array
	//					O(a+b)
	// space complexity O(1)
	public static void addRuntime(int[] a,int[] b) {
		for (int i : a) {
			print(i);
		}
		for (int j : b) {
			print(j);
		}
	}
	public static void print(int array) {
			System.out.println(array);
	}
	
	// nested loops , time complexity :O(a*b)
	// no extra space is required so space complexity is O(1)
	public static void multiplyRunTime(int[] a, int[]b) {
		for (int i : a) {
			for (int j : b) {
				print(i);
				print(j);
			}
		}
	}
}
