import java.util.Scanner;

public class PumaKatariING
{
	public static class Nodo
	{
		int dato;
		Arista arista0;
		Arista arista1;
		Arista arista2;
		Arista arista3;
		Arista arista4;
		Arista arista5;
		Arista arista6;
		Arista arista7;
		Arista arista8;
		Arista arista9;
		Nodo siguiente;
	}
	public static class Arista
	{
		Nodo puntero;
		int peso;
	}
	private Nodo primero;
	private Nodo ultimo;
	private int minimo = 10000000;
	private int rutas = 0; 
	
	public void adicionarNodo(int nombre)
	{
		Nodo nuevo = new Nodo();
		nuevo.dato = nombre;
		if(this.primero==null)
		{
			this.primero = nuevo;
			this.ultimo = nuevo;
		}
		else
		{
			this.ultimo.siguiente = nuevo;
			this.ultimo = this.ultimo.siguiente;
		}
	}
	
	/*public boolean verificarNodo(int nombre)
	{
		boolean respuesta = false;
		if(this.primero==null)
			System.out.println("El grafo esta vacio");
		else
		{
			Nodo aux = new Nodo();
			aux = this.primero;
			while(aux!=null)
			{
				if(aux.dato==nombre)
				{
					respuesta = true;
					break;
				}
				aux = aux.siguiente;
			}
		}
		return respuesta;
	}*/
	public Nodo obtenerNodo(int nombre)
	{
		Nodo busqueda=null;
		if(this.primero==null)
			System.out.println("El grafo esta vacio");
		else
		{
			Nodo aux = new Nodo();
			aux = this.primero;
			while(aux!=null)
			{
				if(aux.dato==nombre)
				{
					busqueda=aux;
					break;
				}
				aux = aux.siguiente;
			}
		}
		return busqueda;
	}
	public void definirArista(int origen,int destino,int peso)
	{
		Nodo inicio = this.obtenerNodo(origen);
		Nodo ubicacion = this.obtenerNodo(destino);
     	Arista nueva = new Arista();
		nueva.peso = peso;
		nueva.puntero = ubicacion;
		if(inicio.arista0==null)
			inicio.arista0 = nueva;
		else if(inicio.arista1==null)	
			inicio.arista1 = nueva;
		else if(inicio.arista2==null)	
			inicio.arista2 = nueva;
		else if(inicio.arista3==null)	
			inicio.arista3 = nueva;
		else if(inicio.arista4==null)	
			inicio.arista4 = nueva;
		else if(inicio.arista5==null)	
			inicio.arista5 = nueva;
		else if(inicio.arista6==null)	
			inicio.arista6 = nueva;
		else if(inicio.arista7==null)	
			inicio.arista7 = nueva;
		else if(inicio.arista8==null)	
			inicio.arista8 = nueva;
		else
			inicio.arista9 = nueva;
		
	}
	public void buscarCaminos(Nodo origen,int destino,String camino,int peso)
	{
		if(origen.dato==destino)
		{
			//System.out.println("Camino:"+camino+" con Peso:"+peso);
			if(this.minimo>peso)
			{
				this.minimo = peso;
				this.rutas = 1;
			}
			else if(this.minimo==peso)
				this.rutas++;
		}
		if(origen.arista0!=null)
		{
			String caminoA = camino+origen.arista0.puntero.dato;
			int pesoA = peso+origen.arista0.peso;
			this.buscarCaminos(origen.arista0.puntero,destino,caminoA,pesoA);
		}
		if(origen.arista1!=null)
		{
			String caminoA = camino+origen.arista1.puntero.dato;
			int pesoA = peso+origen.arista1.peso;
			this.buscarCaminos(origen.arista1.puntero,destino,caminoA,pesoA);
		}
		if(origen.arista2!=null)
		{
			String caminoA = camino+origen.arista2.puntero.dato;
			int pesoA = peso+origen.arista2.peso;
			this.buscarCaminos(origen.arista2.puntero,destino,caminoA,pesoA);
		}
		if(origen.arista3!=null)
		{
			String caminoA = camino+origen.arista3.puntero.dato;
			int pesoA = peso+origen.arista3.peso;
			this.buscarCaminos(origen.arista3.puntero,destino,caminoA,pesoA);
		}
		if(origen.arista4!=null)
		{
			String caminoA = camino+origen.arista4.puntero.dato;
			int pesoA = peso+origen.arista4.peso;
			this.buscarCaminos(origen.arista4.puntero,destino,caminoA,pesoA);
		}
		if(origen.arista5!=null)
		{
			String caminoA = camino+origen.arista5.puntero.dato;
			int pesoA = peso+origen.arista5.peso;
			this.buscarCaminos(origen.arista5.puntero,destino,caminoA,pesoA);
		}
		if(origen.arista6!=null)
		{
			String caminoA = camino+origen.arista6.puntero.dato;
			int pesoA = peso+origen.arista6.peso;
			this.buscarCaminos(origen.arista6.puntero,destino,caminoA,pesoA);
		}
		if(origen.arista7!=null)
		{
			String caminoA = camino+origen.arista7.puntero.dato;
			int pesoA = peso+origen.arista7.peso;
			this.buscarCaminos(origen.arista7.puntero,destino,caminoA,pesoA);
		}
		if(origen.arista8!=null)
		{
			String caminoA = camino+origen.arista8.puntero.dato;
			int pesoA = peso+origen.arista8.peso;
			this.buscarCaminos(origen.arista8.puntero,destino,caminoA,pesoA);
		}
		if(origen.arista9!=null)
		{
			String caminoA = camino+origen.arista9.puntero.dato;
			int pesoA = peso+origen.arista9.peso;
			this.buscarCaminos(origen.arista9.puntero,destino,caminoA,pesoA);
		}
	}
	public static void main(String[] args) 
	{
		Scanner lectura = new Scanner(System.in);
		int casos = lectura.nextInt();
		for(int i=0; i<casos ; i++)
		{
			PumaKatariING miGrafo = new PumaKatariING();
			int n = lectura.nextInt();
			int m = lectura.nextInt();
			int a = lectura.nextInt();
			int b = lectura.nextInt();
			for (int j=1; j<=n; j++)
				miGrafo.adicionarNodo(j);
			for (int j=1; j<=m; j++)
			{
				int desde = lectura.nextInt();
				int hasta = lectura.nextInt();
				int peso = lectura.nextInt();
				miGrafo.definirArista(desde,hasta,peso);
			}
			Nodo direccion = miGrafo.obtenerNodo(a);
			miGrafo.buscarCaminos(direccion,b,Integer.toString(a),0);
			System.out.println(miGrafo.rutas);
		}
		
	}
}