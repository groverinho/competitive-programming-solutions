import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		for (int i = 0; i < casos; i++)
		{
			int n = in.nextInt();
			int cont = 0;
			String cad = in.next();
			for (int j = 0; j < n+1; j++) 
			{
				if (cad.charAt(j)=='0')
				{
					cont++;
				}
			}
			System.out.println("Case #"+(i+1)+": "+cont);
		}

	}

}
/*
4
4
11111
1
09
5
110011
0 1

 */