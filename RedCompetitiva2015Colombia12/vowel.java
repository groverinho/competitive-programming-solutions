import java.util.ArrayList;
import java.util.Scanner;



public class vowel {

	public static void main(String[] args) 
	{
		Scanner in  = new Scanner(System.in);
		int n  = in.nextInt();
		
		while (n>0) 
		{
			String cad = in.next();
			int vocal=0;
			int no=0;
			
			for (int i = 0; i < cad.length() ; i++) 
			{
				if (cad.charAt(i)=='a' ||cad.charAt(i)=='e'||cad.charAt(i)=='i'||cad.charAt(i)=='o'||cad.charAt(i)=='u') 
				{
					vocal++;
				}
				else
					no++;
			}
			if (no>vocal) {
				System.out.println(cad);
				System.out.println(0);
			}
			else if (no==vocal) {

				System.out.println(cad);
				System.out.println(0);
			}
			else
			{
				System.out.println(cad);
				System.out.println(1);
			}
			n--;	
		}
	}

}
