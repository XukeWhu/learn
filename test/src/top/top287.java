package top;

public class top287 {
	public int findDuplicate(int[] nums) {
		int n=nums.length;
		int l=1,r=n-1,ans=-1;
		while(l<=r) {
			int mid=(l+r)>>1;
			int count=0;
			for(int i=0;i<n;i++) {
				if(nums[i]<=mid)count++;
			}
			if(mid>=count) {
				l=mid+1;
			}else {
				r=mid-1;
				ans=mid;
			}
		}
		return ans;
    }
}
