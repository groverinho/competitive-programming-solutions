
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class stavitel {

	public static void main(String[] args) throws IOException 
	{
		  Scanner entrada = new Scanner(System.in);
		  OutputWriter out = new OutputWriter(System.out);
			int casos = entrada.nextInt();
			for (int i = 0; i < casos; i++)
			{
				int k = entrada.nextInt();
				int [] frente = new int[k];
				int [] lado = new int[k];
				int contOrg=0;
				int [] comprobar = new int[100001];
				Arrays.fill(comprobar, 0);
				int max = 0;
				for (int j = 0; j <k; j++)
				{
					frente[j]=entrada.nextInt();
					max = Math.max(max, frente[j]);
					comprobar[frente[j]]++;
				}
				for (int j = 0; j < k; j++)
				{
					lado[j] = entrada.nextInt();
					max = Math.max(max, lado[j]);
					comprobar[lado[j]]++;
				}
				int cont = 0;
				for (int j = k-1; j>=0; j--) 
				{
					for (int j2 = 0; j2 < k; j2++) 
					{
						if(frente[j2]!=0 && lado[j]!=0)
						{
							if(frente[j2]>lado[j])
							{
								cont+= lado[j];
							}
							else if(lado[j]>frente[j2])
							{
								cont+= frente[j2];
							}
							else
							{
								cont+= frente[j2];
							}
						}
					}
				}
				for (int j = 1; j <=max; j++)
				{
					if(comprobar[j]>1)
					{
						double aux;
						if(comprobar[j]%2==0)
						{
							aux = comprobar[j]/2;
							contOrg += (aux*j);
						}
						else
						{
							comprobar[j]--;
							aux = comprobar[j]/2;
							contOrg += (aux*j)+j;
						}
						
				}
				else if(comprobar[j]==1)
				{
					contOrg +=j;
				}
				}
		
				 out.print("Minimalni budova obsahuje "+contOrg+" kostek, maximalni "+cont+" kostek.\n");
				  
			}  out.close();
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
	        if(line == null) return  null;
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
