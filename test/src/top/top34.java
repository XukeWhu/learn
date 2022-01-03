package top;

public class top34 {
	public int[] searchRange(int[] nums, int target) {
		int [] result=new int[]{-1,-1};
		if(nums.length==0)return result;
		int l=0,r=nums.length-1,n=r+1;
		int mid=0;
		while(l<=r) {
			mid=(l+r)/2;
			if(nums[mid]>=target)r=mid-1;
			else l=mid+1;
		}
		if(nums[mid]!=target)return result;
		result[0]=mid;
		while(mid<n&&nums[mid]==target)mid++;
		result[1]=mid-1;
		return result;
    }
}
