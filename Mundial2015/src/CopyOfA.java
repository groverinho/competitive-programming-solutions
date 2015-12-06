import java.io.IOException;
import java.util.ArrayList;
import java.io.*;
import java.util.StringTokenizer;


public class CopyOfA {
    public static double ecuacion(double p ,double a, double b, double c, double d , double n)
        {
                double precio = p * (Math.sin((a*n)+b)+ Math.cos((c*n)+d)+2); return precio;
        }
        public static void main(String[] args) throws IOException {
        	Scanner in = new Scanner(System.in);
            OutputWriter out = new OutputWriter(System.out);

                 while (in.reader.ready())
                 {
					
				                          
                double p, a , b , c ,d ,n;
                ArrayList<Double> lista ;
                double max;
 
                 p =in.nextDouble();
                 a =in.nextDouble();
                 b = in.nextDouble();
                 c =in.nextDouble();
                 d = in.nextDouble();
                 n = in.nextDouble();
                 lista = new ArrayList<Double>();
                for (double i = 1; i <= n; i++) 
                        lista.add(ecuacion(p, a, b, c, d, i));
                 max = 0;       
                 int j=0;
                for (int i = 0 ; i < lista.size(); i++)
                {
                
                                if (lista.get(j)>lista.get(i))
                                {
                                        if (lista.get(j)- lista.get(i)> max) 
                            max = lista.get(j)- lista.get(i);                   
                                }
                                else
                                        j=i;
                        
                                
                }
                String aa= max+"";
                if (aa.charAt(0)!='0') {
					
				
                for (int i = 0; i < aa.length(); i++)
                {
                	if (aa.charAt(i)=='.') 
                	{
                		aa = aa.substring(0,i+7);
                		break;
					}
				}
                }
                //System.out.printf("%.6f\n",max);
                out.print(aa + "\n");
               
                 }
               
               out.close();
               
              
               
}}
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
//	  public double hasNextDouble()
//	  {
//		  return hasNextDouble();
//	  }
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
