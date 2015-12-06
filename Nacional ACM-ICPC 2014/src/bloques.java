import java.util.Scanner;


class bloques {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int[]visibles = new int[1000];
		visibles[0]=0;
		int cantidad=6;
		for (int i = 1; i < visibles.length; i++) 
		{
			visibles[i]+=cantidad;
			cantidad +=4;
		}
		int casos;
		do
		{
			casos = entrada.nextInt();
			if(casos==0)
				break;
			int[]edificios = new int[casos];
			for (int i = 0; i < edificios.length; i++) 
			{
				edificios[i] = entrada.nextInt();
			}
			int suma=0;
			for (int i = 0; i < edificios.length; i++)
			{
				if(edificios[i]!=0)
				{
					int aux = visibles[edificios[i]];
					if((i-1)>=0)
					{
						if(edificios[i-1]<=edificios[i])
						{
							aux-=edificios[i-1];
						}
						else
						{
							aux-=edificios[i];
						}
					}
					if((i+1)<=edificios.length-1)
					{
						if(edificios[i+1]<=edificios[i])
						{
							aux-=edificios[i+1];
						}
						else
						{
							aux-=edificios[i];
						}
					}
					suma+=aux;
				}
			}
			System.out.println(suma);
		}while(casos!=0);
	}
}
