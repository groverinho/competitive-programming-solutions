

import java.util.Scanner;

public class CaraoCruz 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();;
		while (casos!=0)
		{
			int juan=0, maria=0;
			while (casos>0)
			{
				casos--;
				int n = in.nextInt();
				if (n==0)
					maria++;	
				else
					juan++;
			}
			System.out.println("Maria gano "+maria+" veces y Juan gano "+juan+" veces");
			casos = in.nextInt();//Maria gano 5040 veces y Juan gano 2960 veces
		}
		
	}
}

