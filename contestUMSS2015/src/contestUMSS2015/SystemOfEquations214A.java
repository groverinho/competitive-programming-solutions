package contestUMSS2015;

import java.util.Scanner;

public class SystemOfEquations214A {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int pares=0;
		int comp=n+m;
		for(int a=0;a<=comp;a++)
		{
			for(int b=0;b<=comp;b++)
			{
				int eq1=(b)+(a*a);
				int eq2=(a)+(b*b);
				if(eq1==n&&eq2==m)
					pares++;
			}
		}
		System.out.println(pares);
	}

}
