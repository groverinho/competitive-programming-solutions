import java.util.ArrayList;
import java.util.Scanner;


public class copious {
/*
8
at
cat
ali
sat
nerds
coach
couch
ninja
5
co-ch
-at
---
ali
a-c
 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		String[] dicionario = new String[casos];
		
		for (int i=0; i<casos; i++)
			dicionario[i] = in.next();
		
		int consultas = in.nextInt();
		for (int i=1; i<=consultas; i++) {

			String cadena = in.next();

			
			ArrayList<String> lista = new ArrayList<String>();
			for (int j=0; j<dicionario.length; j++)
				if (verifica(cadena, dicionario[j]))
					lista.add(dicionario[j]);

			System.out.println("Word #"+i+": "+cadena);
			for (int k=0; k<lista.size(); k++)
				System.out.println(lista.get(k));
			System.out.println("Total number of candidate words = "+lista.size());
		}
	}
	public static boolean verifica(String cadena, String palabraDic) {

		if (cadena.length() != palabraDic.length()) return false;

		for (int i=0; i<cadena.length(); i++)
			if (cadena.charAt(i) != '-' && cadena.charAt(i) != palabraDic.charAt(i))
				return false;
		return true;
	}
}
