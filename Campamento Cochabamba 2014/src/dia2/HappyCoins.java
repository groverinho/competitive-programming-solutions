package dia2;

import java.util.Scanner;

public class HappyCoins {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		int hhb=0,lxh=0;
		while (casos>0)
		{
			int n = in.nextInt();
			for (int i = 0; i < n; i++) 
			{
				String modenas = in.next();
				if (modenas.equals("hhb"))
					hhb++;
				else
					lxh++;			
			}
			if (hhb!=lxh)
				System.out.println("hhb");
			else
				System.out.println("lxh");
		casos--;	
		}
		

	}

}
