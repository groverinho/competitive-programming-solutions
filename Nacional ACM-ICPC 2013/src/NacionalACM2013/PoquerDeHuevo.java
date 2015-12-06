package NacionalACM2013;
import java.util.Scanner;


 class PoquerDeHuevo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] x=new int[5];
		for (int i = 0; i < 5; i++)
			x[i]=in.nextInt();
		while (x[0]!=0)
		{
			if(x[0]==0)
				break;
			int a = 0;
			for (int i = 0; i < 5; i++) 
			{
				int cont=0;
				for (int j = 0; j < 5; j++) 
				{
					if (x[i]==x[j]) 
						cont++;
				}
				if (cont==3)
				 a=x[i];	
			}
			if(a==0)
				System.out.println("No");
			else
			{
			int contaux=0;
			for (int i = 0; i < 5; i++) 
			{
				if ((7-x[i])==a)
					contaux++;
			}
			if (contaux>=1)
				System.out.println("Poquer de huevo");	
			else
				System.out.println("No");
			}
				for (int i = 0; i < 5; i++)
					x[i]=in.nextInt();
		}
	}

}