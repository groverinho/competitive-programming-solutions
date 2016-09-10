import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 03-09-16

public class laser {

	public static int solucion( int n )
	{
		int result = n;
		for( int i=2; i*i <=n ; i++ )
		{
			if( n%i == 0 ) 
				result -= result / i;
			while( n%i == 0 ) 
				n /= i;
		}
		if( n>1 ) 
			result -= result / n;
		return result;
	}

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		Scanner3 in = new Scanner3(System.in);
		OutputWriter2 out = new OutputWriter2(System.out);
		int casos = in.nextInt();
		while (casos-->0)
		{
			int n  = in.nextInt();
	
			    out.print(solucion(n) + "\n");
			    
		}
		out.close();
	}

}

class Scanner3{
  public BufferedReader reader;
  public StringTokenizer st;

  public Scanner3(InputStream stream){
    reader = new BufferedReader(new InputStreamReader(stream));
    st = null;
  }
  public String next(){
    while(st == null || !st.hasMoreTokens())
    {
      try
      {
        String line  = reader.readLine();
        if(line == null) return null;
        st =  new StringTokenizer(line);
      }
      catch (Exception e)
      {
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
class OutputWriter2{
  BufferedWriter writer;
  public OutputWriter2(OutputStream stream){
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
