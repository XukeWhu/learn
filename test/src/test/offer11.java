package test;

public class offer11 {
	public int minArray(int[] numbers) {
		int low=0;
		int high=numbers.length-1;
		int temp=(low+high)/2;
		while(low<high) {
			if(numbers[temp]<numbers[high]) {
				high=temp;
			}else if(numbers[temp]>numbers[high]){
				low=temp+1;
			}else {
				high--;
			}
			temp=(low+high)/2;
		}
		return numbers[low];
    }
}
