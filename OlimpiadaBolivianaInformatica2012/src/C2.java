import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

 class C2 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {

		BufferedReader entr1 =new BufferedReader (new InputStreamReader(System.in));
		String input1 = entr1.readLine();
		Scanner in = new Scanner(System.in);
		int n=1;
		while (n!=0) 
		{
		if (n==0) {
			break;
		}
		
		int casos = Integer.parseInt(input1);
		while (casos>0)
		{
			String cad1=entr1.readLine();
			char []vector;
			vector = cad1.toCharArray();
			for (int i = 0; i < vector.length; i++)
			{
				
				if (vector[i]=='a'||vector[i]=='e'||vector[i]=='i'||vector[i]=='o'||vector[i]=='u')
				{     
					vector[i]='-';
				}
			}
			for (int i = 0; i < vector.length; i++) 
			{
				System.out.print(vector[i]);
			}
			
			
			casos--;
			System.out.println();
		}
	//	n=casos;
		
		 n= in.nextInt();
		}
	/*
5
creci de a poco con tu calor,
me alimentaba con tus caricias
y frases de amor.
con miedo de perderte...
se hizo la luz
*/	
	}
	}