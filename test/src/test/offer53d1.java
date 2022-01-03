package test;

public class offer53d1 {
	public int search(int[] nums, int target) {
    	return getriaght(nums,target)-getriaght(nums,target-1);
    }
	public int getriaght(int[] nums, int target) {
		int left=0,right=nums.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(nums[mid]<=target) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		return left;
	}
}
