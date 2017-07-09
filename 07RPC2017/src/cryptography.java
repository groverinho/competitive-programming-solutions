// Grover Irusta M.

import java.util.*;

public class cryptography 
{
	public static void main(String[] args)
	{		
		Scanner in = new Scanner(System.in);
		String cifrado = in.next();
		String llave = in.next();
		
		for (int i = 0; i < cifrado.length(); i++)
		{
			char mensaje = (char) ('A' + ((int)(cifrado.charAt(i) - 'A') - (int)(llave.charAt(i) - 'A') + 26) % 26);
			System.out.print(mensaje);
			llave += mensaje;
		}
		
		System.out.println();
	}
}
