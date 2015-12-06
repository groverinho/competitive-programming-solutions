import java.math.BigInteger;
import java.util.Scanner;


public class stranged2 {
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int casos = entrada.nextInt();
		for (int i = 0; i < casos; i++)
		{
			BigInteger n = entrada.nextBigInteger();
			String palabra = entrada.next();
			BigInteger auxxx =n.mod(BigInteger.valueOf(palabra.length()));
			int aux2 = auxxx.intValue();
			int aux = palabra.length()-aux2;
			System.out.println(palabra.substring(aux, palabra.length())+palabra.substring(0,aux));
		}
	}
}
