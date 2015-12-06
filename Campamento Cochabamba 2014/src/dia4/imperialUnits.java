package dia4;

import java.util.Scanner;

public class imperialUnits {

	static long gcd(long metric, long metric2) {
		while(metric2!=0) metric2 ^= metric ^= metric2 ^= metric %= metric2;
		return metric;
	}

	static long lcm(long metric, long metric2) {
		return metric / gcd(metric, metric2) * metric2;
	}


	public static void main(String[] args)
	{
		int n, i;
		int  mul, back, fwrd;
		long[][] metric = new long[10][2];
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		while(n!=-1) 
		{
			for(i = 0; i < n; i++)
			{
				int a = in.nextInt();
				int b = in.nextInt();
				metric[i][0] = a; metric[i][1] = b;
			}
			for(fwrd = back = i = 1; i < n; i++)
			{
				mul = (int) lcm(metric[i-1][1], metric[i][0]);
				back *= mul / metric[i-1][1];
				fwrd *= mul / metric[i][0];
			}
			metric[0][0]*=back; metric[n-1][1]*=fwrd;
			mul = (int) gcd(metric[0][0], metric[n-1][1]);
			System.out.print(metric[0][0] / mul);
			System.out.println(metric[n-1][1] / mul);
		

	}

}
}
