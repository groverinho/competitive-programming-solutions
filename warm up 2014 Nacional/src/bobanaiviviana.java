import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class bobanaiviviana {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int casos = Integer.parseInt(entrada.readLine());
		while (casos>0) 
		{
			String cadena = entrada.readLine();
			String aux = cadena;
			String aux2 = cadena;
			aux = aux.replace(" ", "");
			aux2 = new StringBuilder(aux).reverse().toString();
			if (aux.equalsIgnoreCase(aux2)) 
				System.out.println("SI");
			else
				System.out.println("NO");
			casos--;
		}
	}

}
