import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class PalindromeExtendido {
	public static String s;
	public static String solve(){
	    int j=s.length()-1;
	    int u=-1;
	    boolean sw=true;

	    for(int i=0;i<s.length();i++)
	    {
	        if(!(i<=j))break;
	        if(s.charAt(i)==s.charAt(j))
	        {
	            j--;
	            if(sw)
	                u=i;sw=false;
	        }
	        else
	            j=s.length()-1;sw=true;
	    }
	    String aux = s.substring(0,0+u);
	    StringBuilder aux2 = new StringBuilder(aux);
	    aux2.reverse();
	  
	    return s+aux2;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
		s = in.next();
	
			System.out.println(solve());
			s="";
		}}}
