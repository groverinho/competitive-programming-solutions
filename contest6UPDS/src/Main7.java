
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;



public class Main7 {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while (true) {
			int n=in.nextInt();
			if (n==0) 
			{
				break;
			}
			int mat[][]=new int[n][3];
			BigInteger vec[]=new BigInteger[1000000000];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 3; j++)
				{
					mat[i][j]=in.nextInt();
				}
				for (int x = mat[i][0]; x <= mat[i][1]; x++) 
				{
					if(mat[i][2]>vec[x])
						vec[x]=mat[i][2];
				}
				
			}
			
			for (int x = 0; x < n; x++)
			{
				int cont=0;
				for (int y = mat[x][0]; y <= mat[x][1]; y++) {
					if(vec[y]==mat[x][2]){
						cont++;
					}
				}
				System.out.println(cont);
			}

		}
	}

}
/*
import java.util.Arrays;
import java.util.Scanner;

class shaskpeare{

	public static void main(String[] args) 
	{

		Scanner entrada = new Scanner(System.in);
		while(entrada.hasNextInt())
		{
			int n = entrada.nextInt();
			int [] vector = new int[1010];
			int [] cont = new int[1010];
			int aux =1; 
			for (int i = 0; i < n; i++) 
			{
				int x1 = entrada.nextInt();
				int x2 = entrada.nextInt();
				int y = entrada.nextInt();
				for (int j = x1; j <= x2; j++) 
				{
					if(y>vector[j])
					{
						vector[j]=y;
						cont[j]=aux;
						/*if(i>0)
						cont[i-1]--;
					}
	
				}
				aux++;
			}
			Arrays.sort(cont);
			for (int i = 1; i < aux; i++) 
			{
				int aux2 = 0;
				for (int j = 0; j < cont.length; j++) 
				{
					if(cont[j]==i)
						aux2++;
				}
				System.out.println(aux2);
			}
		}
	}
}
 */
