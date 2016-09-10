import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 03-09-16

public class homework {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    int v [] =new int [50050000];
	    int b=1;
	    v[1]=0;
	    for(int i=1; i<10000; i++)	
	    {
	        b+=(i+1);
	        v[b]=i;
	    }
	    int casos = Integer.parseInt(in.readLine());
	    while(casos-->0)
	    {
	        int p =Integer.parseInt( in.readLine());
	        if(v[p]!=0)
	        	System.out.println(v[p]);
	        else 
	        	System.out.println("No solution");
	    }
	}
}
