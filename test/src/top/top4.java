package top;

public class top4 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int l1=0,l2=0,r1=nums1.length-1,r2=nums2.length-1;
    	while(l1<=r1&&l2<=r2&&(r1+r2-l1-l2>0)) {
    		if(nums1[l1]<nums2[l2]) {
    			l1++;
    			if(l1-1==r1) {
    				r2--;
    				break;
    			}
    		}
    		else{
    			l2++;
    			if(l2-1==r2) {
    				r1--;
    				break;
    			}
    		}
    		if(nums1[r1]<nums2[r2])r2--;
    		else r1--;
    	}
    	if(l1>r1) {
    		int temp=r2+l2;
    		double result=temp%2==1?(nums2[temp/2]+nums2[temp/2+1])/2.0:nums2[temp/2];
    		return result;
    	}else if(l2>r2) {
    		int temp=r1+l1;
    		double result=temp%2==1?(nums1[temp/2]+nums1[temp/2+1])/2:nums1[temp/2];
    		return result;
    	}else{
    		double result=(nums1[l1]+nums2[l2])/2.0;
    		return result;
    	}
    }
	public static void main(String [] args) {
		top4 t=new top4();
		int [] n1= {3,4};
		int [] n2= {};
		System.out.println(t.findMedianSortedArrays(n1, n2));
	}
}
