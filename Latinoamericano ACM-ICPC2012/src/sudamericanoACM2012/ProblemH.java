package sudamericanoACM2012;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;


public class ProblemH {
	public static String cadena = "";
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int angulo =0;
		while(angulo!=-1)
		{
			angulo= entrada.nextInt();
			if (angulo>-1)
			{
				metodo(angulo);
			}
		}
		System.out.print(cadena);
	}
	
	public static void metodo(int angulo)
	{
		boolean b = false;
		
		salir:	for (int i = 0; i <= 12; i++)
				{
					for (int j = 0; j <= 60; j++)
					{
						int angle=Math.abs(i-j)*6;
					if (angulo==angle)
					{
						b= true;
						break salir;
						
					}
				}
			}
		if (b)
			cadena = cadena + "Y\n";
		else
			cadena = cadena + "N\n";
		
			
	}

}
