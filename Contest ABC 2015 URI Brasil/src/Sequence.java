import java.util.Scanner;


public class Sequence {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			
		
		int a = in.nextInt();
		int b = in.nextInt();
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		String aux = "";
		for (int i = min; i <=max; i++) 
		{
			aux = aux + i + " ";
		}
		System.out.println(aux);
		}
	}

}
