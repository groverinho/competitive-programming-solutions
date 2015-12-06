import java.util.Arrays;
import java.util.Scanner;


public class h {

	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		char m[],n[];
		int auxN,auxM;
		while(entrada.hasNext())
		{
			String num = entrada.next();
			int cont = 0;
			auxN = Integer.parseInt(num);
			while(auxN!=0)
			{
				m = num.toCharArray();
				Arrays.sort(m);
				String aux1 = "";
				for (int i = 0; i < m.length; i++) 
				{
					aux1+=m[i];
				}
				auxN = Integer.parseInt(num);
				auxM = Integer.parseInt(aux1);
				auxN = auxN-auxM;
				num = auxN+"";
				cont++;
			}
			System.out.println(cont);
		}

	}

}
