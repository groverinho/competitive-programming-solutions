
import java.util.Arrays;
import java.util.Scanner;

public class H {
	// 0 1 2 3 4 5 6 7 8 9 10 11 12 1 2 3 4 
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
			int acumulador2=0;
				for (int i = 0; i < vect.length; i+=2) 
				{
					int result = Math.abs(vect[i]-vect[i+1]);
					acumulador += result;
				}
				acumulador2=(11-Math.abs(vect[0]))+(12-vect[vect.length-1])+1;
				for (int i = 1; i < vect.length-1; i+=2) 
				{
					int result2 = Math.abs(vect[i]-vect[i+1]);
					acumulador2 += result2;
				}
			if(acumulador==0 || acumulador2==0)
		    {
				System.out.println(0);
			}
			else if(acumulador<acumulador2)
				System.out.println(acumulador);
			else if(acumulador2<=acumulador)
				System.out.println(acumulador2);
		}
	}                                                                                                        
}
