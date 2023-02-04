package one_dimensional;

public class sortedsqures {
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
	public static int[]sortedsq(int arr[]){
		int n=arr.length;
		int i=0;
		int j=n-1;
		int result[]=new int[n];
		for(int k=n-1;k>=0;k--) {
			if(Math.abs(arr[i])>Math.abs(arr[j])) {
				result[k]=arr[i]*arr[i];
				i++;
			}
			else {
				 result[k]=arr[j]*arr[j];
				j--;
			}
			
			
		}
		return result;
	}
	public static void main(String[]args) {
		sortedsqures sq=new sortedsqures();
		int arr[]= {-4,-1,0,3,10};
		display(arr);
		int result[]=sortedsq(arr);
		display(result);
	}
}
