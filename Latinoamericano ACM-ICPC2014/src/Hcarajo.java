
import java.util.Arrays;
import java.util.Scanner;

public class Hcarajo {
	
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
			for (int i = 0; i < vect.length; i+=2) 
			{
				int result = Math.abs(vect[i]-vect[i+1]);
				acumulador += result;
			}
			if(acumulador==0)
			{
				System.out.println(0);
			}
			else if(acumulador<24)
				System.out.println(24-acumulador);
			else
				System.out.println(acumulador-24);
		}
	}
}
