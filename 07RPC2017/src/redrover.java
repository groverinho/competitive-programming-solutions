	// Grover Irusta M.
// 08/07/17
// CodeRoad - Mojix

import java.util.Scanner;
public class redrover
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String c = in.next();
		int min = c.length();
		for (int i = 0; i < c.length() - 1; i++)
		{
			for (int j = i+1; j < c.length(); j++)
			{
				String subCad = c.substring(i, j + 1);
				int length = c.replaceAll(subCad, "M").length() + subCad.length();
				if (length < min)
					min = length;
			}
		}		
		System.out.println(min);
	}
}
