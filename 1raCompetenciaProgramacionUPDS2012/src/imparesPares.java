
/*9
0 2 2 4 2 1 2 0 4
1 2 3 4 5 0 1 2 3 
*/
import java.io.*;
import java.util.*;
public class imparesPares {

	public static void main(String[] args) {
	int Juan = 0, Maria = 0, x, n, i;
	Scanner in = new Scanner(System.in);
	n = in.nextInt();
	while (n  !=0) 
	{
		Juan = 0;
		Maria = 0;
		for (i = 0; i < n; i++)
		{
			x = in.nextInt();
			if ((x %2) == 1)
			{
				Maria++;
		//	System.out.println("maria: "+Maria);
			}
		}
		for (i = 0; i < n; i++) 
		{
			x = in.nextInt();
			if ((x %2) == 0)
			{
			Juan++;
		//	System.out.println("juan: "+Juan);
			}
		}
		if ( Juan > Maria )
			System.out.println(Juan - Maria);
		else
			System.out.println(Maria - Juan);
		n = in.nextInt();
	}
	
	}
}/*
3 
1 0 4 
3 1 2 
9 
0 2 2 4 2 1 2 0 4 
1 2 3 4 5 0 1 2 3 
0
*/