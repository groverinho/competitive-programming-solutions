import java.util.Scanner;


public class A {

	
	static int V[][];
	static int N;
	static int x0;
	static int y0;
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		while((N = entrada.nextInt()) > 0){
			V = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					V[i][j] = entrada.nextInt();
				}
			}
			
			x0 = 0;
			y0 = 0;
			int sumD = camino(1, 0);
			int sumA = camino(0, 1);
			
			if(sumD > sumA)
				System.out.println(sumD);
			else
				System.out.println(sumA);
		}
		
	}
	static int camino(int x, int y){
		if(x >= N || y >= N) // si se sale devuelve 0
			return 0;
		if(x == N && y == N) // llego al final
			return V[N][N];
		//if(x0 == x && y0 == y)
			//return V[x][y];
		int valorA = V[x0][y0];
		
		x0 = x;
		y0 = y;
		
		int sumD = valorA + camino(x+1, y);
		
		x0 = x;
		y0 = y;
		
		int sumA = valorA + camino(x, y+1);
		
		if(sumD > sumA){
			return sumD;
		}else{
			return sumA;
		}
		
	}
}
