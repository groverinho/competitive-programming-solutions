import java.io.*;
import java.util.StringTokenizer;
/**
Name: Grover Irusta Miranda
Date: 13-07-2017
Company: Coderoad - Mojix
 */

public class thief {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
	    OutputWriter out = new OutputWriter(System.out);

		int casos = in.nextInt();
		while (casos-- >0)
		{
			int llaves = in.nextInt();
			int casas = in.nextInt();
			long cont=0;
			//(nf-ni+1)*(nf+ni)/2 
			int nf = casas-1;
			int ni= casas - llaves;
			cont = (nf-ni+1)*(nf+ni)/2 ;
//			
//			for (int i = 0; i < llaves; i++) 
//			{
//				casas--;
//				cont = cont + casas;
//				
//			}
			out.print(cont + "\n");
		    

		}
		out.close();

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
