package one_dimensional;

public class move_zero_end {
	public void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void arraydemo() {
 	   int arr[]= {1,12,0,13,0,0,0,14,0,14,0,16,0,89,78,0};
		   
		   System.out.println("original array are................");
		   display(arr);
		   System.out.println("\nafter move 0 array are................");
		   movezero(arr,arr.length);
		   display(arr);
		 }
	public void movezero(int arr[],int n) {
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i] !=0 && arr[j] == 0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!= 0) {
				j++;
			}
		}
       
	}
	public static void main(String[]args) {
		move_zero_end mze=new move_zero_end();
		mze.arraydemo();
		
		
	}

}
