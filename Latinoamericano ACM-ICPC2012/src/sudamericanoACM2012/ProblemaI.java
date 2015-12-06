package sudamericanoACM2012;

import java.util.Scanner;

public class ProblemaI 
{
	public static int [] vector;
	public static String cadena = "";
	
	public static void cambio(int i, int v)
	{
		vector[i-1] = v;
		
	}
	
	public static void mostrar()
	{
		for (int i = 0; i < vector.length; i++) 
		{
			System.out.println(vector[i]);	
		}
	}
	
	public static String producto(int i, int j)
	{
		int k = 1;
		for (int j2 = i-1; j2 < j-1; j2++) 
		{
			k = k * vector[j2];
		}
		if (k==0)
		{
			return "0";
		}
		if (k > 0)
		{
			return "+";
		}
		else
		{
			return "-";
		}
	}

	public static void main(String[] args) 
	{
		String cad = "";
		Scanner in = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		int n = 1;
		int c = 1;
		while (n>0 && c > 0)
		{
			n = in.nextInt();
			c = in.nextInt();
			if (n>0 && c > 0){
				vector = new int[n];
				for (int i = 0; i < n; i++) 
				{
					vector[i] = in.nextInt();
				}
				for (int i = 0; i < c; i++) 
				{
					String orden = entrada.next();
					/*String [] vec = new String[3];
					vec = ord.split(" ");
					String orden = vec[0];
					String primeroX = vec[1];
					String segundoX = vec[2];
					int primero = Integer.parseInt(primeroX);
					int segundo = Integer.parseInt(segundoX);*/
					int primero, segundo;
					if (orden.equals("C"))
					{
						 primero = in.nextInt();
						 segundo = in.nextInt();
						cambio(primero, segundo);
					}
					if (orden.equals("P"))
					{
						 primero = in.nextInt();
						 segundo = in.nextInt();
						cad = producto(primero, segundo);
						cadena = cadena +  cad;
					}
					
				}
			}
			System.out.println(cadena);
		}
		
	}
}