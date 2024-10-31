package easy.binary.search;

public class Ceiling_Number_Find {
	
	public static int ceilingNumber(int[] nums, int target) {
		
		int start = 0;
		int end = nums.length-1;
		int ans = -1;
		
		boolean flag = false;
		
		while(start <= end) {
			
			int mid = start + (end - start) / 2;
			
			if(nums[mid] == target) {
				return nums[mid];
			}
			else if(nums[mid] > target) {
				ans = nums[mid];
				end = mid - 1;
				flag = true;
			}
			else {
				start = mid + 1;
			}
		}
		return flag == true ? ans : nums[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[] {2, 3, 4, 11, 15, 21, 25, 31, 46, 76};
		int target = 20;
		
		int ans = ceilingNumber(nums, target);
		
		System.out.println(ans);
		
	}

}
