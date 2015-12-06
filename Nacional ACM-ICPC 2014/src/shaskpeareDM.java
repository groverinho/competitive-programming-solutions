import java.util.Arrays;
import java.util.Scanner;
class shaskpeareDM{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		while(entrada.hasNextInt())
		{
			int n = entrada.nextInt();
			int [] vector = new int[100010];
			int [] cont = new int[100010];
			int aux =1; 
			for (int i = 0; i < n; i++) 
			{
				int x1 = entrada.nextInt();
				int x2 = entrada.nextInt();
				int y = entrada.nextInt();
				for (int j = x1; j <= x2; j++) 
				{
					if(y>vector[j])
					{
						vector[j]=y;
						cont[j]=aux;
					}
				}
				aux++;
			}
			Arrays.sort(cont);
			for (int i = 1; i < aux; i++) 
			{
				int aux2 = 0;
				for (int j = 0; j < cont.length; j++) 
				{
					if(cont[j]==i)
						aux2++;
				}
				System.out.println(aux2);
			}
		}
	}
}