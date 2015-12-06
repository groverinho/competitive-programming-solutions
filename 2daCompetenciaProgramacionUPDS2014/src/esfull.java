import java.util.Scanner;
 /*
 4 4 4 2 3
 4 4 2 4 2
 2 2 5 5 5
 2 2 1 5 5
 1 3 1 3 1
 0 0 0 0 0
  */
 class esfull {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int[] x=new int[5];
		for (int i = 0; i < 5; i++)
			x[i]=in.nextInt();
		while (x[0]!=0)
		{
			if(x[0]==0)
				break;		
			int cont2=0;
			for (int i = 0; i < 5; i++) 
			{	
				int cont=0;
				for (int j = 0; j < 5; j++) 
				{
					if (x[i]==x[j]) 
						cont++;
				}
				if (cont>=2)
					 cont2++;				
			}
			if (cont2==5)
				System.out.println("Es Full");
			else
				System.out.println("No");	
			for (int i = 0; i < 5; i++)
				x[i]=in.nextInt();
		}
	}
}
