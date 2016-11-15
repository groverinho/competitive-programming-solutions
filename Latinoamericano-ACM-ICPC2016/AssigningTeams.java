import java.util.Arrays;
import java.util.Scanner;

/**
Team: #include VinoySingani
University: UPDS Tarija
Date: 12-11-16
 */


public class A {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext())
    {
			int []v = new int[4];
			for (int i = 0; i < v.length; i++) 
				v[i]=in.nextInt();
			Arrays.sort(v);
			System.out.println(Math.abs(v[0]+v[3]-v[1]-v[2]) 	);
		}		
		}
}
