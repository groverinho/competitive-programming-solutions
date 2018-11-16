

/**
 * Name: Grover A. Irusta Miranda 
Company: CodeRoad - xTime 
Date 16/11/2018
 */
import java.util.*;

public class ASymmetricalPizza {
	public static int gcd(int n1, int n2) {
		if (n2 != 0) {
			return (gcd(n2, n1 % n2));
		} else {
			return (n1);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String n = in.next();
			String n2[] = n.split("\\.");
	//		System.out.println(n2[0]);
			int R = 100 * Integer.parseInt(n2[0]) + Integer.parseInt(n2[1]);

			int quantidade = 36000 / (gcd(36000, R));

			System.out.println(quantidade);

		}
	}
}
