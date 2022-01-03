package test;

public class offer57 {
	public int[] twoSum(int[] nums, int target) {
	        int start = 0;
	        int end = nums.length - 1;
	        while(start < end) {
	            int sum = nums[start] + nums[end];
	            if(sum < target) {
	                start++;
	            } else if(sum > target) {
	                end--;
	            } else {
	                return new int[] { nums[start], nums[end] };
	            }
	        }
	        return new int[0];
    }
}
