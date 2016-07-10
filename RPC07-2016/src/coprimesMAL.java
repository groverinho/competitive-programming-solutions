import java.util.Arrays;
import java.util.IllegalFormatCodePointException;
import java.util.Scanner;


public class coprimesMAL {

	public static boolean[] criba()
	{
		 boolean primos[] = new boolean[100000000];
		 Arrays.fill(primos,true);
		 primos[0] = primos[1] = false;
		 for(int i=2;i<(int)Math.sqrt(100000000)+1;i++)
		  if(primos[i])
		   for(int j=i*i;j<primos.length;j+=i)
		    primos[j] = false;
		 return primos;
		}
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	 boolean primos[] =criba();
	int casos = in.nextInt();
	while (casos-->0)
	{
		boolean bandera = false;
		String num = in.next();
		int c=1;
		System.out.println("Ticket #"+c+":");
		int a  = 0,b=0;
		for (int i = 0 ,j = num.length(); i < num.length()-1; i++, j--)
		{
			System.out.println(Integer.parseInt((num.substring(0,i+1))));
			System.out.println(Integer.parseInt(num.substring(i+1,num.length())));
			if (primos[Integer.parseInt((num.substring(0,i+1)))]&& primos[Integer.parseInt(num.substring(i+1,num.length()))])
					{
				a=Integer.parseInt((num.substring(0,i+1)));
				b= Integer.parseInt(num.substring(i+1,num.length()));
				
				bandera = true;
				break;
			}
			
			
		}
		
		
		if (bandera) {
			System.out.println(a+" "+b);
		}
		else
			System.out.println("Not relative");
		c++;
	}
			
			
	}

}
