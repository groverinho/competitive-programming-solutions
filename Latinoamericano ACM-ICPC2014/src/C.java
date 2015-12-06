import java.util.Scanner;


public class C 
{		
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) 
		{
			
			String cadena = in.next();
			 int matriz[][]= new int [cadena.length()+1][3];
			 matriz[0][0] = 0;
			 matriz[0][1] =0;
			 matriz[0][2] = 0;
			 int n;
			 long acu = 0;
			for (int i=1; i<=cadena.length(); i++) 
			{
				n = (cadena.charAt(i-1)) % 3;
				if (numero(cadena.charAt(i-1))) 
				{
					matriz[i][n] = matriz[i-1][0] + 1;
					matriz[i][(n+1)%3] = matriz[i-1][1];
					matriz[i][(n+2)%3] = matriz[i-1][2];
					acu += matriz[i][0];
				} 
				else 
				{
					 matriz[0][0] = 0;
					 matriz[0][1] =0;
					 matriz[0][2] = 0;	
				}
			}
			System.out.println(acu+2);
	    }
	}
	public static boolean numero (char c) 
	{
		return (c >= '0' && c <= '9');
	}
}
