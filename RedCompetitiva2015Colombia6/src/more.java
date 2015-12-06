import java.util.Scanner;


public class more {

	public static void main(String[] args) 
	{
		Scanner  in = new Scanner(System.in);	
		
		while (in.hasNext()) 
		{
			String cadena=in.next();	
			StringBuilder cad2 = new StringBuilder("00").append(cadena);

			for (int i = cad2.length()-1, d =+1, c =+1; d != 0; i--) 
			{
				if (cad2.charAt(i) == '0') 
				{ 
					cad2.setCharAt(i, '1'); 
					d -= c; 
				}
				else if (cad2.charAt(i) == '1') 
				{ 
					cad2.setCharAt(i, '0'); 
					d += c; 
				}
				d /= 2; 
				c =-c;
			}
			int inicio = 0;
			while (inicio+1 < cad2.length() && cad2.charAt(inicio) == '0')
				inicio++;
			System.out.println(cad2.substring(inicio));
	}
	}
}
