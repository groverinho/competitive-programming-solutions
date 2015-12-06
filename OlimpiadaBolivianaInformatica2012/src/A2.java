import java.util.Scanner;


 class A2 {

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
			String cad1=in.next();
			String cad2=in.next();
			
			int a=0;
			for (int i = 0; i < cad1.length(); i++)
			{
				
				if (cad1.charAt(i)!=cad2.charAt(i))
				{
					a++;
				}
			}
			System.out.println(a);
			casos--;
		}
		 n=in.nextInt();
		}
		
	}
/*
3
11010 01100
10000001 10000001
11111111 00000000
 * 
 */
}
