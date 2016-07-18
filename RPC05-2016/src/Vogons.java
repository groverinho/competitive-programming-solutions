import java.util.Scanner;


public class Vogons {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n, m;
		
		int matriz [][]= new int [301][301];
		while (in.hasNext())
		{
			n = in.nextInt();
			m = in.nextInt();
			for (int i = 1; i <= n; i++)
			{
				for (int j = 1; j <= m; j++)
					matriz[i][j] = in.nextInt();
			}
			
			int gc[]= new int[301] ;
			for (int i = 1; i <= m; i++) 
			{
				int dp[]= new int[301] ;
				for (int j = 1; j <= n; j++)
					dp[j] = Math.max(dp[j-1], (j-2 >= 0 ? dp[j-2] : 0) + matriz[j][i]);
				for (int j = 1; j <= n; j++)
					gc[i] = Math.max(gc[i], dp[j]);
			}
			
			int dp[]= new int[301] ;
			int  r = 0;
			for (int i = 1; i <= m; i++) 
			{
				dp[i] = Math.max(dp[i-1], (i-2 >= 0 ? dp[i-2] : 0) + gc[i]);
				r = Math.max(r, dp[i]);
			}
			System.out.println(r);
		}
	}

}
