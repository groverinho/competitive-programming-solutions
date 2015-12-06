import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class LosConsejosdeAliBaba 
{
	public static void main(String[] args) 
	{
		/*
		Permutaciones:
		Sí entran todos los elementos.
		Sí importa el orden.
		No se repiten los elementos.
		*/
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) 
		{
			int k= in.nextInt();
			int n= in.nextInt();
			int[]numeros = new int[k];
			for (int i = 0; i < k; i++)
				numeros[i]= in.nextInt();// entran todos los elementos.
			ArrayList<Integer> lista = new ArrayList<Integer>();
			Arrays.sort(numeros);//Sí importa el orden.
			for (int i = 0; i < numeros.length; i++)
			{
				if (!lista.contains(numeros[i]))
				{
					lista.add(numeros[i]);//No se repiten los elementos.
				}
			}
			for (int i = 0; i < lista.size(); i++)
			{
				System.out.println(lista.get(i));	
			}
		}
	}
}