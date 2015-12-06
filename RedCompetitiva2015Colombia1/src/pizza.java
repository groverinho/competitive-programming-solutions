import java.util.Scanner;
import java.util.Set;


public class pizza {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int p = in.nextInt();
	
		if (n == 1)
			System.out.println("YES");
		else if (n == 2)
			if (p == 1)
				System.out.println("YES");
			else
				System.out.println("NO");
		else if (n == 3) {
			if (p == 2)
				System.out.println("YES");
			else
				System.out.println("NO");
		} else {
			int B = n / 3;
			int A = (n + 1) / 3;
			int I = (n - 1) / 3;
			
			if (p > B && p <= n - A)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}