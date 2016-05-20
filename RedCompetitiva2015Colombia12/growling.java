
import java.util.Scanner;

public class growling {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos>0)
		{
			int marchas = in.nextInt();			
			long maximaAcelera1 = -1;
			long maximaAcelera2 = 1;
			long curvaturaAcelera;
			long curvaturaAceleraAUX;
			int max = 0;
			long a,b,c;
			for(int i = 0; i< marchas; i++) 
			{
				a = in.nextLong();
				b = in.nextLong();
				c = in.nextLong();
				curvaturaAcelera = b*b + 4*a*c;
				curvaturaAceleraAUX = 4*a;
				if (curvaturaAcelera*maximaAcelera2 > maximaAcelera1*curvaturaAceleraAUX)
				{
					maximaAcelera1 = curvaturaAcelera;
					maximaAcelera2 = curvaturaAceleraAUX;
					//long maxRPM =(b+a)/(2*a);
					max = i+1;
				}
			}
			System.out.println(max); 
casos--;
		}
	}
}