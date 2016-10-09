import java.util.Scanner;


public class digitdiv {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		long mod=(long) (Math.pow(10, 9)+7);
		while (in.hasNext())
		{
		 
		    int n = in.nextInt();
		    int m = in.nextInt();
		    String numero = in.next();
		    long resultado=0;
	        long aux=0;
	        for (int i=0; i<n; i++)
	        {
	        	int digito = numero.charAt(i)-'0';
	            aux=(aux*10+digito)%m;
	            if (aux==0)
	            {
	                if(resultado==0)
	                    resultado=1;
	                else
	                    resultado=(resultado*2)%mod;
	            }
	        
	        }
	        if (aux>0)
	            resultado=0;
	        System.out.println(resultado);
	    }
			
		}
		

	

}
