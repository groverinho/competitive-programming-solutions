import java.util.ArrayList;
import java.util.Scanner;


public class Bar {

	private static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int casos = entrada.nextInt();
		ArrayList<String> drinks =new ArrayList<String>();
		drinks.add("fernet");
		drinks.add("caipirinha");
		drinks.add("cerveza");
		drinks.add("ron");
		drinks.add("vodka");
		drinks.add("whisky");
		drinks.add("singani");
		
		while (casos>0) 
		{
			int n = entrada.nextInt();
			int menores = 0;
			int alcohol = 0;
			for (int j = 0; j < n; j++)
			{
				String in = entrada.next();
				if(isNumeric(in))
				{
					if(in.length()<=2)
					{
						if(Integer.parseInt(in)<18)
							menores++;
					}
				}
				else
				{
					if(drinks.contains(in))
						alcohol++;
				}
			}
			if(alcohol>menores)
				System.out.println(menores);
			else if(alcohol <= menores)
				System.out.println(alcohol);		
			casos--;
		}
	}
	}
