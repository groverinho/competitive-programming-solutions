import java.util.Scanner;


public class coprimes {

	public static int greatestCommonFactor( int a, int b )
	{
	   if( 0 == b ) return a;

	   return greatestCommonFactor( b, a % b );
	}
	public static boolean sonCopri( int a, int b )
	{
	   int gcf = greatestCommonFactor( a, b );
	  if (gcf==1) {
		return true;
	}
	  else	
		  return false;
	   //return 1 == gcf;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int casos = in.nextInt();
		int c=1;
		while (casos-->0)
		{
			String cad = in.next();
			
			System.out.println("Ticket #"+c+":");
	          boolean bandera = false;
	          for( int i = 1; i < cad.length(); ++i )
	          {
	        

	             int izq = Integer.parseInt(cad.substring( 0, i ));
	             

	             int der=Integer.parseInt( cad.substring( i ) );


	             if( sonCopri( izq, der ) )
	             {
	            	 bandera = true;
	                System.out.println(izq+" "+der);

	                break;
	             }

	    
	          }
	      	c++;
	          if( bandera ) 
	        	  continue;
	          System.out.println("Not relative");
	     

	
		}
	}

}
