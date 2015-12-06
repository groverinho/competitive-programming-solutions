package sudamericanoACM2012;
import java.io.IOException;
import java.util.Scanner;

public class ProblemI2 
{
	public static long [] vector;
	public static int contador = 0;
	public static String cadena1 = "";
	public static String cadena2 = "";
	
	public static void cambio(int i, int v)
	{
		vector[i-1] = v;
	}
	
	public static void mostrar()
	{
		for (int i = 0; i < vector.length; i++) 
		{
			cadena2 =  cadena2 + vector[i]+ " "; 
		}
		System.out.print(cadena2); System.out.println();
	}
	
	public static String producto(int i, int j)
	{
		long k = 1; String es=""; long k2 = 0; 
		for (int j2 = i-1; j2 <= j-1; j2++) 
		{
			if (vector[j2]<0) { k2 = -1; }
			if (vector[j2]>0) { k2 = 1; }
			if (vector[j2]==0) { k2 = 0; }
//			System.out.println(k + " * " + k2);
			k = k * k2;
		}
//		System.out.println("k =" + k);
		if (k>0)
		{
			es = "+";
		}
		if (k == 0)
		{
			es = "0";
		}
		if (k < 0)
		{
			es = "-";
		}
		return es;
	}

	public static void main(String[] args) throws IOException
	{
		String cad = "";
		Scanner in = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		int n = 1;
		int c = 1;
		while (1==1)
		{
			n = in.nextInt();
			c = in.nextInt();
			
			if (n>0 && c > 0){
				vector = new long[n];
				for (int i = 0; i < n; i++) 
				{
					vector[i] = in.nextInt();
				}
				
				for (int i = 0; i < c; i++) 
				{
					String orden = in.next();
					int primero = in.nextInt();
					int segundo = in.nextInt();

//					System.out.println(orden);
//					System.out.println(primero);
//					System.out.println(segundo);
					if (orden.equals("C"))
					{
						cambio(primero, segundo);
					}
					if (orden.equals("P"))
					{
						cad = producto(primero, segundo);
						cadena1 = cadena1 + cad;
					}
				}
//				cadena2 = cadena2 + cadena1;
				if (contador==0)
				{
					contador++;} 
				System.out.println(cadena1); cadena1 = "";
			}
		}
	}
}