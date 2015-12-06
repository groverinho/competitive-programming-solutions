import java.util.Scanner;


public class ProblemC {

	public static void main(String[] args) 
	{
	
		String a = "";
		a.concat(a+""+a);
		Scanner in = new Scanner(System.in);
		while (true) 
		{
			String n = in.next();
			double acu = 0, aux = 0;
			for (int i = 0; i < n.length(); i++)
			{
				if ((i+1)!= n.length())
				{
					if ( Integer.parseInt(n.substring(i,i+2).toString())==10)
					{
						acu = acu+10;
						i++;
						aux++;
					}
					else if (Integer.parseInt(n.substring(i,i+1).toString()) <10)
					{
						acu = acu+Integer.parseInt(n.substring(i,i+1).toString());
						aux++;
					}
				}
				else
				{
					acu = acu+Integer.parseInt(n.substring(i,i+1).toString());
					aux++;
				}
					
			}
			System.out.printf("%.2f\n",(acu/aux));
		}
	}
}
