import java.util.Scanner;


public class flechas {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n, i,j,k;
		String linea;
		n= in.nextInt();
		for( k=0; k<n; k++ )
		{
			linea = in.next();
			int tam = linea.length(), max=-1;
			for ( i=0; i<tam; i++ )
			{
				if (linea.charAt(i) == '<')
				{
					for ( j = i + 1; j < tam && linea.charAt(j) == '-'; j++) ;
						max = Math.max(max, j-1);
					for ( j = i + 1; j < tam && linea.charAt(j) == '='; j++) ;
						max = Math.max(max,j-i);
				}
				else if (linea.charAt(i) == '>')
				{
					for ( j = i - 1; j >= 0 && linea.charAt(j) == '-'; j--) ;
						max = Math.max(max,i-j);
					for ( j = i - 1; j >= 0 && linea.charAt(j) == '='; j--) ;
						max = Math.max(max,i-j);
				}
			}
			System.out.println(max);
		}

	}
}
