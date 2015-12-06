import java.util.Scanner;
public class ProblemaD 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int n,m;
		n = entrada.nextInt();
		m = entrada.nextInt();
		int[][] matriz=new int[n][m];
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
				matriz[i][j]=entrada.nextInt();
		boolean bandera = true;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				boolean bandera2=true;
				if((i-1>0)&(j-1>0))
				{
					if(matriz[i][j]<=matriz[i-1][j-1])
						bandera2=false;
					if(matriz[i][j]<=matriz[i][j-1])
						bandera2=false;
					if(matriz[i][j]<=matriz[i-1][j])
						bandera2=false;
				}
				if((i+1<n)&(j+1<m))
				{
					if(matriz[i][j]<=matriz[i+1][j+1])
						bandera2=false;
					if(matriz[i][j]<=matriz[i+1][j])
						bandera2=false;
					if(matriz[i][j]<=matriz[i][j+1])
						bandera2=false;					
				}
				if((i-1>0)&(j+1<m))
					if(matriz[i][j]<=matriz[i-1][j+1])
					bandera2=false;					
				if((i+1<n)&(j-1>0))
					if(matriz[i][j]<=matriz[i+1][j-1])
						bandera2=false;
				if(bandera2)
				{
					System.out.println((i+1)+" "+(j+1));
					bandera = false;
				}	
			}
		}
		if(bandera)
			System.out.println(-1);
	}
}