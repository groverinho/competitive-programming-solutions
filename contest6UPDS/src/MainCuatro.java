
import java.util.ArrayList;
import java.util.Scanner;


class MainCuatro {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
			int n;
			while(true)
			{
				n = entrada.nextInt();
				if(n==0)
					break;
				int []deudas = new int[n];
				for (int i = 0; i < deudas.length; i++)
					deudas[i]=entrada.nextInt();
				int n2 = entrada.nextInt();
				for (int k = 0; k < n2; k++)
				{
					int consulta = entrada.nextInt();
					ArrayList<Integer> rangos = new ArrayList<Integer>();
					for (int i = 0; i < deudas.length; i++)
					{
						int suma = deudas[i];
						if(suma==consulta)
						{
							rangos.add(i);
							rangos.add(i);
						}
						for (int j = i+1; j < deudas.length; j++) 
						{
							if(suma+deudas[j]<=consulta)
							{
								suma +=deudas[j];
								if(suma==consulta)
								{
									rangos.add(i);
									rangos.add(j);
									break;
								}
							}
							else
								break;
						}
					}
					if(rangos.size()>0)
					{
						for (int i = 0; i < rangos.size(); i+=2)
							System.out.println(rangos.get(i)+" "+rangos.get(i+1));
					}
					else
						System.out.println("-1");
				}
			}
			}}

