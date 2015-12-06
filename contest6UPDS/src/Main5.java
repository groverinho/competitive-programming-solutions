
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;
/*
5
ma
pa
ge
la
tina
6
mapa
mama
gato
gelatina
latina
gelatina
 */

public class Main5 {
	public static String palabra;
	int n,m;
	public static TreeSet<String> set = new TreeSet<String>();
	public static String metodo()
	{
	    int lim=0;
	    while(true)
	    {
	    	 lim++;
	        if(lim==palabra.length())
	        	break;
	        String a="";
	        for(int i=0;i<lim;i++)
	        {
	            if(lim==palabra.length())
	            	break;
	                a+=palabra.charAt(i);
	        }
	        String b="";
	        if(lim==palabra.length())
	        	break;
	        for(int i=lim;i<palabra.length();i++)
	            b+=palabra.charAt(i);
	        if(a.length()>0&&b.length()>0&&set.contains(a)&&set.contains(b))
	        {
	        	String aux=a+b;
	                set.add(aux);
	                return "SI";
	        }
	       
	    }
	    return "NO";
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        set.clear();
        for(int i=0;i<n;i++)
        {
        	palabra = in.next();
            set.add(palabra);
        }
        int m = in.nextInt();
        for(int i=0;i<m;i++)
        {
        	palabra =in.next();
            System.out.println(metodo());
        }
        }
	}
