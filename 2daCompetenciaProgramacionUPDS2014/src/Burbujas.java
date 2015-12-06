import java.util.Scanner;
import java.math.*;
 class Burbujas {

	public static void main(String[] args) 
	{
		Scanner entrada =new  Scanner (System.in);
		int r1=entrada.nextInt();
		int r2=entrada.nextInt();
		while (r1!=0 && r2!=0)
		{
		double x1=entrada.nextInt(), y1=entrada.nextInt(), z1=entrada.nextInt(), x2=entrada.nextInt(), y2=entrada.nextInt(), z2=entrada.nextInt();
		double dx1=entrada.nextInt(),dy1=entrada.nextInt(),dz1=entrada.nextInt(),dx2=entrada.nextInt(),dy2=entrada.nextInt(),dz2=entrada.nextInt();
		double dis=0;
			dis = Math.sqrt(Math.pow(dx2-dx1, 2)+Math.pow(dy2-dy1, 2)+Math.pow(dz2-dz1, 2));
			if(dis<=(r1+r2))
				System.out.println("SI");
			else			
				System.out.println("NO");
			r1=entrada.nextInt();
			r2=entrada.nextInt();
		}
	}

	//}
/*
1 1
0 0 0 1 1 1
0 0 0 0 0 0
3 5
1 2 3 4 5 6
6 5 4 3 2 1
1 3
0 0 0 9 9 9
-1 -1 -1 10 10 10
0 0
 * */
}

