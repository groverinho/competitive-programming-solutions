
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
public class ride {
	public static void main(String[] args)throws Throwable 
	{
		 try
		 {
			BufferedReader f = new BufferedReader(new FileReader("ride.in"));                                                  // input file name goes above
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
			String cometa = f.readLine();
			String grupo = f.readLine();
			int sumaCometa = 1;
			for(int i = 0; i < cometa.length(); i++)
			    sumaCometa*= (int)cometa.charAt(i) - 64;
			int sumaGrupo = 1;
			for(int i = 0; i < grupo.length(); i++)
			    sumaGrupo*= (int)grupo.charAt(i) - 64;
			boolean go = sumaGrupo%47 == sumaCometa%47;	
		    out.println((go)?"GO":"STAY");
		    out.close();
		    System.exit(0);
		 }
		 catch(Exception e)
	    {
		}
	}
}
