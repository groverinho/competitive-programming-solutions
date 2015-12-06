import java.util.Scanner;

public class bus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n-->0)
			{
			int m = in.nextInt();
			int r = (int) (Math.pow(2, m)-1);
			System.out.println(r);
		}

	}

}
