

import java.util.Scanner;

 class b {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextInt())
		{
			int n = in.nextInt();
			int [] vector = new int[20];
			int i = 0;
			while (n>0) 
			{
				vector[i] = n % 3;
				n /= 3;
				i++;
			}
			for (int j=0; j<i-1; j++)
			{
				if (vector[j] > 1) 
				{
					vector[j] -= 3;
					vector[j+1]++;
				}
			}
			if (vector[i-1] > 1) 
			{
				vector[i-1] -= 3;
				System.out.print("+");
			}
			for (int j=i-1; j>=0; j--) 
			{
				if (vector[j] == 1) 
					System.out.print("+");
				else if (vector[j] == 0) 
					System.out.print("0");
				else 
					System.out.print("-");	
			}
			System.out.println();
		}
	}
		

}
