package dia3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DefendTheRohan {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader entrada = new BufferedReader( new InputStreamReader(System.in));
		//Scanner in = new Scanner(System.in);
		int casos = Integer.parseInt(entrada.readLine());
		int c=1;
		while (casos>0)
		{
			int n= Integer.parseInt(entrada.readLine());
			int [][] matriz = new int[n][n];
			
				
				for (int j = 0; j < matriz.length; j++) 
				{
					String cadena = entrada.readLine();
					cadena.split(" ");
					for (int j2 = 0; j2 < matriz.length; j2++) {
					//	matriz[j][j2]=  in.nextInt();	
					}
				}
			
			int r =  Integer.parseInt(entrada.readLine());
			//int ii=0;
			int total=0;
			while(r>0)
			{
				int s =  Integer.parseInt(entrada.readLine());
				int d=  Integer.parseInt(entrada.readLine());
				total = total + matriz[ s-1][2] + matriz[ d-1][2];
				r--;
			}
			System.out.println("Case #"+ c+": "+total);
			c++;
			casos--;
			
		}
	}
	

}
