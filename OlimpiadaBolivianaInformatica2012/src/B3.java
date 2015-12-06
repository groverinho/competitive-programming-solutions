import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
public class B3 
{
	public static int metodo(String cadena)
	{
		int der=0, izq=0;//<--->--==>
		int [] tamFlecha = new int[cadena.length()];
		int c=0;
		for (int j = 0; j < cadena.length(); j++)
		{
			izq=0;
			if (cadena.charAt(j)=='<')
			{
				izq++;
				tamFlecha[c]=izq;
				c++;
				j++;
				if (cadena.charAt(j)=='-')
				{
					izq++;
					j++;
					while (cadena.charAt(j)=='-')
					{
						j++;
						izq++;
						if (j>cadena.length()-1) 
							break;
					}
					tamFlecha[c]=izq;
					c++;	
				}
				
				else if (cadena.charAt(j)=='=')
				{
					izq++;
					j++;
					while (cadena.charAt(j)=='=')
					{
						j++;
						izq++;
						if (j>cadena.length()-1) 
							break;
					}
					tamFlecha[c]=izq;
					c++;	
				}		
			}
		}
			for (int k = cadena.length()-1; k >=0; k--)
			{
				der = 0;
				if (cadena.charAt(k)=='>')
				{
					der++;
					tamFlecha[c]=der;
					c++;
					k--;
					if (cadena.charAt(k)=='-')
					{
						der++;
						k--;
						while (cadena.charAt(k)=='-')
						{	
							k--;
							der++;
							if (k<0) 
								break;
							
							//System.out.println("der"+ der);
						}
						tamFlecha[c]=der;
						c++;	
					}
					else if (cadena.charAt(k)=='=')
					{
						der++;
						k--;
						while (cadena.charAt(k)=='=')
						{
							k--;
							der++;
							if (k<0) 
								break;
						}
						tamFlecha[c]=der;
						c++;	
					}		
				}
			}
			Arrays.sort(tamFlecha);
			
		/*	for (int i = 0; i < tamFlecha.length; i++) {
				System.out.println(tamFlecha[i]);
			}*/
	
		//System.out.println("impresion"+tamFlecha[cadena.length()-1]);
		return tamFlecha[tamFlecha.length-1];
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		String linea;
		
		for (int i = 0; i < n ; i++)
		{	
			linea = in.next();
			if (metodo(linea)>=1)
				System.out.println(metodo(linea));
			else
				System.out.println("-1");
			
		}
	}
	

}
