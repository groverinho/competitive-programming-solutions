/*
5
0 1 1 4
BLBBB
BLLLL
BLBBB
BLLLL
BLLBB
*/
import java.util.*;
class BloqueosEnLaCuidad
{
	static final int MAX = 100;						//máximo número de filas y columnas del laberinto
	static char ady[][] = new char[ MAX ][ MAX ];	//laberinto
	static int x2=0; static int y2=0;
	static class Estado
	{
	    int x , y , d;								// Fila, columna y distancie del estado	    
	    public Estado( int x1, int y1 , int d1)
	    {
	        this.x = x1;
	        this.y = y1;
	        this.d = d1;
	    }
	};	
	public static int BFS( int x , int y , int h , int w ){ //coordenadas de inicial "I" y dimensiones de laberinto
		
		boolean visitado[][] = new boolean[ MAX ][ MAX ];	//arreglo de estados visitados
		Queue<Estado> Q = new LinkedList<Estado>();			//Cola de todos los posibles Estados por los que se pase para llegar al destino
		Q.add( new Estado( x , y , 0 ) );					//Insertamos el estado inicial en la Cola con distnacia 0.
		
		int dx[  ] = { 0 ,  0 , 1 , -1 };		//incremento en coordenada x
		int dy[  ] = { 1 , -1 , 0 ,  0 };		//incremento en coordenada y
		int nx , ny;
		ady[x2 ][ y2 ] = 'X';//nuevo valor para llegar al final
		while( !Q.isEmpty() )
		{							//Mientras cola no este vacia
			Estado actual = Q.remove();					//Obtengo de la cola el estado actual, en un comienzo será el inicial
			if( ady[ actual.x ][ actual.y ] == 'X' )//pregunta si llego al final
				return actual.d;						//Retornamos distancia recorrida hasta ese momento
			visitado[ actual.x ][ actual.y ] = true;	//Marco como visitado dicho estado para no volver a recorrerlo
			for( int i = 0 ; i < 4 ; ++i )
			{				//Recorremos hasta 4 porque tenemos 4 posibles adyacentes
				nx = dx[ i ] + actual.x;				//nx y ny tendran la coordenada adyacente
				ny = dy[ i ] + actual.y;				//ejemplo en i=0 y actual (3,4) -> 3+dx[0]=3+0=3, 4+dy[0]=4+1=5, nueva coordenada (3,5)
		        //aqui comprobamos que la coordenada adyacente no sobrepase las dimensiones del laberinto
		        //ademas comprobamos que no sea pared "#" y no este visitado
				if( nx >= 0 && nx < h && ny >= 0 && ny < w && !visitado[ nx ][ ny ] && ady[ nx ][ ny ] != 'B' )
					Q.add( new Estado( nx , ny , actual.d	 + 1 ) ); //agregamos estado adyacente aumento en 1 la distancia recorrida
			}
		}
		return 0;
	}	

	public static void main(String[] args) {
		
		int h , w;
		Scanner sc = new Scanner( System.in );
		int tamano = sc.nextInt();
		h = tamano;	w = tamano;
		int x1=sc.nextInt();	int y1=sc.nextInt();
			x2 = sc.nextInt();		y2 = sc.nextInt();
		String linea = sc.nextLine();	
		for (int i = 0; i < tamano-1; i++ )
		{
			linea = sc.nextLine();
			for( int j = 0 ; j < w ; ++j )
				ady[ i ][ j ] = linea.charAt( j );
		}
		if(ady[ x2 ][ y2 ] != 'L')
			System.out.println( "HAY RUTA POSIBLE" );
		else
		{
			int min = BFS( x1 , y1 , h , w );
			if( min == 0 ) 
				System.out.println("NO HAY RUTA POSIBLE");
			else 
				System.out.println( "HAY RUTA POSIBLE");
		}
		}}
