package dia4;

import java.util.Scanner;

public class BEENUMS {

	public static void main(String[] args) 
	{
		long  p, d, rt;
		Scanner in = new Scanner(System.in);
		p = in.nextInt();
		while(p!=-1)
		{
			d = 9 + 12*(p-1);
			rt = (int)Math.sqrt((double)d);
			if(rt*rt == d)
			{
				rt -= 3;
				if(rt % 6 == 0)
					System.out.println("Y");
				else 
					System.out.println("N");
			}
			else 
				System.out.println("N");

			p = in.nextInt();
			
	}

}
}
