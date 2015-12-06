

import java.util.Scanner;


public class base3 {
	public static int base3(int n) {
		
		int c = 0;
		while (n>0)
		{
			n=n/3;
			c++;
		}
		return c;
	}
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	while (entrada.hasNextInt()) {
		int n = entrada.nextInt();

	
	System.out.println(base3(n));
	
	}	
	}

}
