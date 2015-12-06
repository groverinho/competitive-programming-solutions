import java.util.Scanner;


public class XYTimes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNextInt())
		{
			int x = in.nextInt();
			int y = in.nextInt();
			long r = 1;
		
			String aux = " "; 
			for (int i = 0, diez = 1; i < y; i++, diez = diez *10)
			{
				r  =  x * diez;
				aux = aux + r+ " ";
			}
			System.out.println(aux.trim());

		}
		
	}

}
