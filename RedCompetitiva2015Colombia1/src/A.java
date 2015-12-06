/*import java.math.BigInteger;
import java.util.Scanner;


public class A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos>0)
		{
			int n = in.nextInt();
			BigInteger res = BigInteger.ONE;
			for (int i = 2; i <= n; ++i)
				res = res.multiply(BigInteger.valueOf(i));
			
			BigInteger total1 = res.subtract(BigInteger.valueOf(1));
			BigInteger total2 = BigInteger.valueOf((long) (Math.pow(10,9)+7));
					//(fact(n)-1)% (Math.pow(10, 9)+7);
			System.out.println(total1.mod(total2));
			casos--;
		}

	}

}
*/import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos>0)
		{
			int t = in.nextInt();
			long sum = 1;
			for (long i = 2; i <= t; i++) 
			{
				sum *= i;
				sum = sum % 1000000007;
			}
			System.out.println(sum - 1);
			casos--;
		}
	}
}