import java.util.Scanner;


public class SmoothFactor {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
	    while(in.hasNextInt())
	    {
	    	int n = in.nextInt();
	    	int []vector = new int[n];
	    
	        for (int j = 0; j < vector.length; j++) {
				vector[j]= in.nextInt();
			}
	        int pre = 0,cnt = 1 , ans = 0 , c = 0 ;
	        for (int i = 1; i < vector.length; i++)
	        {
	            if( vector[i-1] <= vector[i] ) 
	            	cnt++;
	            else 
	            {
	                c++;
	                if(c == 2)
	                {
	                    c--;
	                    cnt = i - pre + 1;
	                    pre = i;
	                }
	                else
	                {
	                    cnt++;
	                    pre = i;
	                }
	            }
	            ans = Math.max(ans,cnt);
	        }
	        System.out.println(ans);

	}
	}
}
