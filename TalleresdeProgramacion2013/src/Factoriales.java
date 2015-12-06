import java.math.BigInteger;
import java.util.Scanner;


public class Factoriales {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			while (in.hasNextInt())
			{
				int num = in.nextInt();
				int hasta = in.nextInt();
				if (num ==0 && hasta==0) 
					break;
			BigInteger res = BigInteger.ONE;		
			for (int i = 2; i <= num; ++i)
				res = res.multiply(BigInteger.valueOf(i));		
			String cad = res.toString();
			String aux  = cad;
			StringBuilder cadena = new StringBuilder(cad);
			while (cadena.charAt(cadena.length()-1)=='0')
			{
				cadena.deleteCharAt(cadena.length()-1);
			}
//			while (cad.endsWith("0")==true) //28  3
//				cad= cad.substring(0, cad.length()-1);
			
			if (cadena.length()<=hasta)
				System.out.println(cadena);
			else
				System.out.println(cadena.substring(cadena.length()-hasta, cadena.length()));
//			num = in.nextInt();
//			 hasta = in.nextInt();
		}
	}
}
/*18!
6402373705728000

19!
121645100408832000*/