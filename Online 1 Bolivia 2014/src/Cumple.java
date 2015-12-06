import java.util.Arrays;
import java.util.Scanner;
public class Cumple {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt())
		{
			int casos= in.nextInt();
				while(casos>0)
				{
					int nRegalos= in.nextInt(), PesoTotal= in.nextInt();
					int c=-1;
					int auxPeso=0;
					int[] pesos= new int[nRegalos];
					for (int i = 0; i < pesos.length; i++)
						pesos[i]=in.nextInt();
					Arrays.sort(pesos);
			
					for (int i = 0; i < pesos.length; i++) 
					{
						if (auxPeso<=PesoTotal) 
						{
							auxPeso = auxPeso+ pesos[i];
							c++;
						}
					}
					System.out.println(c);
					casos--;
				}
			}
	}
}

/*3
2 2
1 2
3 5
2 4 3
5 6
2 4 3 1 5*/