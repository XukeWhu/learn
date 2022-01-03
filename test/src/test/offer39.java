package test;

public class offer39 {
	public int majorityElement(int[] nums) {
		int cur=nums[0],count=1;
		for(int i=1;i<nums.length;i++) {
			if(cur==nums[i]) {
				count++;
			}else {
				count--;
				if(count==0) {
					count=1;
					cur=nums[i];
				}
			}
		}
		return cur;
    }
	
	public int majorityElementdaan(int[] nums) {
        int cur = 0;
        int count = 0;
        for(int num : nums){
            if(count == 0) {
                cur = num;
            }
            if(num == cur) {
                count++;
            } else {
                count--;
            }
        }
        return cur;
    }
}
