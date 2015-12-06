import java.math.BigInteger;
import java.util.Scanner;


public class catalanPUTA {

	public static BigInteger metodo( int n, int k )
	{
	    if (k > n) 
	    {
	    	return BigInteger.ZERO;
	    }
	    	
	    if (k * 2 > n) 
	    	k = n-k;
	    if (k == 0) return BigInteger.ONE;

	   BigInteger result = BigInteger.valueOf(n);
	    for( int i = 2; i <= k; ++i ) {
	        result = result.multiply(BigInteger.valueOf(n-i+1));
	        result = result.divide(BigInteger.valueOf(i));
	    }
	    return result;
	}
	public static BigInteger C (int n)
	{
		BigInteger r ;
		r = metodo(2*n, n);
		r = r.divide(BigInteger.valueOf(n+1));
		return r;
	}
	public static void main(String[] args) {
		Scanner in  =new Scanner(System.in);
		int n = in.nextInt();
		BigInteger res = BigInteger.ZERO ;
		for (int i = 0; i <= n; i++) 
		{
			 res = res.add(C(i).multiply(C(n-i)));
		}
		System.out.println(res);

	}

}
