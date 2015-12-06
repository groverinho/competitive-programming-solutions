import java.util.ArrayList;
import java.util.Scanner;


public class HyperPrimes2 {

	public static int Euclides(int a, int b)
	{
		int r=b;
		while (b> 0)
		{
			r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
/*	public static Boolean verificar(long  n)
    {
        if (n == 1)
            return false;
        else
        {
            for (int i = 2; i < n; i++)
                if (n % i == 0)
                    return false;
        }
        return true;
    }*/
	public static boolean esPrimo (int x)
	{
		  if (x == 2)
		    return true;
		  if (x%2 == 0)
		    return false;
		  int max=(int) Math.sqrt(x);
		  for (int k = 3; k < max; k+=2)
		    if (x%k == 0)
		      return false;
		  return true;
		}


	public static void main(String[] args) 
	{	
		Scanner in = new Scanner(System.in);	
		while (in.hasNextInt()) 
		{
			int hyper = in.nextInt();
			int cont = 0;
			for (int i = 2; i <= hyper; i++)
			{	
				int [] vector = new int[i];
				ArrayList<Integer> lista = new ArrayList<Integer>();

				int forI=0;
				for (int j = 1; j <= i; j++) 
				{
					vector[forI]=Euclides(i, j);
					if (!lista.contains(vector[forI]))
						lista.add(vector[forI]);
					forI++;
				}
				if (esPrimo(lista.size()))
					cont++;
			}
			System.out.println(cont);
		}	

	}

}
