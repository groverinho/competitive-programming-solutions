import java.util.Scanner;


public class sweet {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 int n, total, c;
		   c = 0;
		   total = 0;
		 n = in.nextInt();
		   while ( n > 0 )
		     {
		      ++c;
		      total = total + n;

		      if ( total >= 100 )
		    	  System.out.println("Input #"+c+": Totally Sweet!");
		      else if ( total >= 50 )
		    	  System.out.println("Input #"+c+": Sweet!");

		      total = total % 50;

		      n = in.nextInt();

		     }

	}

}
