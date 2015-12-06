import java.util.Scanner;

//P pieda
//L papel
//I tijera
public class pregunta1 {
	public static void main(String[] args)
    {
		Scanner in = new Scanner(System.in);
		
			int casos = in.nextInt();
			for (int i = 0; i < casos; i++) 
			{
				int n = in.nextInt();
				int mario=0,clara = 0;
				String cad = in.next();
				for (int j = 0; j < n*2; j+=2)
				{
					if(cad.charAt(j)=='P' && cad.charAt(j+1)=='L')
						clara++;
					else if(cad.charAt(j)=='P' && cad.charAt(j+1)=='I')
						mario++;
					else if(cad.charAt(j)=='L' && cad.charAt(j+1)=='P')
						mario++;
					else if(cad.charAt(j)=='L' && cad.charAt(j+1)=='I')
						clara++;
					else if(cad.charAt(j)=='I' && cad.charAt(j+1)=='P')
						clara++;
					else if(cad.charAt(j)=='I' && cad.charAt(j+1)=='L')
						mario++;
				}
				if(mario>clara)
					System.out.println("Mario gana");
				else if(clara>mario)
					System.out.println("Clara gana");
				else
					System.out.println("Empataron");
			}
		
	}
    
}
