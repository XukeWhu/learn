package top;

public class top152 {
	public int maxProduct(int[] nums) {
		int len=nums.length;
		int maxv=nums[0];
		int [] max=new int[len];
		int [] min=new int[len];
		if(nums[0]>=0)max[0]=nums[0];
		else min[0]=nums[0];
		for(int i=1;i<len;i++) {
			if(nums[i]==0) {
				maxv=Math.max(maxv, 0);
				continue;
			}
			else if(nums[i]>0) {
				min[i]=min[i-1]*nums[i];
				if(max[i-1]==0)max[i]=nums[i];
				else{
					max[i]=max[i-1]*nums[i];
				}
				maxv=Math.max(maxv, max[i]);
			}else{
				max[i]=min[i-1]*nums[i];
				if(max[i-1]==0)min[i]=nums[i];
				else{
					min[i]=max[i-1]*nums[i];
				}
				maxv=Math.max(maxv, min[i]);
				if(max[i]!=0&&max[i]>maxv)maxv=max[i];
			}
		}
		return maxv;
    }
	public int maxProduct2(int[] nums) {
		int len=nums.length;
		int maxv=nums[0];
		int maxF=nums[0],minF=nums[0];
		for(int i=1;i<len;i++) {
			int mx=maxF,mn=minF;
			maxF=Math.max(mx*nums[i], Math.max(mn*nums[i], nums[i]));
			minF=Math.min(mx*nums[i], Math.min(mn*nums[i], nums[i]));
			if(maxF>maxv)maxv=maxF;
		}
		return maxv;
    }
}
