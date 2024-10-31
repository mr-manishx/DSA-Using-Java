package easy.binary.search;

public class Binary_Search {
	
	public static int binarySearch(int[] nums, int target) {
		
		int start = 0;
		int end = nums.length-1;
		
		while(start <= end) {
			
			int mid = start + (end - start) / 2;
			
			if(nums[mid] == target) {
				return mid;
			}
			else if(nums[mid] > target) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[]{2, 4, 5, 8, 9, 11, 55, 77, 86};
		int target = 77;
		
		int ans = binarySearch(nums, target);
		
		System.out.println(ans);
	}

}
