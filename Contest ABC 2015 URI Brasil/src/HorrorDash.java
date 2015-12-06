import java.util.ArrayList;
import java.util.Scanner;


public class HorrorDash {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		int c=1;
		while (casos -- > 0) 
		{
			int n = in.nextInt();
			ArrayList<Integer> lista = new ArrayList<Integer>();
			for (int i = 0; i < n; i++)
			{
				lista.add(in.nextInt());
			}
			System.out.println("Case "+c+": "+lista.get(0));
			
			c++;
		}
	}

}
