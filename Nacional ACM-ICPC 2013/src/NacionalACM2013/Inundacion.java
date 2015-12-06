package NacionalACM2013;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Inundacion
{

	static int padre[]; 

	static void MakeSet( int n )
	{
	    for( int i = 1 ; i <= n ; ++i ) 
	    	padre[ i ] = i;
	}

	static double [][] coordenadas;
	static boolean [][] puentesAdyacentes;
	static int contador=1;


	static int Find( int x )
	{
	    return ( x == padre[ x ] ) ? x : ( padre[ x ] = Find( padre[ x ] ) );
	}

	static void Union( int x , int y )
	{
	    padre[ Find( x ) ] = Find( y );
	}


	static boolean sameComponent( int x , int y )
	{
	    if( Find( x ) == Find( y ) ) return true;
	    return false;
	}


	static int V , E;    
	
	static class Edge implements Comparator<Edge>
	{
	    int origen;    
	    int destino;   
	    double peso;    
	    Edge(){}
	   
		@Override
		public int compare(Edge e1 , Edge e2 ) 
		{
			
			return (int) (e1.peso - e2.peso);  
		}
	};
	
	static Edge arista[];   
	static Edge MST[];    

	static void KruskalMST()
	{
	    int origen , destino;
	    double peso;
	    int maximo = 0;
	    double total = 0;        
	    int numAristas = 0;   
	    
	    MakeSet( V );         
	    Arrays.sort( arista , 0 , E , new Edge() ); 

	    for( int i = 0 ; i < E ; ++i )
	    {    
	        origen = arista[ i ].origen;   
	        destino = arista[ i ].destino; 
	        peso = arista[ i ].peso;      
      
	        if( !sameComponent( origen , destino ) )
	        { 
	            total += peso;           
	            MST[ numAristas++ ] = arista[ i ];
	            Union( origen , destino ); 
	        }
	    }
	    for( int i = numAristas-1 ; i >= 0 ; --i )
	    {
	    	if(!puentesAdyacentes[MST[i].origen][MST[i].destino])
	    	{
	    		maximo =(int) MST[ i ].peso;
	    		break;
	    	}
	    }
        System.out.printf("Caso %d: %d\n",contador,maximo);
	}

	public static double calculaDistancia(int i, int j)
	{
		double valorX = Math.pow(coordenadas[i][0]-coordenadas[j][0],2);
		double valorY = Math.pow(coordenadas[i][1]-coordenadas[j][1],2);
		return(Math.sqrt(valorX+valorY));
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner( System.in );	   
	
		int NC = sc.nextInt();
		do
		{
			V = sc.nextInt();
		
			E = V*(V-1)/2;
			padre = new int[E+1];
			arista = new Edge[E+1];
			MST = new Edge[E+1];
		
			coordenadas = new double[V][2];
			puentesAdyacentes = new boolean[V][V];
			 for( int i = 0 ; i < V ; ++i )
			 {
				 String a = sc.next();
				 String b = sc.next();
				 coordenadas[i][0]=Double.parseDouble(a);
				 coordenadas[i][1]=Double.parseDouble(b);
			 }
			
			int M = sc.nextInt();
			for(int h=0 ; h<M ; ++h)
			{
			  	int origen = sc.nextInt();
			   	int destino = sc.nextInt();
			   	puentesAdyacentes[origen-1][destino-1]=true;
			   	puentesAdyacentes[destino-1][origen-1]=true;
			} 
			
			int indice = 0;
		    for( int i = 0 ; i < V ; ++i )
		    	for( int j = i+1 ; j < V ; ++j )
			    {
			        arista[ indice ] = new Edge();
			    	arista[ indice ].origen = i;
			        arista[ indice ].destino = j;
			        if(puentesAdyacentes[i][j])
			        	arista[ indice ].peso = 0;
			        else
			        	arista[ indice ].peso = calculaDistancia(i, j);
			       
			        indice++;
			    }
		  
		    KruskalMST();
		   
		    contador++;
		   
		    NC--;
		}while (NC>0);    
	}
}
