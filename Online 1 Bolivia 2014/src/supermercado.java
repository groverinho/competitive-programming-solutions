import java.util.Scanner;
class supermercado {
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
			int casos = entrada.nextInt();
				for (int k = 0; k < casos; k++) 
				{
					int bsOriginal = entrada.nextInt();
					int bs = bsOriginal;
					int prod = entrada.nextInt();
					int []vector = new int[prod];
					for (int i = 0; i < vector.length; i++) 
						vector[i]=entrada.nextInt();
					int maximo = 0,maxAux=0;
					for (int i = 0; i < vector.length; i++) 
					{
						maxAux = vector[i];
						bs = bsOriginal;
						if(vector[i]==bs)
						{
							System.out.println(bs);
							break;
						}
						else if(vector[i]<bs)
						bs-=vector[i];
						else
							continue;
						for (int j = 0; j < vector.length; j++) 
						{
							if(j!=i)
							{
								if(vector[j]<=bs)
								{
									bs-=vector[j];
									maxAux+=vector[j];
								}
							}
						}
						if(maxAux>maximo)
							maximo = maxAux;
					}
					System.out.println(maximo);			
			}
		}
}

