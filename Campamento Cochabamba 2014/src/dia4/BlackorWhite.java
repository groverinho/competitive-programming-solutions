package dia4;
import java.util.Scanner;


 class BlackorWhite {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int casos = entrada.nextInt();
		while(casos!=-1)
		{
			if (casos%2==0) {
				
			
			int []vector = new int [casos/2];
			for (int i = 0; i < vector.length; i++) 
			{
				vector[i]=entrada.nextInt();
			}
			int cont = 0;
			for (int i = vector.length-1; i>=0; i--)
			{
				if(vector[i]!=entrada.nextInt())
					cont++;
			}
			System.out.println(cont);
			}
			else
			{
				int []vector = new int [(casos/2)+1];
				for (int i = 0; i < vector.length; i++) 
				{
					if (i != (casos/2)+1) {
						
					}
					vector[i]=entrada.nextInt();
				}
				int cont = 0;
				for (int i = vector.length-1; i>=0; i--)
				{
					if(vector[i]!=entrada.nextInt())
						cont++;
				}
				System.out.println(cont);
				}
			}
			casos = entrada.nextInt();
	}
}

