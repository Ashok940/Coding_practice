package one_dimensional;

public class reverse {
	public static void display(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	public static void reversedemo(int arr[],int start,int end) {//algorithm
		int temp;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		
	}
	public static void main(String[]args) {
		int arr[]= {12,22,33,21,22,24,25,27};
		int start=0;
		int end=arr.length-1;
		System.out.println("without reverse array are:............");
		display(arr);
		reversedemo(arr,start,end);
		System.out.println("after reverse array are:............");
		display(arr);
	}

}
