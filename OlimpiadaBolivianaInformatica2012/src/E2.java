import java.util.Scanner;


 class E2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=1;
		while (n!=0) 
		{
			
		if (n==0) {
			break;
		}
		
		int casos = in.nextInt();
		while (casos>0)
		{
			int a =0;
			int b =0;
			int o =0;
			int l =0;
			int i =0;
			int v =0;
			String cad1=in.next();
			int cont =0;
			for (int j = 0; j < cad1.length(); j++) 
			{
				if (cad1.charAt(j)=='B')
					b++;
				if (cad1.charAt(j)=='O')
					o++;
				if(cad1.charAt(j)=='L')
					l++;
				if(cad1.charAt(j)=='V')
					v++;
				if(cad1.charAt(j)=='A')
					a++;
				if (cad1.charAt(j)=='I')
					i++;	
	
			}
			if (a>0 && i>1 && b>0 &&o>0 &&l>0 && v>0 )
			{
				System.out.println("ES POSIBLE");
			}
			else
				System.out.println("NO ES POSIBLE");
			casos--;
		}
		 n=in.nextInt();
		}
		
	}}

/*3
BOLIVIA
ES POSIBLE
BOOIILVA
ES POSIBLE
BOLVZATY
NO ES POSIBLE
0
*/