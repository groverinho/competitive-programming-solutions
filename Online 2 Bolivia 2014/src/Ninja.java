import java.util.Arrays;
import java.util.Scanner;
public class Ninja 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int N, A, B, C, D, area, sum, sum1, sum2, compartir11, compartir12, compartir21, compartir22;
		int[] part = new int [4];
		boolean impossible;
		N = in.nextInt();
		for (int i = 0; i < part.length; i++)
			part[i]= in.nextInt();
		A = part[0];
		B = part[1];
		C = part[2];
		D = part[3];

		while(! (N == 0 && A == N && A == B && A == C && A == D) )
		{
			impossible = false;
			area = N * N * N;
			sum  = A + B + C + D;

			if( sum != area)
				impossible = true;
			else
			{
				if( !((A / N) * N == A && (B / N) * N == B && (C / N) * N == C && (D / N) * N == D) )
					impossible = true;
				else
				{
					Arrays.sort(part);//	sort(part, part + 4);
					for(int i = 0; i < 4; i++)
						part[i] = part[i] / N;

					if( part[0] * part[3] == part[1] * part[2])
					{
						sum1 = part[3] + part[2];
						compartir11 = (part[3] * N )/ sum1;
						compartir12 = (part[2] * N )/ sum1;
						sum2 = part[3] + part[1];
						compartir21 = (part[3] * N )/ sum2;
						compartir22 = (part[1] * N )/ sum2;

						if( !(compartir11 + compartir12 == N && compartir21 + compartir22 == N))
							impossible = true;
					}
					else
					{
						impossible = true;
					}
				}
			}
			if(impossible)
				System.out.println("Impossible");
			else
				System.out.println("Possible");
			
			N = in.nextInt();
			for (int i = 0; i < part.length; i++)
				part[i]= in.nextInt();
			A = part[0];
			B = part[1];
			C = part[2];
			D = part[3];

		}
	}

}
