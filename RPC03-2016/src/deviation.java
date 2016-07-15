import java.util.Scanner;


public class deviation {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (true)
		{
			int n = in.nextInt();
			if (n==0) break;
			double x_ = 0;
			for (int i = 1; i <= n*2; i=i+2) 
			{
				x_+=i;
			}
			x_ = x_* 1/n;
			double aux = 0;
			for (int i = 1; i <= n*2; i=i+2) 
			{
				aux += Math.pow(i-x_, 2);
			}
			double s = Math.sqrt(aux /(n-1));
			System.out.printf("%.6f\n",s);
		}
	}

}
