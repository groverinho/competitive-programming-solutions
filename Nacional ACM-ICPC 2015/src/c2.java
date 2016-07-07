import java.util.Scanner;

public class c2
{
	/*
1978
((x+0)+z)
(x+(3*z))
((x+(3*z))-((5-(2-y))/y))
	*/
	
	static char[] T, P; 
	  static int n, m;
	  static int [] b; 



	  static void kmpPreprocess() { 
	    int i = 0, j = -1; b[0] = -1;
	    while (i < m) { 
	      while (j >= 0 && P[i] != P[j]) j = b[j]; 
	      i++; j++; 
	      b[i] = j; 
	  } }       

	  static int kmpSearch() {
	    int i = 0, j = 0,cont=0; 
	    while (i < n) { 
	      while (j >= 0 && T[i] != P[j]) j = b[j]; 
	      i++; j++; 
	      if (j == m) { 
	        
	    	  cont++;
	        j = b[j]; 
	      }
	      }
	    return cont;
	    }

	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		while(entrada.hasNext())
		{
			String patron = entrada.next();
			String texto = entrada.next();
			patron = patron.replaceAll("\\d+", "W").replaceAll("\\w+","W").replaceAll("['+','/',-]","*");
			texto = texto.replaceAll("\\d+", "W").replaceAll("\\w+","W").replaceAll("['+','/',-]","*");
			T = new String(texto).toCharArray();
		    P = new String(patron).toCharArray();
		    n = T.length;
		    m = P.length;
		    b = new int[400001];
		    kmpPreprocess();
			int contador = kmpSearch();
		    System.out.println(contador);
		}
	}
}
