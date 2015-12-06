package dia1;

import java.util.ArrayList;
import java.util.Scanner;


 class GuesstheNumber {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String cadena;
		while (in.hasNext()) {
			
		
		do
		{
			cadena = in.next();
			if(cadena.equals("*"))
				break;
			ArrayList<Integer> arraySI=  new ArrayList<Integer>();
			ArrayList<Integer> arrayNO =  new ArrayList<Integer>();
			for (int i = 0; i < cadena.length(); i++)
			{
				if(cadena.charAt(i)=='Y')
				{
					arraySI.add(i+1);
				}
				else
				{
					arrayNO.add(i+1);
				}	
			}
			int maximo = arraySI.get(arraySI.size()-1)*arraySI.get(arraySI.size()-2);
			int cont = arraySI.get(arraySI.size()-1);
			boolean result = false;
			for (int k = cont; k <= maximo; k+=cont)
			{
				boolean bandera = true;
				for (int i = 0; i < arrayNO.size(); i++)
				{
					if(k>arrayNO.get(i))
					{
						if(k%arrayNO.get(i)==0)
						{
							bandera=false;
							break;
						}
					}
					else
					{
						if(arrayNO.get(i)%k==0)
						{
							bandera=false;
							break;
						}
					}
				}
				if(bandera)
				{
					for (int i = 0; i < arraySI.size(); i++)
					{
						if(!(k%arraySI.get(i)==0))
						{
							bandera=false;
							break;
						}
					}
				}
				if(bandera)
				{
					result=true;
					cont=k;
					break;
				}
			}
			if(result)
				System.out.println(cont);
			else
				System.out.println("-1");
		}while(cadena!="*");	
	}
	}
}
