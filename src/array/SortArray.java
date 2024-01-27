package array;

public class SortArray {
	public static void main(String[] args) {
		int[] nums= {2,5,10,13,23,21,45,55};
		boolean result=checksort(nums,0);
		System.out.println(result);
	}

	private static boolean checksort(int[] nums,int index) {
		if(index==nums.length-1)return true;
		return nums[index]<nums[index+1] && checksort(nums, index+1);
	}

}
