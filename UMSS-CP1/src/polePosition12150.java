import java.util.Arrays;
import java.util.Scanner;

public class polePosition12150 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		 while(n!=0)
		 {
	            int a,b;
	            //n vectors of -1
	          int res [ ] = new int [n];
	          Arrays.fill(res,-10);
	            boolean entro=false;
	            for(int i=0;i<n;i++)
	            {
	                 a = in.nextInt();
	                 b = in.nextInt();
	                if(!entro)
	                {
		                if ( (i+b<0 || i+b>=n) )
		                {
		                    entro=true;
		                   System.out.println("-1");
		                }
		                else if(res[i+b]>0)
		                {
		                    entro=true;
		                    System.out.println("-1");
		                }
		                else
		                	res[i+b]=a;    
	                }
	            }
	            if(!entro)
	            {
	            	System.out.print(res[0]);
	                for(int i=1;i<n;i++)
	                    System.out.print(" "+res[i]);
	               System.out.println();
	            }
	            n = in.nextInt();
	        }
	}
}
