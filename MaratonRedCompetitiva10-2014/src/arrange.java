import java.util.Scanner;

public class arrange {

	public static void main(String[] args) 
	{
		boolean bool[] = new boolean[26]; 
		Scanner entrada = new Scanner(System.in);
		int n= entrada.nextInt();
		String ideas[]= new String[n];
		for (int i = 0; i < ideas.length; i++)
		{
			ideas[i]=entrada.next();
		}
		for (int i = 0; i < ideas.length; i++) 
		{
			int k=0;
			int cont = 0;
			for (char j = 'A'; j <= 'Z'; j++) 
			{
				if((ideas[i].charAt(0)==j) && (bool[k]==false))
					bool[k]=true;
				k++;
			}
		}
		int max =0;
		for (int i = 0; i < bool.length; i++)
		{
			if(bool[i]==false)
				break;
			else
				max++;
		}
		System.out.println(max);
	}
}
