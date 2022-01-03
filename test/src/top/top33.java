package top;

public class top33 {
	    public int search(int[] nums, int target) {
	        int n = nums.length;
	        int l = 0, r = n - 1;
	        while (l <= r) {
	            int mid = (l + r) / 2;
	            if (nums[mid] == target) {
	                return mid;
	            }
	            if (nums[0] <= nums[mid]) {
	                if (nums[0] <= target && target < nums[mid]) {
	                    r = mid - 1;
	                } else {
	                    l = mid + 1;
	                }
	            } else {
	                if (nums[mid] < target && target <= nums[n - 1]) {
	                    l = mid + 1;
	                } else {
	                    r = mid - 1;
	                }
	            }
	        }
	        return -1;
	    }
}
