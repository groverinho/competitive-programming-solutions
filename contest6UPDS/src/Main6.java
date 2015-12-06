
import java.util.Scanner;



public class Main6 {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while (true) {
			int n=in.nextInt();
			if (n==0) 
			{
				break;
			}
			int mat[][]=new int[n][3];
			int vec[]=new int[1010];
			for (int i = 0; i < n; i++) 
			{
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
