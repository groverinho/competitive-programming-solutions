package dia1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


 class CountingPascal {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		long a[]= new long[10000000];
		int pas =Integer.parseInt(entrada.readLine());
		while (pas !=-1) 
		{
			long maximo = 0;
			int i=0;
			while(i<=pas)
			{
				long x[]=new long[i];
				int j=0;
				while(j<i)
				{
					if (j==0 || j==(i-1))
						x[j]=1;
					else
						x[j]= a[j]+a[j-1];
					maximo = Math.max(maximo, x[j]);
					j++;
				}
				i++;
				System.out.println(i);
				a=x;
			}
				System.out.println(maximo);	
				pas =  Integer.parseInt(entrada.readLine());			 
		}
		/*int n =  Integer.parseInt(entrada.readLine());
		int m =  Integer.parseInt(entrada.readLine());*/
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static long binomialcof(int n,int m)
	{
		long [][] bc= new long [1000][1000];
		for (int i = 0; i <=n; i++) {
			for (int j = 1; j <i; j++) {
				if((j==0)||(j==i))
					bc[i][j]=1;
				else
				bc[i][j] = bc[i-1][j-1] + bc[i-1][j];
			}
		}
		return bc[n][m];
	}
	public static int a = 0;
	public static int pascal(int n, int k)
	 {
	 if ((k>n)||(k<0))
	    return 0;
	 else if ((k==n)||(k==0))
	    return 1;
	 else 
	 {
		 a++;
		 System.out.println(a);
	    return pascal(n-1,k-1)+pascal(n-1,k);
	 }
	 
	 }
	
}
