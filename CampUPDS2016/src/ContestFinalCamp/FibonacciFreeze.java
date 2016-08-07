package ContestFinalCamp;
import java.math.BigInteger;
import java.util.Scanner;


public class FibonacciFreeze {

	//fibonaci
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger v[] = new BigInteger[5010];
		v[0]=BigInteger.ZERO;
		v[1]=BigInteger.ONE;
		for (int i = 2; i < v.length; i++) {
			v[i]= v[i-1].add(v[i-2]);
		}
		while (in.hasNext()) {
			int n = in.nextInt();
			System.out.println("The Fibonacci number for "+n+" is "+ v[n]);	
		}
		
	}

}
