package DATASTRUCTURESyLIBRARIES;
import java.util.Scanner;
/**
Name: Grover Irusta Miranda
Date: 07-2017
Company: Coderoad - Mojix
 */

public class ParenthesisBalanceI {

	public static String process (String str) {
		  int open = 0, close = 0;
		  for (int i = 0; i < str.length(); i++) 
		  {
		    if (str.charAt(i)== '(')
		      open++;
		    else if (str.charAt(i) == ')')
		      close++;
		    if (close > open)
		      return "incorrect";
		  }
		  if (open != close)
		    return "incorrect";
		  else
		    return "correct";
		}
		 
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine())
		{
			String cadena = in.nextLine();
			System.out.println(process(cadena));
		}
		

	}

}
