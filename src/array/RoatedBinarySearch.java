package array;

public class RoatedBinarySearch {

	public static void main(String[] args) {
		int[] arr= {5,6,7,8,9,1,2,3};
		int target=2;
		int getIndex=search(arr,target,0,arr.length-1);
		System.out.println(getIndex);
	}

	private static int search(int[] arr, int target, int s, int e) {
		if(s>e) return -1;
		
		int mid=s+(e-s)/2;
		
		if(arr[mid]==target) return mid;
		if(arr[s]<=arr[mid]) {
			if(target>=arr[s] && target<=arr[mid]) {
				return search(arr, target, s, mid-1);
			}
			return search(arr, target, mid+1, e);

		}
		if(target>= arr[mid] && target<=arr[e]) {
			return search(arr, target, mid+1, e);
		}
		return search(arr, target, s, mid-1);
	}
}
