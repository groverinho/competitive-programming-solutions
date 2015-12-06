import java.util.Scanner;
/*
3
4
neso
6
neesoo
12
nonenesesoso
 * */

public class AreaRegion {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		int caso=1;
		while (casos>0)
		{
			int n = in.nextInt();
			String letras = in.next();
			int [][]vec = new int [n+1][2];
			vec[0][0]=0;
			vec[0][0]=0;
			for (int i = 0; i < n; i++) 
			{
				if (letras.charAt(i)=='n') {
					vec[i+1][0] = vec[i][0];
					vec[i+1][1] = vec[i][1]+1;
				}
				else
				{
					if (letras.charAt(i)=='s') {
						vec[i+1][0] = vec[i][0];
						vec[i+1][1] = vec[i][1]-1;
					}
					else
					{
						if (letras.charAt(i)=='e') {
							vec[i+1][0] = vec[i][0]+1;
							vec[i+1][1] = vec[i][1];
						}
						else
						{
							if (letras.charAt(i)=='o') {
								vec[i+1][0] = vec[i][0]-1;
								vec[i+1][1] = vec[i][1];
							}
						}
					}
				}
			}
			int result = 0;
			for (int i = 0; i < n-1; i++)
			{
				result = result + ((vec[i][0]*vec[i+1][1])-(vec[i+1][0]*vec[i][1]));
			}
			if(result<0)
				result = result/(-2);
			else
				result = result/2;
			System.out.println("Caso #"+caso+": "+result);
			casos--;
			caso++;
		}
	}

}
