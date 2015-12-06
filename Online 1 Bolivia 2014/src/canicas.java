import java.util.Scanner;
class canicas
{
	public static void main(String[] args) 
	{
		Scanner entrada =  new Scanner(System.in);
		while(entrada.hasNextInt())
		{
			int casos = entrada.nextInt();
			int cont = 1;
			for (int j = 0; j < casos; j++) 
			{
				int canicas = entrada.nextInt();
				int []turnos = new int[entrada.nextInt()];
				for (int i = 0; i < turnos.length; i++) 
					turnos[i]= entrada.nextInt();
					int i=0;
				while(canicas>0)
				{
					canicas -=turnos[i];
					if(canicas == 0)
					{
						if(i%2==0)
						{
							System.out.println("Caso #"+cont+": NO");
							cont++;
							break;
						}
						else
						{
							System.out.println("Caso #"+cont+": SI");
							cont++;
							break;
						}
						
					}
					else if(canicas<0)
					{
						if(i%2==0)
						{
							System.out.println("Caso #"+cont+": NO");
							cont++;
							break;
						}
						else
						{
							System.out.println("Caso #"+cont+": SI");
							cont++;
							break;
						}
					}
					i++;
					if(i==turnos.length)
						i=0;
				}
			}
		}
	}
}
