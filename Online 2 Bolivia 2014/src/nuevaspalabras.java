

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class nuevaspalabras 
{
	int [] posLetras = new int [30];
	ArrayList<String> stringArray = new ArrayList<String>();

	public static void main(String[] args) 
	{
		nuevaspalabras instancia = new nuevaspalabras();
		Scanner entrada = new Scanner(System.in);
		String aux;
		do
		{
			int cantidad = entrada.nextInt();
			if (cantidad == 0)
				break;
			for (int h = 0; h<cantidad; h++)
			{
				instancia.stringArray.add(entrada.next());			
			}
			
			HashSet<String> hashSet = new HashSet<String>(instancia.stringArray);
			instancia.posLetras[26]=hashSet.size();
			instancia.stringArray.clear();
			instancia.stringArray.addAll(hashSet);
			Collections.sort(instancia.stringArray);
					
			instancia.inicializaPosiciones();
			//instancia.mostrarVectorPos();
			//System.out.println("Tres:"+instancia.stringArray.get(0));
			/*int indi = "m".charAt(0)-97;
			for(int g=instancia.posLetras[indi]-1; g<instancia.posLetras[indi+1]-1; g++)
			{
				System.out.println(instancia.stringArray.get(g));
			}
			*/
			int hasta = entrada.nextInt();
			for (int j = 0; j<hasta; j++)
			{
				boolean bandera = false;
				aux = entrada.next();	
				int indice = aux.charAt(0)-97;
				for(int i=instancia.posLetras[indice]; i<instancia.posLetras[indice+1]; i++)
				{
					if (instancia.stringArray.get(i).length()<aux.length())
					{
						//String aux2 = aux.substring(0, instancia.stringArray.get(i).length());
						//String aux3 = instancia.stringArray.get(i-1);
						//String aux5 = instancia.stringArray.get(i);
						if(aux.substring(0, instancia.stringArray.get(i).length()).equals(instancia.stringArray.get(i)))
						{
							String palabra2 =aux.substring(instancia.stringArray.get(i).length(),aux.length());
							int indice2 = palabra2.charAt(0)-97;
							for(int h=instancia.posLetras[indice2]; h<instancia.posLetras[indice2+1]; h++)
							{
							   //String aux4 = instancia.stringArray.get(h);
							   if(palabra2.equals(instancia.stringArray.get(h)))
							   {
								   System.out.println("SI");
								   instancia.stringArray.add(instancia.posLetras[indice+1],aux);
								   for(int k=indice+1; k<=26; k++)
									   instancia.posLetras[k]++;
								   bandera = true;
								   break;
							   }
							}
							if (bandera)
								break;
						}
					}
				}
				if(!bandera)
					System.out.println("NO");
			}
	 		//String [] palabras = {"ab", "aB", "c", "0", "2", "1Ad", "a10"};
			//Arrays.sort(stringArray);
			/*
			System.out.println("****** String Array Ordenado 1*******");
			for(String str : instancia.stringArray)
			{
				System.out.println(str);
			}
			System.out.println("****** String Array Ordenado 2*******");
			Iterator<String> itrArrayList = instancia.stringArray.iterator(); 
	 		int posicion = 1; 
	 		while (itrArrayList.hasNext()) { 
	 			System.out.println("Posicion(" + posicion + ") = " + itrArrayList.next()); 
	 			posicion++; 
	 		}
			
			FileWriter fichero = null;
		    PrintWriter pw = null;
		        try
		        {
		            fichero = new FileWriter("d:\\SalidaNuevasPalabras.txt");
		            pw = new PrintWriter(fichero);
		            Iterator<String> itrArrayList = instancia.stringArray.iterator(); 
			 		int posicion = 0; 
			 		while (itrArrayList.hasNext()) { 
			 			pw.println("Posicion(" + posicion + ") = " + itrArrayList.next()); 
			 			posicion++; 
			 		}
		    			 
		        } 
		        catch (Exception e) 
		        {
		            e.printStackTrace();
		        } 
		        finally 
		        {
		           try 
		           {
		           // Nuevamente aprovechamos el finally para 
		           // asegurarnos que se cierra el fichero.
		           if (null != fichero)
		              fichero.close();
		           } 
		           catch (Exception e2) 
		           {
		              e2.printStackTrace();
		           }
		        }
		        */
		}while(true);
	}
	
	public void inicializaPosiciones()
	{
		int valor = this.stringArray.get(0).charAt(0),contador = 0;
		//this.posLetras[this.stringArray.get(1).charAt(0)-97]=1;
		for(String str : this.stringArray)
		{
			if(str.charAt(0)!=valor)
			{
				this.posLetras[str.charAt(0)-97]=contador;
				valor = str.charAt(0);
			}
			contador++;
		}
	}
	public void mostrarVectorPos()
	{
		for (int i=0 ; i<30; i++)
		{
 			System.out.println("Posicion(" + i + ") = " + this.posLetras[i]); 	
		}
	}
}
