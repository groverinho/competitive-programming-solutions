import java.util.Scanner;


public class LalitAndKundu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos>0) 
		{
			int a = in.nextInt(), b = in.nextInt();
			double ans = 0.0;
			int c, d;
			c = a-b;
			d = a+b;
			ans = (c*1.0) / (d*1.0);
			System.out.printf("%.12f\n",ans);
			casos--;
		}
	}

}
