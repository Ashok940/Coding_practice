package one_dimensional;

public class remove_even {
	public static void display(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	public static int[] removeint(int arr1[]) {
		int n=arr1.length;
		int oddcount=0;
		for(int i=0;i<n;i++) {
			if(arr1[i]%2!=0) {
				oddcount++;
			}
		}
		int result[]=new int[oddcount];
		int idx=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]%2!=0) {
				result[idx]=arr1[i];
				idx++;
			}
		}
		return result;
	}
	public static void main(String[]args) {
		
		int array[]= {12,21,23,25,28,29,14,18};
		System.out.println("the original number is.................................");
		display(array);
		System.out.println("after remove the even number.................................");
		int result[]=removeint(array);
		display(result);
		
		
	}

}
