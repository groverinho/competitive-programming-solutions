import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;


public class matrixcypher {

	public static BigInteger a ;
	public static BigInteger d ;
	public static BigInteger c ;
	public static BigInteger b ;
	public static void uno(){	    
	    b = b .subtract(a) ;	    
	    d = d .subtract(c) ;
	}
	public static void cero(){
	    a = a .subtract(b) ;	    
	    c = c .subtract(d) ;	    
	}
	public static void main(String[] args) throws IOException {
		leer in = new leer(System.in);
		sale out = new sale(System.out);
		 a =in.nextBigInteger();
		 b = in.nextBigInteger();
		 c = in.nextBigInteger();
		 d = in.nextBigInteger();
		 String res = "";
		 while(a.compareTo(BigInteger.ONE)!=0 || b.compareTo(BigInteger.ZERO)!=0  ||c.compareTo(BigInteger.ZERO)!=0 ||d.compareTo(BigInteger.ONE)!=0)
		 {
		    	if(a.compareTo(b)>=0 && c.compareTo(d)>=0)
		    	{
		            cero();
		            res = '0' + res;
		        }else{
		            uno();
		            res = '1' + res;
		        }
		    }
		    out.print(res+"\n");
		    out.close();
		    
	}
}
class leer{
	  public BufferedReader reader;
	  public StringTokenizer st;

	  public leer(InputStream stream){
	    reader = new BufferedReader(new InputStreamReader(stream));
	    st = null;
	  }

	  public String next(){
	    while(st == null || !st.hasMoreTokens()){
	      try{
	        String line  = reader.readLine();
	        if(line == null) return null;
	        st =  new StringTokenizer(line);
	      }catch (Exception e){
	        throw (new RuntimeException());
	      }
	    }
	    return st.nextToken();
	  }

	  public int nextInt(){
	    return Integer.parseInt(next());
	  }
	  public long nextLong(){
	    return Long.parseLong(next());
	  }
	  public double nextDouble(){
	    return Double.parseDouble(next());
	  }

	  public BigInteger nextBigInteger(){
		  BigInteger hola = new BigInteger(next());
		    return  hola;
		  }

	}

	class sale{
	  BufferedWriter writer;

	  public sale(OutputStream stream){
	    writer = new BufferedWriter(new OutputStreamWriter(stream));
	  }

	  public void print(int i) throws IOException {
	    writer.write(i);
	  }

	  public void print(String s) throws IOException {
	    writer.write(s);
	  }

	  public void print(char []c) throws IOException {
	    writer.write(c);
	  }
	  public  void close() throws IOException {
	    writer.close();
	  }

	}