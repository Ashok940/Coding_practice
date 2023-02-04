package one_dimensional;

public class squrt {
	public int mySqrt(int x) {
        int sq=(int) Math.sqrt(x);
        return Math.round(sq);
    }
	public static void main(String[]args) {
		squrt s=new squrt();
		int x=10;
		System.out.println(s.mySqrt(x));
	}

}
