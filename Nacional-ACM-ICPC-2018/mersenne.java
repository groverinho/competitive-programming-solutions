
/**
Name: Grover A. Irusta Miranda
Company: CodeRoad - xTime
Date 13/09/2018
 */
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class mersenne {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {

			int a = in.nextInt();
			int b = in.nextInt();
			BigInteger c = BigInteger.valueOf(2).pow(a + b).subtract(BigInteger.valueOf(1));
			System.out
					.println(c.isProbablePrime(100) ? "2^" + (a + b) + "-1 is prime" : "2^" + (a + b) + "-1 not prime");
		}

	}

}
