package one_dimensional;

public class resize {
	public void display(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public int[] resizedemo(int arr[],int capacity) {
		int temp[]=new int[capacity];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
			
		}
		return temp;
	}
	public static void main(String[]args) {
		resize re=new resize();
		int org[]= {12,22,33,22,11,22,33};
		re.display(org);
		System.out.println("the original array capacity are:"+org.length);
		org=re.resizedemo(org,13);
		org[7]=78;
		org[9]=99;
		System.out.println("after array capacity are:"+org.length);
		re.display(org);
	}

}
