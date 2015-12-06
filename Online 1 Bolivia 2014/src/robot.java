import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class robot {
	static int x1=0, y1=0;
	public static void main(String[] args) 
	{
		Scanner in  = new Scanner(System.in);
		double c = in.nextInt();
		int p = in.nextInt();
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		ArrayList<Integer> energia = new ArrayList<Integer>();
		ArrayList<Integer> xAux = new ArrayList<Integer>();
		ArrayList<Integer> yAux = new ArrayList<Integer>();
		ArrayList<Integer> energiaAux = new ArrayList<Integer>();
		for (int i = 0; i < p; i++) 
		{
			x.add(in.nextInt());
			y.add(in.nextInt());
			energia.add(in.nextInt());
		}
		xAux = x; yAux= y; energiaAux = energia;
		double maximo=0;
	//	while (x!=null) 
	//	{
			for (int i = 0; i < p; i++) 
			{
				double distancia = Math.sqrt(Math.pow(xAux.get(i)-x1, 2)+Math.pow(yAux.get(i)- y1,2));
				if (c>=distancia) 
				{
				//	c=c-formula(xAux.get(i), yAux.get(i));
				} 
				
				
			}
		
	//	maximo = Math.max(maximo, distancia);
		
		System.out.println(maximo);

	}



}
