package test;

public class offer51 {
	int [] nums,temp;
    public int reversePairs(int[] nums) {
    	this.nums=nums;
    	temp=new int[nums.length];
    	return getPairs(0,nums.length-1);
    }
    public int getPairs(int l,int r) {
    	if(l>=r)return 0;
    	int m=(l+r)/2;
    	int res=getPairs(l,m)+getPairs(m+1,r);
    	int j=m+1,k=l;
    	for(int i=l;i<=r;i++)temp[i]=nums[i];
    	for(int i=l;i<=r;i++) {
    		if(k==m+1){
    			nums[i]=temp[j++];
    		}else if(j==r+1||temp[k]<=temp[j]) {
    			nums[i]=temp[k++];
    		}else{
    			nums[i]=temp[j++];
    			res+=m-k+1;
    		}
    	}
    	return res;
    }
}
