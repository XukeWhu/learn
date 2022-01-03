package test;

public class offer66 {
    public int[] constructArr(int[] a) {
        int [] result=new int[a.length];
        for(int i=0;i<a.length;i++) result[i]=1;
        for(int i=1;i<a.length;i++) {
        	result[i]=result[i-1]*a[i-1];
        }
        int temp=1;
        for(int i=a.length-2;i>=0;i--) {
        	temp=temp*a[i+1];
        	result[i]=result[i+1]*temp;
        }
        return result;
    }
}
