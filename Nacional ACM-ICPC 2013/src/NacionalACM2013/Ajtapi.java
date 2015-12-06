package NacionalACM2013;
import java.util.Scanner;

class Ajtapi 
{
	int[] vectorPosiciones;

	static class Nodo
	{
		String[] palabras;
		Nodo siguiente;
	}
	Nodo primero = null;
	Nodo ultimo = null;
	
	public void adicionarEnLista(String palabra1, String palabra2)
	{
		Nodo cajaNueva = new Nodo();
		cajaNueva.palabras = new String[2];
		cajaNueva.palabras[0] = palabra1;
		cajaNueva.palabras[1] = palabra2;
		cajaNueva.siguiente = null;
		if (this.primero == null)
		{
			this.primero = cajaNueva;
			this.ultimo = cajaNueva;
		}
		else
		{
			this.ultimo.siguiente = cajaNueva;
			this.ultimo = cajaNueva;			
		}		
	}
	
	
	public void aumentaPosiciones(int posicion)
	{
		if (posicion>0)
		{
			vectorPosiciones[posicion-1]++;
			if(vectorPosiciones[posicion-1]>1)
			{
				vectorPosiciones[posicion-1]=0;
				aumentaPosiciones(--posicion);
			}
		}
	}
	
	public boolean verificaVector()
	{
		boolean respuesta = true;
		for(int i=0;i<this.vectorPosiciones.length;i++)
		{
			if(vectorPosiciones[i]==0)
			{
				respuesta = false;
				break;
			}
		}
		return respuesta;
	}

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		do
		{
			int cantidad = entrada.nextInt();
			Ajtapi lista = new Ajtapi();
			if (cantidad == 0)
				break;
			lista.vectorPosiciones = new int[cantidad];
			String primeraCadena="";
			for (int i = 0; i<cantidad; i++)
			{
				String palabra1 = entrada.next();
				String palabra2 = entrada.next();
				lista.adicionarEnLista(palabra1,palabra2);
				primeraCadena = primeraCadena+palabra1+palabra2;
			}			
			boolean bandera=true;
			String salida = "NO EXISTE";
			if(primeraCadena.contains("a")&&primeraCadena.contains("e")&&primeraCadena.contains("i")&&primeraCadena.contains("o")&&primeraCadena.contains("u"))			
				do
				{
					String cadena = lista.primero.palabras[lista.vectorPosiciones[0]];
		        	Nodo aux = lista.primero.siguiente;
		        	
		        	if (lista.verificaVector())
						bandera = false;
					
		        	int posicion = 1;
					while(aux!=null)
					{
						int subIndice = lista.vectorPosiciones[posicion];
						cadena = cadena+aux.palabras[subIndice];
						posicion++;
						aux = aux.siguiente;
					}
					lista.aumentaPosiciones(cantidad);
					
					if(cadena.contains("a")&&cadena.contains("e")&&cadena.contains("i")&&cadena.contains("o")&&cadena.contains("u"))
					{
						salida = "EXISTE";
						break;
					}				
				}while(bandera);
			System.out.println(salida);
		}while(true);		
	}
}
