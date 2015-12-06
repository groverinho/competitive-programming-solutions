package dia4;

import java.util.Scanner;
 class girlsandboys {


	public static void main(String[] args)
	{
	
		Scanner in = new Scanner(System.in);
		 int b =in.nextInt();
		 int g = in.nextInt();
	        while (b!=-1 && g!=-1) 
	        {
	 
	             if (g == 0 || b==0)
	            {
	            	System.out.println (b+g);
	            	//continue;
	            }
	            else
	            {
	            	b^=g;g^=b;b^=g;
	            	//System.out.println ((int)Math.ceil(((b + g) / (g + 1))));
	            	   System.out.println ((int)Math.ceil ((double)b / ((double)g + 1)));
	            }
	              
	            
	        
	        /*	if(g==0 || b==0)
	        	{
	        		System.out.println(b+g);
	        	}
	        	else
	        		System.out.println ((int)Math.ceil (((b + g) / (g + 1))));     	*/
	            b =in.nextInt();
	            g = in.nextInt();
	        }
	}

}
