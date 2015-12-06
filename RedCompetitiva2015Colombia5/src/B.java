import java.util.Scanner;


public class B {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int p = in.nextInt();
		int h = in.nextInt();
		int o = in.nextInt();

		boolean hunter = false;
		boolean props = false;
		if (h<=o)
		{
			if (o%h!=0)
			{
				hunter =true;
			}
		}
		if (h<=p)
		{
			if (p%h!=0)
			{
				hunter = true;
			}
		}
		if (hunter)
		{
			System.out.println("Hunters win!");	
		}
		else
		{
			System.out.println("Props win!");
		}

	}

}
