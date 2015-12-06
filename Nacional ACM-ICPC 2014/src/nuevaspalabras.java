import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class nuevaspalabras {
	
	static class Nodo
	{
		String dato;
		Nodo puntero;
	}
	static class Nodo2
	{
		String dato2;
		Nodo2 puntero2;
	}
	Nodo primero = null;
	Nodo ultimo = null;
	Nodo2 primero2 = null;
	Nodo2 ultimo2 = null;
	static int contador =0;
	static int contador2 =0;
	public void adicionarNodo(String valor) 
	{
		Nodo cajaNueva = new Nodo();
		cajaNueva.dato= valor;
		cajaNueva.puntero =null;
		contador++;
		if (this.primero == null)
		{
			this.primero = cajaNueva;
			this.ultimo = cajaNueva;
		}
		else
		{
			this.ultimo.puntero = cajaNueva;
			this.ultimo = cajaNueva;
		}
	}
	public void adicionarNodo2(String valor2) 
	{
		Nodo2 cajaNueva2 = new Nodo2();
		cajaNueva2.dato2= valor2;
		cajaNueva2.puntero2 =null;
		contador2++;
		if (this.primero2 == null)
		{
			this.primero2 = cajaNueva2;
			this.ultimo2 = cajaNueva2;
		}
		else
		{
			this.ultimo2.puntero2 = cajaNueva2;
			this.ultimo2 = cajaNueva2;
		}
	}
	public String obtenerDato(int x)
	{	
			Nodo aux  = new Nodo();
			aux = this.primero;
			int c =0;
			while (aux != null) 
			{
				if (x==c)
				{
					return aux.dato;
				}
				aux = aux.puntero;
				c++;
			}
			return null;
	}
	public String obtenerDato2(int x2)
	{	
			Nodo2 aux  = new Nodo2();
			aux = this.primero2;
			int c =0;
			while (aux != null) 
			{
				if (x2==c)
				{
					return aux.dato2;
				}
				aux = aux.puntero2;
				c++;
			}
			return null;
	}

	public static void main(String[] args) throws IOException
	{
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			int palabraHermanita = Integer.parseInt(entrada.readLine());
			nuevaspalabras lista = new nuevaspalabras();
			nuevaspalabras lista2 = new nuevaspalabras();
			int a=0;
			while (a<palabraHermanita)
			{
				lista.adicionarNodo(entrada.readLine());
				a++;
			}
			int palabrasLibro = Integer.parseInt(entrada.readLine());
			
			int b=0;
			while (b<palabrasLibro)
			{
				lista2.adicionarNodo2(entrada.readLine());
				b++;
			}
			int c=0;
			while (c<palabrasLibro)
			{
				boolean bandera=false;
				int d=0;
HR:			while (d<contador)
				{
					String concat1 = lista.obtenerDato(d);
					if(concat1.equals(lista2.obtenerDato2(c)))
					{
						System.out.println("SI");
						bandera=true;
						break;
					}
					int e = 0;
					while(e<contador)
					{
						String aux = concat1.concat(lista.obtenerDato(d));
						
						if((lista.obtenerDato(e).concat(concat1)).equals(lista2.obtenerDato2(c))||aux.equals(lista2.obtenerDato2(c)))
						{
							System.out.println("SI");
							lista.adicionarNodo(lista2.obtenerDato2(c));
							bandera=true;
							break HR;
						}  
						e++;
					}
					d++;
				}
				if(bandera==false)
					System.out.println("NO");
				c++;
			}
	}

}
