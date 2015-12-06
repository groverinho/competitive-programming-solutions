

import java.util.Arrays;
import java.util.Scanner;

public class j {
	public static int  total_diff, ans, aux;
	public static int[] p = new int[1005];
	public static int[] d= new int[505];
	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for (int i=0; i<n; i++) 
		{
			p[i]= in.nextInt();
		}
		Arrays.sort(p);
		total_diff = 0;
		for (int i=0; i<n; i+=2) {
			d[i/2] = Math.abs(p[i]-p[i+1]);
			total_diff += d[i/2];
		}
		if (total_diff == 0) {
			ans = -1;
		} else {
			//sort(d, d+(n/2));
			Arrays.sort(d);
			ans = 0;
			total_diff -= d[0];
			aux = d[0];
			int j = 1;
			while (total_diff > aux) {
				ans++;
				total_diff -= d[j];
				aux += d[j++];
			}
		}
		System.out.println(ans);
		

	}

}
