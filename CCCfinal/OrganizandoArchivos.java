
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OrganizandoArchivos{

	public static void main(String[] args) throws FileNotFoundException 
	{
		//File a = new File("C:\\1.in");
		Scanner entrada =  new Scanner(System.in);
		int casos = entrada.nextInt();
		while(casos-->0)
		{
			int k = entrada.nextInt();
			String nombres[]= new String[k];			
			for (int i = 0; i < k; i++) {
				nombres[i]=entrada.next();
			}
			int max = 0;
			int m =0;
			int aux2 = 0;
			for (int i = 0; i < nombres[0].length(); i++) 
			{
				String aux = nombres[0].substring(m,m+i+1);
				for (int j = 1; j < nombres.length; j++)
				{
					int comp = nombres[j].indexOf(aux);
					if(comp==-1)
						break;
					if(j==nombres.length-1)
						max = Math.max(max, aux.length());
				}
				if((i+aux2)==nombres[0].length()-1)
				{
					i=-1;
					aux2++;
					if(m==nombres[0].length()-1)
						break;
					m++;
				}
				
			}
			System.out.println(max);
		}

	}

}
