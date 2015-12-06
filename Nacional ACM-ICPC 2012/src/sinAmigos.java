
import java.util.Scanner;



public class sinAmigos 
{	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
		while(num!=0)
		{
			int[] vector = new int[num];
			int[] vector2 = new int[num];
			int contador = 0, contador2 = 0;
			int aux, s1=0,s2=0, auxs1;
			aux = num/2;	
			while(aux>=2)
			{
				if (num%aux==0)
				{	
					vector[contador]= num/aux;
					contador++;
				}
				aux--;
			}
		for (int i = 0; i < vector.length; i++) 
		{
			s1 =s1+ vector[i];
		}
		s1=s1+1; // ejm 284/284=1
		
		auxs1 = s1;	
		while(auxs1>=2)
		{
			if (s1%auxs1==0)
			{
				vector2[contador2]= s1/auxs1;
				contador2++;
			}
			auxs1--;
		}
		for (int i = 0; i < vector2.length; i++) 
		{
			s2 =s2+ vector2[i];
		}	

		if(num == s2)
			System.out.println(s1);
		else if(num ==1)
			System.out.println(1);
		 else
			System.out.println(-1);
		num = in.nextInt();
		}
	}

}

