	import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
	
	
	public class CountingOnes 
	{
		 public static long Counting(long X)
		    {
		        long curr = 2;
		        long answer = (X + 1) / 2;
		        while(true)
		        {
		            
		            long div = X / curr;
		            if(div == 0)break;
		            long count = (div) / 2;
		            answer+= count * curr;
		            if(div % 2 != 0)
		            {
		                long inf = div * curr;
		                answer+= (X - inf) + 1;
		            }
		            curr*=2;
		        }
		        return answer;
		    }
		   public static void main(String[] args) throws IOException{

		         BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		         StringTokenizer st;
		         String line = "";
		         StringBuilder out = new StringBuilder();
		         long A, B;
		         while((line = in.readLine()) != null && line.length() > 0)
		         {
		             st = new StringTokenizer(line);
		             A = Long.parseLong(st.nextToken());
		             B = Long.parseLong(st.nextToken());
		             out.append(Counting(B) - Counting(A - 1)).append("\n");
		         }
		         System.out.print(out);
		     }
		}