import java.util.Scanner;


public class AgitatedChandan {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int casos = entrada.nextInt();
		while(casos>0)
		{
			int nodo = entrada.nextInt();
			int aristas = nodo - 1;
			int n = aristas;
			int [][] matrizAdyacencia = new int[nodo-1][nodo-1];
			for (int i = 0; i < matrizAdyacencia.length; i++) 
			{
				for (int j = 0; j < matrizAdyacencia.length; j++)
					matrizAdyacencia[i][j]=100001;
			}
			for (int i = 0; i < n; i++) 
			{
				int a = entrada.nextInt();
				int b = entrada.nextInt();
				int peso = entrada.nextInt();
				matrizAdyacencia[a][b]=peso;
			}
	
			int[][]nueva = floyd(matrizAdyacencia,nodo);
			int aux = 0;
			for (int i = 0; i < nueva.length; i++)
			{
				for (int j = 0; j < nueva.length; j++)
				{
					if (nueva[i][j]!= 100001)
						aux = Math.max(aux,nueva[i][j] );			
				}
				
			}
			int aux2 = aux+1;
			if ((aux2)<100)
				System.out.println(0+ " "+ (aux2));
			else if ((aux2)>100)
				System.out.println(100+ " "+ (aux2));
			else if ((aux2)>1000)
				System.out.println(1000+ " "+ (aux2));
			else if ((aux2)>10000)
				System.out.println(10000+ " "+ (aux2));
				casos--;
		}
	}
	
	static int[][] floyd (int w[][],int n)
	{
		for (int k = 0; k < n; k++) 
		{
			for (int i = 0; i < n; i++) 
			{
				for (int j = 0; j < n; j++) 
				{
					if(i!=j)
					w[i][j]=Math.min(w[i][j],w[i][k]+w[k][j]);
				}
			}
		}
		return w;
	}
	}
/*
 1
5
1 2 4
3 2 3
2 5 2
4 1 1
 * */

