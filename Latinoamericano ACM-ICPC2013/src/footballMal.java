import java.util.Scanner;


 class footballMal {

	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		int partidos=in.nextInt();
		int golcompra=in.nextInt();
		int[]x = new int [partidos];
		int[]y = new int [partidos];
		for (int i = 0; i < partidos; i++) 
		{
			 x[i]=in.nextInt();
			 y[i]=in.nextInt();
		}
		int c=0;
		int puntos=0;
	
		while (golcompra>0)
		{
			for (int i = 0; i < x.length; i++)
			{	     int n=0;
						int j=0;
					if (x[i]>y[i])
							puntos+=3;
					else if (x[i]==y[i])
					{
							if (golcompra>0)
							{
							n=x[i]+1;
							x[i]=n;
							puntos+=3;
							golcompra--;
							}
							else
							{
								puntos+=1;
							}
					}
					else if (x[i]<y[i])
					{
						j=y[i]-x[i];
						int aux=golcompra-(j+1);
						if (aux>=0)
						{
							n=x[i]+j+1;
							x[i]=n;
							puntos+=3;
							golcompra=golcompra-(j+1);
						}
					}
			}
			System.out.println(golcompra);
			System.out.println(puntos);
			golcompra=0;
		}
	}

}
