

import java.util.Scanner;

public class ProblemA {

	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		while(entrada.hasNextInt())
		{
			int w = entrada.nextInt();
			int n = entrada.nextInt();
			int p = entrada.nextInt();
			int aux = 0;
			int acumulador = 0;
			for (int i = 0; i < p; i++) {
				aux = entrada.nextInt();
				if(aux>=w && aux<=n)
					acumulador++;
			}
			System.out.println(acumulador);
		}
	}

}
