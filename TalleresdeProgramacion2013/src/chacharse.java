import java.util.Scanner;


public class chacharse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			
		
		int n = in.nextInt();
		if (n>=30)
		{
			System.out.println("No pueden chacharse");
		}
		else
			System.out.println("Pueden chacharse");
		}
	}

}
