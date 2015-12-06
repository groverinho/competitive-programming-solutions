import java.util.Arrays;
import java.util.Scanner;


public class MatchMakers {

	public static void main(String[] args) 
	{
		Scanner in  = new Scanner(System.in);
		int casos = in.nextInt();
		for (int i = 0; i < casos; i++) {
			int n = in.nextInt();
			int hombre[] =  new int[n];
			int mujer[] =  new int[n];
			for (int j = 0; j < hombre.length; j++) 
			{
				mujer[j]= in.nextInt();
			}
			for (int j = 0; j < mujer.length; j++) 
			{
				hombre[j]= in.nextInt();
			}
			Arrays.sort(hombre);
			Arrays.sort(mujer);
			int c = 0;
			for (int j = 0, jj=n-1 ; j < n; j++, jj--)
			{
				if (mujer[j] % hombre[jj]==0 ||hombre[jj] % mujer[j]==0) // 
				{
					c++;
				}
			}
			System.out.println(c);
		}


	}

}
/*
 * 2
4
1 6 9 12
4 12 3 9*/
 