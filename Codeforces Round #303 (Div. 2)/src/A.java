import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class A {

	public static void main(String[] args) 
	{
	
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int [][] matriz= new int [111][111];
		for (int i = 1; i <=n; i++) 
		{
			boolean bandera=true;
			for (int j = 1; j <= n; j++)
			{
				matriz[i][j]= in.nextInt();
				if(matriz[i][j]==1||matriz[i][j]==3)
					bandera=false;
			}
			if (bandera)
			{
				lista.add(i);
			}
			
		}
		int tam = lista.size();
		System.out.println(tam);
		for (int i = 0; i < tam; i++) {
			System.out.print(lista.get(i)+" ");
		}
	
	}
}
