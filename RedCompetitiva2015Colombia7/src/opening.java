import java.util.Arrays;
import java.util.Scanner;

public class opening {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		    int[] ancho = new int[n];
		    for (int x = 0; x < n; x++) 
		      ancho[x] = in.nextInt();
		    
		    Arrays.sort(ancho);
		    int min = n;
		    for (int x = n; x >= 0; x--)
		    {
		      int carga = n - x;
		      if (x > 0)
		        carga += ancho[x - 1];
		      if (carga < min) 
		      {
		        min = carga;
		      }
		    }
		    System.out.println(min);
	}

}
