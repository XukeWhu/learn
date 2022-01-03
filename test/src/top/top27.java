package top;

public class top27 {
	public int removeElement(int[] nums, int val) {
		int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int fast = 0, slow = 0;
        while (fast < n) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}
