import java.util.*;
import java.io.*;

public class milling {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int piezas = sc.nextInt();
		int pasos = sc.nextInt();
		int ancho = sc.nextInt();
		int maxAlto = sc.nextInt();

		int matriz[][] = new int[piezas][ancho];
		int vector[] = new int[ancho];
		for (int i = 0; i < piezas; i++) {
			for (int j = 0; j < ancho; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		
		for (int i = 0; i < pasos; i++) {
			for (int j = 0; j < ancho; j++) {
				vector[j] = Math.max(vector[j], sc.nextInt());
			}
		}

		for (int i = 0; i < piezas; i++) {
			for (int j = 0; j < ancho; j++) {
				matriz[i][j] = Math.min(matriz[i][j], maxAlto-vector[j]);
				if (j != 0) 
					System.out.print(" ");
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}
	}
}
