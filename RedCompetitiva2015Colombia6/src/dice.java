import java.util.Scanner;


public class dice {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		while(in.hasNext())
		{
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int a3 = in.nextInt();
		int a4 = in.nextInt();
		
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		int b3 = in.nextInt();
		int b4 = in.nextInt();
		
		int a = a1+a2+a3+a4;
		int b = b1+b2+b3+b4;
		
		if (a==b)
		{
			System.out.println("Tie");
		}
		else if(a>b)
		{
			System.out.println("Gunnar");
		}
		else
		{
			System.out.println("Emma");
		}
	}
	}
}
