package one_dimensional;

public class minimum {
	public  int getmin(int arr[]) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[]args) {
		minimum m=new minimum();
		int arr[]= {11,9,2,33,12,13,14,144,99};
		System.out.println(m.getmin(arr));
		
	}

}
