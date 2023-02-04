package one_dimensional;

public class add {
	public void display(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	public void arrdemo() {
		int myarray[]=new int[5];
		myarray[0]=90;
		myarray[1]=99;
		myarray[2]=45;
		myarray[3]=55;
		myarray[4]=89;
		myarray[2]=999;//update data
		display(myarray);
		System.out.println(myarray.length);
		System.out.println(myarray[myarray.length-1]);
		
	}
	public static void main(String[]args) {
		add a=new add();
		a.arrdemo();
	}

}
