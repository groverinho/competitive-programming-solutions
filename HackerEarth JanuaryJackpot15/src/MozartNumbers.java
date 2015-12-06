import java.util.Scanner;


public class MozartNumbers {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos>0) 
		{
			int a = in.nextInt(), b = in.nextInt();
			//assert(a<=b);
			int resp = 0;
			/*Cases:
			 * 1. Between 0 and 6 = 0.
			 * 2. Between 8 and 12 = 0.
			 * 3. Greater than 13 = 0.
			 * 4. Between 0 and 12 = 8.
			 * 5. Between 8 and above = 144.
			 * 6. Between 0 and more than 12 = 152.
			*/
			if (b<7) //1 2 3 4 5 6 as b.
				resp = 0;
			if (a>7 && b<13) //8 9 10 11 12 as values of b.
				resp = 0;
			if (a>0 && a<=7 && b<13 && b>6) //({ 0,7) (0, 8) (0, 9) (0, 10) (0, 11) (0, 12) ... till (7, 12) }
				resp = 8;
			if (a>7 && b>=13) // { (8, 13)
				resp = 144;
			if (a<=7 && b>=13)
				resp = 152;
			if (a>13) 
				resp = 0;
				System.out.println(resp);
			casos--;
		}
	}

}
