import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


 class mensajesv2 {

	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		int casos = entrada.nextInt();
		
		for (int i = 0; i < casos; i++)
		{
			
			int l = entrada.nextInt();
			String cadena = entrada.next();
			int cont =0;
			 cadena = cadena.replaceAll("[c|(]", "C");
			 cadena = cadena.replaceAll("[O|0]", "o");
			 cadena = cadena.replaceAll("D", "d");
			 cadena = cadena.replaceAll("[E|3]", "e");
			 cadena = cadena.replaceAll("r", "R");
			 cadena = cadena.replaceAll("[A|@]", "a");
			 Pattern p = Pattern.compile("CodeRoad");
			 Matcher m = p.matcher(cadena);
			 while (m.find()) 
				cont++;
			 System.out.println("Caso #"+(i+1)+": "+cont);
		}
	}
}

