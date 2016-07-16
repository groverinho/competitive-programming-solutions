import java.util.Arrays;
import java.util.Scanner;


public class triangularTestI {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dp[]= new int [100001];
		Arrays.fill(dp, 3);
		int A[]= new int [100001];
		int An=0;
		dp[0] = 0;
		 	for (int i = 1, x = 1; x <= 100001; i++, x += i)
		 		A[An++] = x;
		 	for (int i = 0; i < An; i++)
		 		dp[A[i]] = 1;
		 	for (int i = 0; i < An; i++) {
		 		for (int j = i; j < An && A[i]+A[j] <= 100001; j++)
		 			dp[A[i]+A[j]] = Math.min(dp[A[i]+A[j]], 2);
		 	}
		 	int n;
		 	 	while (in.hasNext()) 
		 	 {
		 	 		n = in.nextInt();
		 	 		if (dp[n] <= 2)
		 	 			System.out.println(dp[n]);
		 	 		else
		 	 			System.out.println("3");
		 	 	}

	}

}
