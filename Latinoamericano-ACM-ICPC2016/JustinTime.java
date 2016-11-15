import java.util.Scanner;

/**
Name: Grover Irusta Miranda
University: UPDS Tarija
Date: 15-11-16
 */

public class JustinTime {


	public static boolean esPrimo (int x)
	{
		  if (x == 2)
		    return true;
		  if (x%2 == 0)
		    return false;
		  int max=(int) Math.sqrt(x);
		  for (int k = 3; k < max; k+=2)
		    if (x%k == 0)
		      return false;
		  return true;
		}
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		while (!esPrimo(n))
			n--;
		System.out.println(n);

	}

}
