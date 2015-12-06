import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class miMusicaFavorita {

	public static void main(String[] args)
	{
	
	Scanner in = new Scanner(System.in);
	while (in.hasNextInt()) 
	{
		
		   int d = in.nextInt();
		   int n = in.nextInt();
		   int []v = new int [n];
		        for(int i=0;i<n;i++)
		        {
		            v[i] = in.nextInt();
		        }
		        int S=-1;
		        ArrayList<Integer> R = new ArrayList<Integer>();
		        ArrayList<Integer> r = new ArrayList<Integer>();
		        for(int i=0; i<(1<<n); i++){
		            int s=0;
		            r.clear();
		            for(int j=0; j<n; j++)
		            {
		            	if(((1<<j)&i)==1)
		                {
		                    s+=v[j];
		                    r.add(v[j]);
		                }
		            }
		            if(s<=d && s>=S)
		            {
		                S=s;
		                if(R.size()<=r.size())
		                    R=r;
		            }
		        }
		        for(int i=0; i<R.size(); i++)
		        {
		        	System.out.print(R.get(i));
		            if(i!=R.size()-1) 
		            System.out.print(" ");
		        }
		       // System.out.println("\n");
		    }
	}

}
