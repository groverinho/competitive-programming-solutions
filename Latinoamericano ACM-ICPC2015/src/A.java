import java.util.Scanner;


public class A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			
		
		long n = in.nextLong();
		String cad = n+"";
		int numeros[] = new int [16];
		int tamano = cad.length();
		 long pre = 0;
		for (int i = 0; i < tamano; i++) 
		{
			int ch = -1;
			for (int j = 9; j >= 0; j--) 
			{
				if (numeros[j] == 2)	
					continue;
				numeros[j]++;
				int tamAux = 0;
				 long mn = j, ten = 10;
				for (int k = 0; k < 10; k++) {
					for (int l = numeros[k]; l < 2; l++) {
						if (tamAux < tamano-i-1) {
							mn = mn * 10 + k;
							tamAux++;
							ten *= 10;
						}
					}
				}
				numeros[j]--;
				if (pre*ten + mn <= n) {
					ch = j;
					break;
				}
			}
			if (ch != -1)
				pre = pre*10 + ch;
			numeros[ch]++;
		}
		System.out.println(pre);
	}
	}

}
