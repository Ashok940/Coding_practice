package one_dimensional;

public class secondMaximum {
	public int getsecmax(int arr[]) {
		int max=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				second=max;
				max=arr[i];
			}
			else if(arr[i]>second && max!=0){
				second=arr[i];
				}
		}
		return second;
	}
	public static void main(String[]args) {
		secondMaximum sm=new secondMaximum();
		int arr[]= {12,22,12,32,34,33,38,39,89};
		System.out.println(sm.getsecmax(arr));
	}

}
