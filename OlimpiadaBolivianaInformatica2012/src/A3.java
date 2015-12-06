import java.util.Scanner;


 class A3 
{
	public static int capi (int n)
	{
		int aux=0, r=0;
		while (n>0)
		{
			aux=n%10;
			r=r*10+aux;
			n=n/10;
		}
		return r;
	 }
	public static boolean capicua (int n)
	{int m=n;
		int aux=0, r=0;
		while (m>0)
		{
			aux=m%10;
			r=r*10+aux;
			m=m/10;
		}
		if(n==r)
		{
			return true;	
		}
		else
		{
			return false;
		}
		
	 }
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
				int num = in.nextInt();
		        int sum=0;
				int y=100,l = 0;int num2;
			este:	while (y>0) 
			{          if(y==100)
					    {
					    num2 =capi(num);
						sum=num+num2;
						}
						else
						{
							sum=l+capi(l);
						}
			//		System.out.println(sum);
						if(capicua(sum)==true)
						{
							System.out.println(sum);break este;
						}
					l=sum;
					y--;
				}
				if(y==0)
				{
					System.out.println("imposible");
				}
				casos--;
			}
				//System.out.println(a);
			 n=in.nextInt();
			}
			
			}
			
		}



