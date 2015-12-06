import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TrinomiosTriangulares {

	public static void main(String args[]) throws IOException 
	{
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int casos;
		long mat[][] = new long[41][84];
		long sum=0;
		mat[0][0] = 1;mat[0][1] = 0;mat[0][2] = 0;
		for (int i=1;i<=40;i++)
		{
			for (int j=0;j<=i*2;j++) 
			{
				sum = 0;
				for (int k=j-2;k<=j;k++)
				{
					if (k>=0)
						sum = sum+mat[i-1][k];
				}
				mat[i][j] = sum;
			}
			mat[i][i*2+1] = 0;
			mat[i][i*2+2] = 0;
		}
		casos = Integer.parseInt(bufEntrada.readLine());
		while (casos>0)
		{
			int n = Integer.parseInt(bufEntrada.readLine());
			casos = casos-1;
			int j = 0;
			String aux = "";
			while (mat[n][j]>0)
			{
				aux += mat[n][j]+ " ";
				j = j+1;
			}
			System.out.println(aux.trim());
		}
	}


}

