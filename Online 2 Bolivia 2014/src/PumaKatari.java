import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PumaKatari
{
	public static int inicio = 0;
	public static int destino = 0;
	public static ArrayList<Integer> vect = new ArrayList<Integer>();
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int casos= entrada.nextInt();
		while (casos>0) 
		{
			vect.clear();
			int nodo = entrada.nextInt();
			int n = entrada.nextInt();
			inicio = entrada.nextInt();
			destino = entrada.nextInt();
			int [][] matrizAdyacencia = new int[nodo][nodo];
			
			for (int i = 0; i < matrizAdyacencia.length; i++) 
			{
				for (int j = 0; j < matrizAdyacencia.length; j++)
					matrizAdyacencia[i][j]=Integer.MAX_VALUE;
			}
			for (int i = 0; i < n; i++) 
			{
				int a = entrada.nextInt(), b = entrada.nextInt(), peso = entrada.nextInt();
				matrizAdyacencia[a-1][b-1]=peso;
			}
			floyd(matrizAdyacencia,nodo);
			int guardar=10000, c = 0;
			for (int i = 0; i < vect.size(); i++) 
			{
				guardar = Math.min(guardar, vect.get(i));
			}
			for (int i = 0; i < vect.size(); i++) 
			{
				if(guardar == vect.get(i))
					c++;//System.out.println(c);
			}
			
			System.out.println(c);
			casos--;
		}
	}
	/*
2
5 7 1 5
1 2 10
1 3 10
1 4 20
2 4 10
2 5 20
3 4 10
4 5 10
4 4 1 4
1 2 10
1 3 10
2 4 10
3 4 10
	 * */
	

	static int[][] floyd (int w[][],int n)
	{
		int aux=0;
		for (int k = 0; k < n; k++) 
		{
			for (int i = 0; i < n; i++) 
			{
				for (int j = 0; j < n; j++) 
				{
					if(i!=j)
					{
						w[i][j]=Math.min(w[i][j],w[i][k]+w[k][j]);
						if (w[i][j] == w[inicio-1][destino-1])
						{
							aux=w[i][j];
							vect.add(aux);
						System.out.println("\t minimos para "+(i+1)+" a "+(j+1)+" son: "+aux);
						}
						//System.out.println("caminos "+(i+1)+" y "+(j+1)+" "+w[i][j]);
					}
					
				}
			}
		}
		return w;
	}

}
