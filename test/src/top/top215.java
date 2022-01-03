package top;

public class top215 {
	public int findKthLargest(int[] nums, int k) {
		return find(nums,nums.length-k,0,nums.length-1);
    }
	public int find(int[] nums, int index,int start,int end) {
		int num=nums[start],point=start+1;
		for(int i=start+1;i<=end;i++) {
			if(nums[i]<num) {
				int temp=nums[i];
				nums[i]=nums[point];
				nums[point]=temp;
				point++;
			}
		}
		nums[start]=nums[point-1];
		nums[point-1]=num;
		if(point-1==index)return num;
		else if(point-1<index)return find(nums,index,point,end);
		else return find(nums,index,start,point-2);
    }
	public int findKthLargest2(int[] nums, int k) {
		int len=nums.length;
		buildheap(nums,len);
		for(int i=len-1;i>=len-k+1;i--) {
			swap(nums,0,i);
			len--;
			maxheap(nums,0,len);
		}
		return nums[0];
    }
	public void buildheap(int nums[],int len) {
		for(int i=len/2;i>=0;i--) {
			maxheap(nums,i,len);
		}
	}
	public void maxheap(int nums[],int i,int len) {
		int l=i*2+1,r=i*2+2,largest=i;
		if(l<len&&nums[l]>nums[largest]) {
			largest=l;
		}
		if(r<len&&nums[r]>nums[largest]) {
			largest=r;
		}
		if(largest!=i) {
			swap(nums,largest,i);
			maxheap(nums,largest,len);
		}
	}
	public void swap(int nums[],int i,int j) {
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
}
