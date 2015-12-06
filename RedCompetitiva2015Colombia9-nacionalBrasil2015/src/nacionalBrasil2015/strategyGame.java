package nacionalBrasil2015;

import java.util.Scanner;

public class strategyGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			
		
		 int j,r,i,k,sa,sb,sc;
		    j = in.nextInt();
		    r = in.nextInt();
		    int v[]=new int[j];
		    for(i=0;i<j;i++)
		        v[i] = 0;
		    for(i=0;i<r;i++)
		    {
		        for(k=0;k<j;k++)
		        {
		          sa =in.nextInt();
		            v[k] += sa;
		        }
		    }
		    sb=0; sc=0;
		    for(i=0;i<j;i++)
		    {
		    	if(v[i]>=sb)
		        {
		            sb = v[i];
		            sc = i+1;
		        }
		    }
		        
	System.out.println(sc);
	}
}
}
