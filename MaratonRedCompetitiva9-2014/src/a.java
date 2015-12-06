
import java.util.Scanner;

class a {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int []valor = new int [n];
		char []descripcion = new char [n];
		for (int i = 0; i < n; i++)
		{
			valor[i] = entrada.nextInt();
			descripcion[i] = entrada.next().charAt(0);
		}
		boolean bandera =true;
		for (int i = 0; i < descripcion.length; i++)
		{
			if(i!= descripcion.length-1)
			{
				if(valor[i]==valor[i+1])
				{
					bandera = false;
					break;
				}
				if(descripcion[i]==descripcion[i+1])
				{
					bandera = false;
					break;
				}
			}
		}
		if(bandera)
		{
			System.out.println("B");
		}
		else
		{
			System.out.println("M");
		}
	}
}
