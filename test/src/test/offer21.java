package test;

public class offer21 {
	public int[] exchange(int[] nums) {
		int odd=0;
		int even=nums.length-1;
		while(odd<even) {
			while(odd<even&&nums[odd]%2==1) {
				odd++;
			}
			while(odd<even&&nums[even]%2==0) {
				even--;
			}
			int temp=nums[odd];
			nums[odd]=nums[even];
			nums[even]=temp;
		}
		return nums;
    }
}
