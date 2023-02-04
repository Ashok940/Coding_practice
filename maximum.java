package one_dimensional;

public class maximum {
	public int getmaximum(int arr[]) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[]args) {
		maximum m=new maximum();
		int arr[]= {12,22,33,44,32,32,12,23,44,54,32,12,34,999,99};
		System.out.println(m.getmaximum(arr));
	}

}
