import java.util.Scanner;


public class Jotoco2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (in.hasNextInt())
		{
			double centimetros = in.nextDouble();
			int altura = in.nextInt();
			int subiendo=0;
			double porcentaje = centimetros * 0.10;
			for (double i = 0; i <=altura; ) 
			{
				i = i + centimetros - porcentaje;
				porcentaje = i * 0.10;
//				if (i>=altura)
//					break;
//				else
					subiendo++;
			}
			System.out.println(subiendo);
		}
		
	}

}
