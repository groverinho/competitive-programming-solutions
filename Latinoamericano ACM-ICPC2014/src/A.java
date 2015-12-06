
import java.util.Scanner;

public class A {

	public static void main(String[] args) 
	{
		Scanner entrada =  new Scanner(System.in);
		while(entrada.hasNextInt())
		{
			int [] conect1 = new int [5];
			int [] conect2 = new int [5];
			for (int i = 0; i < conect1.length; i++)
			{
				conect1[i]= entrada.nextInt();
			}
			for (int i = 0; i < conect2.length; i++)
			{
				conect2[i]= entrada.nextInt();
			}
			boolean bandera = true;
			for (int i = 0; i < conect2.length; i++)
			{
				if(conect1[i]==conect2[i])
				{
					bandera = false;
					break;
				}
					
			}
			if(bandera)
				System.out.println("Y");
			else
				System.out.println("N");
		}

	}

}
