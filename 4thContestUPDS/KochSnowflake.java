import java.util.Scanner;
/**
Name: Grover Irusta Miranda
Date: 13-07-2017
Company: Coderoad - Mojix
 */
public class KochSnowflake {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) 
		{
			int s = in.nextInt();
			double area = (2 * Math.sqrt(3) * (s*s))/5;
			System.out.printf("%.2f\n",area);
		}
		
	}

}
