

import java.util.Scanner;

public class SPRITES
{
	public static void main(String[] args) 
	{
		Scanner entrada= new Scanner(System.in);
		while(entrada.hasNextInt())
		{
			int cont=1;
			int casos = entrada.nextInt();
			for (int i = 0; i < casos; i++) 
			{
				int filas = entrada.nextInt();
				int columnas = entrada.nextInt();
				int[][]sprite = new int[filas][columnas];
				boolean[][]matrizAux = new boolean[filas][columnas];
				for (int j = 0; j < sprite.length; j++) 
				{
					for (int j2 = 0; j2 < sprite[1].length; j2++) 
					{
						sprite[j][j2]=entrada.nextInt();
					}
				}
				int frames=0;
				int []color  = new int[10];
				for (int j = 0; j < sprite.length; j++)
				{
					for (int j2 = 0; j2 < sprite[1].length; j2++) 
					{
						if(matrizAux[j][j2]==false&&sprite[j][j2]!=0)
						{
							frames++;
							matrizAux[j][j2]=true;
							int pos = recorrer(matrizAux, sprite, j, j2);
							color[pos]++;
						}
					}
				}
				System.out.println("Caso #"+cont+": "+frames);
				for (int k = 1; k < color.length; k++) 
				{
					if(k!=color.length-1)
						System.out.print(color[k]+" ");
					else
						System.out.print(color[k]+"\n");
				}
				cont++;
			}
		}
	}
	
	public static int recorrer(boolean matrizAux [][],int sprite [][],int j,int j2)
	{
			//DERECHA
			if (j2+1<=matrizAux[1].length-1 &&matrizAux[j][j2+1]==false && sprite[j][j2+1]==sprite[j][j2])
			{
				matrizAux[j][j2+1]=true;
				recorrer(matrizAux, sprite, j, j2+1);
			}
			//IZQUIERDA
			else if(j2-1>=0&&matrizAux[j][j2-1]==false && sprite[j][j2-1]==sprite[j][j2])
			{
				matrizAux[j][j2-1]=true;
				recorrer(matrizAux, sprite, j, j2-1);
			}
			//ARRIBA
			else if(j-1>=0&&matrizAux[j-1][j2]==false && sprite[j-1][j2]==sprite[j][j2])
			{
				matrizAux[j-1][j2]=true;
				recorrer(matrizAux, sprite, j-1, j2);
			}
			//ABAJO
			else if(j+1<=matrizAux.length-1&&matrizAux[j+1][j2]==false && sprite[j+1][j2]==sprite[j][j2])
			{
				matrizAux[j+1][j2]=true;
				recorrer(matrizAux, sprite, j+1, j2);
			}
			//DIAGONAL ARRIBA DERECHA
			else if(j-1>=0 && j2+1<=sprite[1].length-1 &&matrizAux[j-1][j2+1]==false && sprite[j-1][j2+1]==sprite[j][j2])
			{
				matrizAux[j-1][j2+1]=true;
				recorrer(matrizAux, sprite, j-1, j2+1);
			}
			//DIAGONAL ARRIBA IZQUIERDA
			else if(j-1>=0 && j2-1>=0&&matrizAux[j-1][j2-1]==false && sprite[j-1][j2-1]==sprite[j][j2])
			{
				matrizAux[j-1][j2-1]=true;
				recorrer(matrizAux, sprite, j-1, j2-1);
			}
			//DIAGONAL ABAJO IZQUIERDA
			else if(j+1<=sprite.length-1 && j2-1>=0&&matrizAux[j+1][j2-1]==false && sprite[j+1][j2-1]==sprite[j][j2])
			{
				matrizAux[j+1][j2-1]=true;
				recorrer(matrizAux, sprite, j+1, j2-1);
			}
			//DIAGONAL ABAJO DERECHA
			else if(j+1<=sprite.length-1 && j2+1<=sprite[1].length&&matrizAux[j+1][j2+1]==false && sprite[j+1][j2+1]==sprite[j][j2])
			{
				matrizAux[j+1][j2+1]=true;
				recorrer(matrizAux, sprite, j+1, j2+1);
			}
			else
			{
				return sprite[j][j2];
			}
			return sprite[j][j2];	
	}
}
