package one_dimensional;

public class remove_odd {
	public static void display(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
	}
	public static int[]remove_od(int arr[]){
		int n=arr.length;
		int counteven=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				counteven++;
			}
		}
		int idx=0;
		int result[]=new int[counteven];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				result[idx]=arr[i];
				idx++;
			}
		}
		return result;
	}
	public static void main(String[]args) {
		int arr[]= {12,21,22,23,34,33,35,36,38,39,40};
		System.out.println("the original array or element are:........................");
		display(arr);
		System.out.println("after remove the odd number........................");
		int[]result=remove_od(arr);
		display(result);
	}

}
