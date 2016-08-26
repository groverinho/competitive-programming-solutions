import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import java.util.StringTokenizer;
import java.util.TreeSet;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 25-08-16

public class physicalmusic {

	public static void main(String[] args) throws IOException {
		  Scanner2 in = new Scanner2(System.in);
		    
		    OutputWriter out = new OutputWriter(System.out);
		  
		int casos = in.nextInt();
		while (casos  -->0)
		{
			int n  = in.nextInt();
			int []v = new int [n];
			for (int i = 0; i < v.length; i++) {
				v[i] = in.nextInt();
			}
			TreeSet<Integer> lista = new TreeSet<Integer>();
			for (int i = 0; i < v.length; i++) {
				for (int j = i+1; j < v.length; j++) {
					if (v[i]>v[j])
					{
						lista.add(v[i]);
					}
				}
			}
			
			 out.print(lista.size() + "\n");
			for (Integer integer : lista) {
				 out.print(integer + "\n");
			}
			 
			   
		}
		 out.close();
	}

}
class Scanner2{
	  public BufferedReader reader;
	  public StringTokenizer st;

	  public Scanner2(InputStream stream){
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
