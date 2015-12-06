import java.util.Scanner;


public class Jotoco1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNextInt())
		{
			double centimetros = in.nextDouble();
			int altura = in.nextInt();
			int subiendo=0;
			double mitad = centimetros/2;
			for (double i = 0; i <=altura;) 
			{
				i = i + centimetros - mitad;
				if (i>=altura)
					break;
				else
					subiendo++;
			}
			System.out.println(subiendo);
		}
		
	}

}
