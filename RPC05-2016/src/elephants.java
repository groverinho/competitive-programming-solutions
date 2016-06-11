
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class elephants {
  public static void main(String [] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    OutputWriter out = new OutputWriter(System.out);
	int n = sc.nextInt();
	while (n-->0) {
		int set = sc.nextInt();
		int peso = sc.nextInt();
		int vect []= new int [set];
		for (int i = 0; i < set; i++)
		{
			vect[i]=sc.nextInt();
		}
		Arrays.sort(vect);
		int max =0;
		int pesos = 0;
		for (int i = 0; i < vect.length; i++)
		{
			pesos += vect[i];
			if (pesos<peso)
			{
				max++;
			}
			if (pesos>peso)
			{
				break;
			}
		}
		out.print(max + "\n");
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
        if(line == null) return (String) null;
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


