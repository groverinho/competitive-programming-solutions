import java.util.Scanner;
class piedrapapeltijera {
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt())
		{
			int casos = in.nextInt();
			for (int i = 0; i < casos; i++) 
			{
				int n = in.nextInt();
				int angela=0,bernardo = 0;
				String cad = in.next();
				for (int j = 0; j < cad.length(); j+=2)
				{
					if(cad.charAt(j)=='I' && cad.charAt(j+1)=='A')
						bernardo++;
					else if(cad.charAt(j)=='I' && cad.charAt(j+1)=='T')
						angela++;
					else if(cad.charAt(j)=='A' && cad.charAt(j+1)=='I')
						angela++;
					else if(cad.charAt(j)=='A' && cad.charAt(j+1)=='T')
						bernardo++;
					else if(cad.charAt(j)=='T' && cad.charAt(j+1)=='I')
						bernardo++;
					else if(cad.charAt(j)=='T' && cad.charAt(j+1)=='A')
						angela++;
				}
				if(angela>bernardo)
					System.out.println("Angela gana");
				else if(bernardo>angela)
					System.out.println("Bernardo gana");
				else
					System.out.println("Empate");
			}
		}
	}
}