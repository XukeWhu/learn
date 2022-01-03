package test;

public class offer17 {
	public int[] printNumbers(int n) {
		int num=1;
		for(int i=0;i<n;i++) {
			num=num*10;
		}
		System.out.println(num);
		int [] list=new int[num-1];
		for(int i=0;i<num-1;i++) {
			list[i]=i+1;
		}
		return list;
    }
	public static void main(String [] args) {
		int [] n=new int[10];
		offer17 o=new offer17();
		n=o.printNumbers(1);
	}
}
