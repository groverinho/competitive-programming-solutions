import java.util.Scanner;


public class HexagonalNumbers {

	public static int metodo(int n)//sumatoria de 4*i+1 hasta n
	{
		int aux = 0;
		if(n==0)
			return 0;
		else
		{
			for (int i = 0; i < n; i++) 
				aux = aux + ((4*i)+1);
			return aux;
		}
	}
	public static int metodo2(int n)
	{
		return ((2*n)*((2*n)-1))/2;
	}
	
	public static void main(String[] args)
	{
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			while (n!=0) 
			{
				//System.out.println(metodo(n));
				System.out.println(metodo2(n));
				n = in.nextInt();
			}
	}

}
