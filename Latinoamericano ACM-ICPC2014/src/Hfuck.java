import java.util.Arrays;
import java.util.Scanner;

public class Hfuck {
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		while(entrada.hasNextInt())
		{
			int n = entrada.nextInt();
			int [] vect = new int [n];
			for (int i = 0; i < n; i++) 
			{
				vect[i] = entrada.nextInt();
			}
			Arrays.sort(vect);
			int acumulador = 0;
			int aux =100000000;
			if(vect[0]<0 && vect[vect.length-1]>0)
			{
				if((vect[0]==-11) && (vect[vect.length-1]==12))
					aux = 1;
				else
					aux=(11-Math.abs(vect[0]))+(12-vect[vect.length-1])+1;
			}
			if((aux< (Math.abs(vect[0])-Math.abs(vect[1]))) && (aux<Math.abs(vect[vect.length-2]-vect[vect.length-1]))|| aux==1)
			{
				acumulador = aux;
				for (int i = 1; i < vect.length-1; i+=2) 
				{
					int result = Math.abs(vect[i]-vect[i+1]);
					acumulador += result;
				}
			}
			else
			{
				for (int i = 0; i < vect.length; i+=2) 
				{
					int result = Math.abs(vect[i]-vect[i+1]);
					acumulador += result;
				}
			}
			if(acumulador==0)
			{
				System.out.println(0);
			}
			else if(acumulador<24)
				System.out.println(acumulador);
		}
	}                                                                                                          
}
