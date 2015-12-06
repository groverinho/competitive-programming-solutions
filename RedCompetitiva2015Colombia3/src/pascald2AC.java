import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class pascald2AC {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		OutputWriter out = new OutputWriter(System.out);
		 int m =in.nextInt();
		 int n =in.nextInt();
		    BigInteger big = BigInteger.valueOf(1000007);
				 BigInteger expo = BigInteger.valueOf(2);

		 while (m !=-1 && n !=-1) 
		 {
			 BigInteger aux = expo.pow(n+1).subtract(expo.pow(m)).add(big);
					 // (Math.pow(2, n+1)-Math.pow(2, m)+1000007));
			 BigInteger r = aux.mod(BigInteger.valueOf(1000007));
			 out.print(r + "\n");
			  m =in.nextInt();
			  n =in.nextInt();
		}out.close();
//		 BigInteger expo = BigInteger.valueOf(2);
//		 System.out.println("sum "+expo.pow(1000));
	}
	
}
class Scanner{
	  public BufferedReader reader;
	  public StringTokenizer st;

	  public Scanner(InputStream stream){
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
	}

class OutputWriter{
	  BufferedWriter writer;

	  public OutputWriter(OutputStream stream){
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
