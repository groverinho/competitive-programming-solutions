

import java.util.Scanner;

public class building {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
			while(n!=0)
			{
				 int k = entrada.nextInt();

					//int aux = (k*(k+1))/2;
				 int aux = (n*(n+1)*(n+2))/6;
					for (int i = 0; i < k-1; i++)
					{
					    int f =entrada.nextInt();
						aux-=f;
					}
		          System.out.println(aux);
		          
		          n--;
				}
			}

}

/*
 int k = entrada.nextInt();

					int aux = (k*(k+1))/2;
					for (int i = 0; i < k-1; i++)
					{
					    int f =entrada.nextInt();
						aux-=f;
					}
		          System.out.println(aux);
		          
		          n--;
				}
 */