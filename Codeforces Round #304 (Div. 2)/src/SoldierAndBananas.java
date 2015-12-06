import java.util.Scanner;


public class SoldierAndBananas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int n= in.nextInt();
		int w = in.nextInt();
		int monto = 0;
		int k2 = k;
		for (int i = 0; i < w; i++)
		{
			monto= monto+ k2;
			k2 = k2+k;
		}
//		System.out.println("monto "+monto);
		if (monto<=n)
		{
			System.out.println(0);
		}
		else
		System.out.println(monto-n);
		
	}

}
