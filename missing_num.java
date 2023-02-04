package one_dimensional;

public class missing_num {
	public int getmis(int arr[]) {
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		for(int num:arr) {
			sum=sum-num;
		}
		return sum;
	}
	public static void main(String[]args) {
		missing_num ms=new missing_num();
		int arr[]= {12,11,6,8,4,5,2,1,3,10,7};
		System.out.println("the missing num are:"+ms.getmis(arr));
	}

}
