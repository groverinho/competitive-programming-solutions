import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
Name: Grover Irusta 
University: puta
Date: 03-17
 */

public class Alphabet {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
	    leer in = new leer(System.in);
	    OutputWriter out = new OutputWriter(System.out);
		int[] vector = new int[27];
	        String cad = in.next() ;
		for (int j=0; j<cad.length(); j++)
		{
			int actual = cad.charAt(j) - 'a' + 1;
			int[] v2 = new int[27];
			for(int i = 0; i < vector.length; i++) 
				v2[i] = vector[i];
			
			for(int i = 0; i < actual; i++) {
				//System.out.println(next[i]);
				v2[actual] = Math.max(v2[actual], vector[i] + 1);
			}
			vector = v2;
		}
		int sub = 0;
		for (int i = 0; i < vector.length; i++) 
			sub = Math.max(sub, vector[i]);
		  out.print(26 - sub + "\n");
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
