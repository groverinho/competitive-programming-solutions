package pregunta2;

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
*/
public class AnalizadorSintactico {

	private static class Nodo
	{
		String nombre;
		Nodo siguiente;
		Nodo ar1;
		Nodo ar2;
		Nodo ar3;
	}
	
	/*private static class Arista
	{
		int peso;
		Nodo puntero;
	}*/
	
	public Nodo primero = null;
	public Nodo ultimo = null;
	
	public void ingresarNodoGrafo (String instruccion)
	{
		Nodo temp = new Nodo();
		temp.nombre = instruccion;
		temp.siguiente = null;
		temp.ar1 = null;
		temp.ar2 = null;
		temp.ar3 = null;
		
		if (primero==null)
		{
			primero = temp;
			ultimo = primero;
		}
		else
		{
			ultimo.siguiente = temp;
			ultimo = ultimo.siguiente;
		}
	}
	
	public void listaNodosGrafo()
	{
		if (primero == null)
		{
			System.out.println("La lista está vacia");
		}
		else
		{
			Nodo aux = primero;
			while (aux!=null)
			{
				System.out.println("Nodo: "+aux.nombre);
				aux = aux.siguiente;
			}			
		}
	}
	
	public Nodo encontrarNodo(String nombreNodo)
	{
		Nodo resp=null;
		if (primero == null)
			System.out.println("El grafo no se ha ingresado");
		else
		{
			Nodo aux = primero;
			while (aux!=null)
			{
				if (aux.nombre.equals(nombreNodo))
					return aux;
				aux = aux.siguiente;
			}
		}	
		return resp;
	}
	
	public void mostrarReferenciasNodo(Nodo n)
	{
		if (n.ar1!=null)
			System.out.println("Arista 1 apunta a:"+n.ar1.nombre);
		else
			System.out.println("Arista 1 apunta a nulo");
		if (n.ar2!=null)
			System.out.println("Arista 2 apunta a:"+n.ar2.nombre);
		else
			System.out.println("Arista 2 apunta a nulo");
		if (n.ar3!=null)
			System.out.println("Arista 3 apunta a:"+n.ar3.nombre);
		else
			System.out.println("Arista 3 apunta a nulo");
	}
	
	public void ingresarConexion(String nombreOri,String nombreDes)
	{
		Nodo nodoOri = this.encontrarNodo(nombreOri);
	    Nodo nodoDes = this.encontrarNodo(nombreDes);		
		if (nodoOri.ar1 == null)
			nodoOri.ar1 = nodoDes;
		else 
			if (nodoOri.ar2 == null)
				nodoOri.ar2 = nodoDes;
			else
				if (nodoOri.ar3 == null)
					nodoOri.ar3 = nodoDes;
				else
					System.out.println("No hay conexiones disponibles");					
	}
	
	public void mostrarGrafo()
	{
		if (primero == null)
		{
			System.out.println("El grafo esta vacio");
		}
		else
		{
			Nodo aux = primero;
			while (aux!=null)
			{
				System.out.println("Nodo:"+aux.nombre);
				mostrarReferenciasNodo(aux);
				aux = aux.siguiente; 
			}
		}
	}

	public boolean verificarConexion(String origenN, String destino)
	{
		Nodo origen = this.encontrarNodo(origenN);
		if (origen.ar1!=null)
		{
			if (origen.ar1.nombre.equals(destino))
				return true;			
		}
		if (origen.ar2!=null)
		{
			if (origen.ar2.nombre.equals(destino))
				return true;
		}
		if (origen.ar3!=null)
		{
			if (origen.ar3.nombre.equals(destino))
				return true;
		}
		return false;
	}
	public void cargarAutomataOpAr ()
	{
		ingresarNodoGrafo("VARIABLE");
        ingresarNodoGrafo("OPERADOR ASIGNACION");
        ingresarNodoGrafo("ARGUMENTO NUMERICO");
        ingresarNodoGrafo("ARGUMENTO CADENA");
        ingresarNodoGrafo("OPERADOR ARITMETICO");
        ingresarNodoGrafo(";");
        
        ingresarConexion("VARIABLE","OPERADOR ASIGNACION");
        ingresarConexion("VARIABLE","OPERADOR ARITMETICO");
        ingresarConexion("OPERADOR ARITMETICO","OPERADOR ARITMETICO");
        ingresarConexion("OPERADOR ARITMETICO","ARGUMENTO NUMERICO");
        ingresarConexion("ARGUMENTO NUMERICO","OPERADOR ARITMETICO");
        ingresarConexion("OPERADOR ARITMETICO",";");
        ingresarConexion("ARGUMENTO NUMERICO",";");
        ingresarConexion("OPERADOR ASIGNACION","ARGUMENTO NUMERICO");
        ingresarConexion("OPERADOR ASIGNACION","ARGUMENTO CADENA");
        ingresarConexion("ARGUMENTO CADENA",";");
        
        
        
        
        /*ingresarConexion("ARGUMENTO CADENA","OPERADOR ARITMETICO");
        ingresarConexion("OPERADOR ARITMETICO","ARGUMENTO CADENA");*/
        
        
	}
	public void analizarSintaxis(String[] resultado)
	{
		boolean error = false;		
		for(int i=0;i<resultado.length-1; i++)
		{
			if (i==0)
			{
				if(resultado[i].equals(this.primero.nombre))
					System.out.println("Inicio de sentencia validada");
				else
				{
					System.out.println("ERROR SINTACTICO, NO PUEDE EMPEZAR ASI UNA INSTRUCCION");
					error = true;
					break;
				}
			}	
			if(resultado[i+1]==null)
			{
				break;
			}
			if (!(this.verificarConexion(resultado[i], resultado[i+1])))
			{
					System.out.println("ERROR SINTACTICO, NO HAY CONEXION ENTRE "+
							resultado[i]+" Y "+resultado[i+1]);
					error = true;
					break;
			}
		}
		if (!error)
		{
			System.out.println("LA SINTAXIS DEL CODIGO ES CORRECTA");
		}
	}

	
}


