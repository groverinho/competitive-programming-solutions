import java.util.ArrayList;
import java.util.Scanner;


class deudas {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
			int personas;
			do
			{
				personas = entrada.nextInt();
				if(personas==0)
					break;
				int []deudas = new int[personas];
				for (int i = 0; i < deudas.length; i++)
					deudas[i]=entrada.nextInt();
				int numConsul = entrada.nextInt();
				while(numConsul>0)
				{
					int consulta = entrada.nextInt();
					ArrayList<Integer> array = new ArrayList<Integer>();
					for (int i = 0; i < deudas.length; i++)
					{
						int suma = deudas[i];
						if(suma==consulta)
						{
							array.add(i);
							array.add(i);
						}
						for (int j = i+1; j < deudas.length; j++) 
						{
							if(suma+deudas[j]<=consulta)
							{
								suma +=deudas[j];
								if(suma==consulta)
								{
									array.add(i);
									array.add(j);
									break;
								}
							}
							else
								break;
						}
					}
					if(array.size()>0)
					{
						for (int i = 0; i < array.size(); i+=2)
							System.out.println(array.get(i)+" "+array.get(i+1));
					}
					else
						System.out.println("-1");
					numConsul--;
				}
			}while(personas!=0);}}

