import java.io.BufferedReader;
import java.io.InputStreamReader;


public class rummikub {

	private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	private static final int max_colores = 4;
	private static final int max_valores= 101;
	
	public static void main(String[] args) throws Exception
	{
		int casos = Integer.parseInt(entrada.readLine());	
		while (casos-->0) 
			System.out.println( algoritmo() );
	}
	
	private static String algoritmo() throws Exception 
	{
		boolean[][] matriz = new boolean[max_colores][max_valores];
		
		int M = Integer.parseInt(entrada.readLine());
		String[] vector = entrada.readLine().split(" ");
		
		for (int i = 0; i < M; ++i) {
			int color = metodo(vector[i].charAt(vector[i].length() - 1));
			int numero = Integer.parseInt( vector[i].substring(0, vector[i].length() - 1) );
			
			matriz[color][numero] = true;
		}
		
		for (int i = 0; i < max_valores; i++) 
		{
			int cnt = 0;
			for (int j = 0; j < max_colores; j++) 
			{
				if (matriz[j][i]) {
					cnt++;
				} 
				if (cnt >= 3) return "YES";
			}
		}
		
		for (int i = 0; i < max_colores; i++) {
			int cnt = 0;
			for (int j = 0; j < max_valores; j++) {
				if (matriz[i][j]) {
					cnt++;
				} else {
					cnt = 0;
				}
				
				if (cnt >= 3) {
					return "YES";
				}
			}
		}
		
		return "NO";
	}
	
	private static int metodo(char color) {
		if (color == 'b') 
			return 0; 
		if (color == 'g')
			return 1; 
		if (color == 'r') 
			
			return 2; 
		return 3;
	}
}