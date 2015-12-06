import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class lode {

	public static void main(String[] args) throws Exception
	{
		Scanner in = new Scanner(System.in);
		
		int casos = in.nextInt();
		while (casos-->0)
		{
			int[] res = new int[32];
			
			int x = in.nextInt();
			int i = 0;
			res[0] = 0;
			while (x > 0) 
			{ 
				
				res[i++] = x%3; 
				x/=3; 
			}
			while (i > 1) 
				System.out.print(res[--i] + " ");
			System.out.println(res[0]);	
		
			
	}
}
}