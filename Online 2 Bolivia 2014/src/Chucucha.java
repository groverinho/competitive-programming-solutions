import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Chucucha {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(entrada.readLine());
		for (int i = 0; i < casos; i++) 
		{
			String cadena = entrada.readLine();
			int c = 0;
			int h = 0;
			int u = 0;
			int a = 0;
			int l = cadena.length()/8;
			if(cadena.length()%8 == 0)
			{
				for (int j = 0; j < cadena.length(); j++)
				{
					if(cadena.charAt(j)=='c')
						c++;
					else if(cadena.charAt(j)=='h')
						h++;
					else if(cadena.charAt(j)=='u')
						u++;
					else if(cadena.charAt(j)=='a')
						a++;
					else
					{
						System.out.println("NO");
						break;
					}
				}
					if(c%3==0 && h%2==0 && u%2==0 && c>l && h > l && u > l && a == l)
					{
						if((c/l)==3 && (h/l)==2 && (u/l)==2 && (a/l)==1)
							System.out.println("SI");
						else
							System.out.println("NO");
					}
					else
					{
						System.out.println("NO");
					}
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}
