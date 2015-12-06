import java.util.ArrayList;
import java.util.Scanner;
public class HyperPrimos 
{
	public static int hyperprimo(int n)
    {
		
		ArrayList<Integer> prim = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            	prim.add(i);
        }
        int sum = 0;
        for (int i = 0; i < prim.size(); i++)
			sum+=prim.get(i);
        	
        	int cont2=0;
        	for (int i = 2; i <= sum; i++)
        	{
        		 if (sum % i == 0)
                     cont2++;
			}
        	int a=0;
        	if (cont2==1) 		
        		a=1;
        	else
        	{
		    		n= sum;
		    		hyperprimo(n);
        		a=1;
        	}
        	return a;
    }
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);	
		while (in.hasNextInt()) 
		{
			int hyper = in.nextInt();
			int aux = hyper;
			int rest =0;
			while (aux>=2)
			{
				rest = rest + hyperprimo(aux);
				aux--;		
			}			
			System.out.println(rest);
		}
	}

}
