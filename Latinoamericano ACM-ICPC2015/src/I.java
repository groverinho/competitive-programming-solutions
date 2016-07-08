import java.util.Scanner;



public class I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c = 0;
		for (int i = 0; i < 5; i++) 
		{
			int aux = in.nextInt();
			if (aux==n) 
			{
				c++;
			}
			
		}
		System.out.println(c);

	}

}
