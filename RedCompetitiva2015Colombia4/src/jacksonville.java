
import java.util.Scanner;


public class jacksonville {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int n = in.nextInt();
		while (k!=0 && n!=0)
		{
			int []vector = new int [k+1];	
			int c = 0;
			while (n>0)
			{
				int f = in.nextInt();
				for (int i = f; i <= k; i=i+f) 
				{
					if (vector[i]==0)
					{
						c++;
						vector[i]=1;
					}
				}			
				n--;
			}
			System.out.println(c);
			 k = in.nextInt();
			 n = in.nextInt();
		}

	}

}
