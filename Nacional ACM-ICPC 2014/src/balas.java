import java.util.Scanner;


class balas {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int casos = entrada.nextInt();
		int num = 1;
		for (int i = 0; i < casos; i++)
		{
			int balas = entrada.nextInt();
			int []velocidades = new int[balas];
			for (int j = 0; j < balas; j++)
			{
				velocidades [j]=entrada.nextInt();
			}
			int reventados =0;
			for (int j = 0; j < velocidades.length; j++)
			{
				for (int j2 = j+1; j2 < velocidades.length; j2++) 
				{
					if(velocidades[j]>velocidades[j2])
						reventados++;
					else if(velocidades[j]==velocidades[j2])
						reventados+=2;
				}
			}
			System.out.println("Caso #"+num+": "+reventados);
			num++;			
		}

	}

}
