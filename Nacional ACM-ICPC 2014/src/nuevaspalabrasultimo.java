import java.util.Scanner;
import java.util.TreeSet;


public class nuevaspalabrasultimo {
	public static String s;
	int n,m;
	public static TreeSet<String>st = new TreeSet<String>();
	public static String solve()
	{
	    int lim=0;
	    while(true)
	    {
	        lim++;
	        if(lim==s.length())
	        	break;
	        String a="";
	        for(int i=0;i<lim;i++)
	        {
	            if(lim==s.length())
	            	break;
	                a+=s.charAt(i);
	        }
	        String b="";
	        if(lim==s.length())
	        	break;
	        for(int i=lim;i<s.length();i++)
	            b+=s.charAt(i);
	        if(a.length()>0&&b.length()>0&&st.contains(a)&&st.contains(b))
	        {
	        	String aux=a+b;
	                st.add(aux);
	                return "SI";
	        }
	    }
	    return "NO";
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        st.clear();
        for(int i=0;i<n;i++)
        {
            s = in.next();
            st.add(s);
        }
        int m = in.nextInt();
        for(int i=0;i<m;i++)
        {
            s =in.next();
            System.out.println(solve());
        }}
	}
