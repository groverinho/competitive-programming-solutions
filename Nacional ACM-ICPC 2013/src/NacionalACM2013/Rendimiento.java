package NacionalACM2013;
import java.util.Scanner;
public class Rendimiento {
	//public static String cadena = "";
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
	    int n, mesIni, mesFin, suma, mayor, currMI, currMF, v;
	     n = entrada.nextInt();
	    while (n > 0) {
	        
	        currMF = 0;
	        currMI = 0;
	        mesIni = 0;
	        mesFin = 0;
	        suma = 0;
	        mayor = -100;
	        boolean sirve = false;
	        
	        for (int i = 0; i < n; i++) {
	            v = entrada.nextInt();
	            suma += v;
	            
	            if(v > 0)sirve = true;
	            
	            if (suma > 0) {
	                currMF = i;
	            }else{
	                suma = 0;
	                currMF = i+1;
	                currMI = i+1;
	            }
	            if (suma == mayor) {
	                if (mesFin < currMF) {
	                    mesFin = currMF;
	                    mesIni = currMI;
	                }else if(mesFin == currMF){
	                    if (mesFin - mesIni > currMF - currMI) {
	                        mesFin = currMF;
	                        mesIni = currMI;
	                    }
	                }
	            }
	            if (suma > mayor) {
	                mayor = suma;
	                mesIni = currMI;
	                mesFin = currMF;
	            }
	        }
	        
	        if (!sirve) {
	           System.out.print("0 -1 -1\n");
	        }else
	        	System.out.print( mayor+ " " + mesIni + " " + mesFin + "\n"); 
	        n = entrada.nextInt();
	    }
	}
}
