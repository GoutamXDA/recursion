package array;

import java.util.ArrayList;

public class Find {

	public static void main(String[] args) {
		int[] nums= {1,23,12,29,0,11,11,11};
		System.out.println(checkElement(nums,0,0));
		
		System.out.println(findIndex(nums,0,0));
		
		System.out.println(findIndexLast(nums,23,nums.length-1));

	//	findAllIndex(nums, 11, 0);
	//	System.out.println(list);
		System.out.println(findAllIndex(nums, 11, 0, new ArrayList<Integer>()));
	}
private static ArrayList<Integer> findAllIndex(int[] nums, int target, int index,ArrayList<Integer> list) {
if(index==nums.length) return list;
if(nums[index]==target) list.add(index);
	return findAllIndex(nums, target, index+1, list);
	}
/* ArrayList created outside body
	static ArrayList<Integer> list=new ArrayList<Integer>();
	private static void findAllIndex(int[] nums, int target, int index) {
		if(index==nums.length) return;
		if(nums[index]==target) list.add(index);
		 findAllIndex(nums, target, index+1);
				
	}
 */
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

