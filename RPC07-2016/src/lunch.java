import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

 

public class lunch {


	public static int bsearch(int[] values, int search) {
        int left = 0, right = values.length;
        while (left+1 < right) 
        {
            int mid = (left+right)>>1;
            if (search > values[mid]) 
            	left = mid; 
            else 
            	right = mid;
        }
        if (search > values[left])
        	++left;
        return left;
    }
    public static void main(String[] args) throws Exception {

    	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    	while (true)
    	{
    	     int[] cantidad = new int[4];
    	     int[][] precios = new int[4][];
    	     int[] comb2;
    	     String cad = sc.readLine();
    	     String[]vector = cad.split(" ");
	        int presupuesto = Integer.parseInt( vector[0]);
	        if (presupuesto==0)
	        {
	        	break;
			}
	        for (int i = 0; i < 4; ++i)
	        {
	        	cantidad[i]=Integer.parseInt( vector[i+1]);
	        	precios[i] = new int[cantidad[i]];
	        }
	        
	        for (int i = 0; i < 4; ++i) 
	        {
	        	String aux = sc.readLine();
	        	 String[]vector2 = aux.split(" ");
	        	for (int j = 0; j < vector2.length; ++j)
	        		precios[i][j] = Integer.parseInt( vector2[j]);
	        }
	        if (sc.readLine()==null) {
				
			}
	        	
	       
	        comb2 = new int[cantidad[0] * cantidad[1]];
	        for (int i = 0, k = 0; i < cantidad[0]; ++i) 
	        	for (int j = 0; j < cantidad[1]; ++j)
	            comb2[k++] = precios[0][i] + precios[1][j];
	        Arrays.sort(comb2);
	        long sum = 0;
	        for (int i = 0; i < cantidad[2]; ++i) 
	        	for (int j = 0; j < cantidad[3]; ++j)
	            sum += bsearch(comb2,presupuesto - precios[2][i] - precios[3][j] + 1);
	      	System.out.println(sum);
    }
  
    }

   
}
