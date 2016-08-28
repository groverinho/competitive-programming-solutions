import java.util.*;
import java.io.*;

public class pacman {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        int casos = in.nextInt();
        int cont = 1;
        while (casos-->0)  {
           

            int fila = in.nextInt();
	    	int columna = in.nextInt();
            int[][] matriz = new int[fila][columna];
            for (int i=0; i<fila; i++) {
                for (int j=0; j<columna; j++) {

                  
                    if ((i==0 && j == 0) || (i==fila-1 && j==columna-1)) 
                    {
                        String basura = in.next();
                        matriz[i][j] = 0;
                    }
                    else
                        matriz[i][j] = in.nextInt();
                } 
            }
            int[][] matriz2 = new int[fila][columna];
	    	matriz2[0][0] = 0;	
            for (int i=1; i<columna; i++)
                matriz2[0][i] = matriz2[0][i-1]+matriz[0][i];

            for (int i=1; i<fila; i++)
                matriz2[i][0] = matriz2[i-1][0] + matriz[i][0];
            for (int i=1; i<fila; i++)
                for (int j=1; j<columna; j++)
                    if (matriz2[i-1][j] > matriz2[i][j-1])
                        matriz2[i][j] = matriz2[i-1][j] + matriz[i][j];
                    else
                        matriz2[i][j] = matriz2[i][j-1] + matriz[i][j];
            System.out.print("Game Board #"+cont+": ");
            System.out.println(matriz2[fila-1][columna-1]);        
            cont++;
        }
  
    }
}