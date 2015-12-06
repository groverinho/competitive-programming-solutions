import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;


public class ORDENANDO_VECTORES {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		while (!entrada.ready())
		{
				
			
			int s = Integer.parseInt(entrada.readLine());
			String cad = entrada.readLine();
			String cad2 = entrada.readLine();
			String []dec = cad.split(" ");
			String []cre = cad2.split(" ");

			Arrays.sort(cre);
			Arrays.sort(dec);
			int suma = 0;
			for (int i = dec.length-1, j = 0; i>= 0; i--,j++)
			{
				suma +=Integer.parseInt(dec[i])*Integer.parseInt(cre[j]);
			}
			System.out.println(suma);
	}
	}
}
