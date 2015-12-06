import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class caballerosidad {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
		String cad1 = in.next();
		String cad2 = in.next();
		String m ="", w = "";
		 Queue<Character> cola1 = new LinkedList<Character>();
		 Queue<Character> cola2 = new LinkedList<Character>();
		for (int i = 0; i < cad1.length(); i++) 
				cola1.offer( cad1.charAt(i));
		for (int i = 0; i < cad2.length(); i++) 
				cola2.offer( cad2.charAt(i));

			while (!cola1.isEmpty()) 
			{	
				if (cola1.peek()=='M'&& cola2.peek()=='M')
				{
					System.out.print(cola1.poll());
					System.out.print(cola2.poll());
				}
				else if (cola1.peek()=='W' && cola2.peek()=='W') 
				{
					System.out.print(cola1.poll());
					System.out.print(cola2.poll());
				}
				else
				{
					
					if (cola1.peek()=='W' && !cola1.isEmpty())
					{
						System.out.print(cola1.poll());
						System.out.print(cola2.poll());	
					}
					else if(cola2.peek()=='W' && !cola2.isEmpty())
					{
						System.out.print(cola2.poll());	
						System.out.print(cola1.poll());	
					}		
				}
				if (cola2.isEmpty()) 
				{
					break;
				}
			}
		
		while (!cola1.isEmpty()) 
		{
			System.out.print(cola1.poll());
		}
		while (!cola2.isEmpty()) 
		{
			System.out.print(cola2.poll());
		}
		System.out.println();
	}
	}

}
