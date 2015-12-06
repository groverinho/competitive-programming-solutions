import java.util.Scanner;


public class c {

	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		int n,s,j,d;
		String juegos;
		char [] games;
		int contA=0,contB=0,resultA = 0,resultB = 0;
		while(entrada.hasNextInt())
		{
			contA=0;contB=0;resultA = 0;resultB = 0;
			n = entrada.nextInt();
			s = entrada.nextInt();
			j = entrada.nextInt();
			d = entrada.nextInt();
			juegos = entrada.next();
			games = juegos.toCharArray();
			for (int i = 0; i < games.length; i++)
			{
				if(games[i]=='A')
					contA++;
				else
					contB++;
				if(contA>=j||contB>=j)
				{
					if(Math.abs(contA-contB)>=d)
					{
						if(contA>contB)
							resultA++;
						else
							resultB++;
						contA=0;contB=0;
					}
				}
				if(resultA==s || resultB==s)
					break;
			}
			System.out.println((resultA)+" "+(resultB));
		}

	}

}
