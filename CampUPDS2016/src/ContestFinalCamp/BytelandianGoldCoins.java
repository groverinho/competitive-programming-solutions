package ContestFinalCamp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class BytelandianGoldCoins {
	static HashMap<Integer, Long>dp;
	public static long f(int n)
	{
		if(n==0)
			return 0;
		if(dp.get(n)!=null)
			return dp.get(n);
		long res=Math.max(n,f(n/2)+f(n/3)+f(n/4));
		dp.put(n,res);
		return res;
	}
	public static void main(String[] args) throws IOException {
			dp=new HashMap<Integer, Long>();
			BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				String temporal=in.readLine();
				if(temporal==null||temporal.equals(""))
					break;
				int n=Integer.parseInt(temporal);
				System.out.println(f(n));
			}
		}
		
	

}
