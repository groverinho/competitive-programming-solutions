import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class borders {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while (!in.ready()) 
		{
			String cadena = in.readLine();
		    String[]vector = in.readLine().split(" ");
		    int a = Integer.parseInt(vector[0]);
		    int b = Integer.parseInt(vector[1]);
		    int []siguente  =  new int [cadena.length()];
		    int []tamCadena  = new int [cadena.length()];
		    siguente[0] = 0;
		    for (int i = 1; i < cadena.length(); i++)
		    {
		      if (cadena.charAt(i - 1) == ' ') 
		    	  siguente[i] = i;
		      else if (cadena.charAt(i) == ' ') 
		      {
		        siguente[i] = i + 1;
		        tamCadena[siguente[i - 1]] = i - siguente[i - 1];
		      }
		      else 
		    	  siguente[i] = siguente[i - 1];
		    }

		    tamCadena[siguente[cadena.length()-1]] = cadena.length()-siguente[cadena.length()-1];
		    
//			    for (int i = 0; i < cadena.length(); ++i) {
//			      System.out.println(i + " " + cadena.charAt(i)+ ": " + tamCadena[i] + " , " +siguente[i]);
//			    }

		    for (int i = a; i <= b; ++i)
		    {
		      int total = 0;
		      int j = 0;
		      while (j < cadena.length())
		      {
		        total += tamCadena[j] + 1;
		        if (j + i >= cadena.length()) 
		        	break;
		        j = siguente[j + i];
		      }
		      System.out.println(total-1);
		    }
		}    
	}

}
