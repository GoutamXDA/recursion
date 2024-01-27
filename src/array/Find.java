package array;

public class Find {

	public static void main(String[] args) {
		int[] nums= {1,23,12,29,0,11};
		System.out.println(checkElement(nums,0,0));
		
		System.out.println(findIndex(nums,0,0));
		
		System.out.println(findIndexLast(nums,23,nums.length-1));
	}

	private static int findIndexLast(int[] nums, int target, int index) {
		if(index==-1) return -1;
		
		if(nums[index]==target) return index;
		else return findIndexLast(nums, target, index-1);
	}

	private static int findIndex(int[] nums, int target, int index) {
		if(index==nums.length) return -1;
		
		if(nums[index]==target) return index;
		else return findIndex(nums, target, index+1);
	}

	private static boolean checkElement(int[] nums,int target,int index) {
		if(index==nums.length) return false;
		return nums[index]==target || checkElement(nums, target, index+1);
	}
}

