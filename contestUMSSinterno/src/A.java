

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);  
	    int casos = in.nextInt(),k,n;; 
	    while(casos-->0)
	    {
	     n = in.nextInt();
	     k = in.nextInt();
	        
	        int resp = 0;	
	        for(long  potk = 1;potk <= n; potk *= k * k)
	        {
	            long m = n / potk;	
	           long aux = m-m/k;
	            resp += aux;
	        }
	        
	       System.out.println(resp);
	    }
	    

	}

}
