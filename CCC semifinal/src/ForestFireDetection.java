import java.util.Scanner;


public class ForestFireDetection {

	public static int funcion (int i, int j)
	{
		//int respuesta = (int) Math.abs(1000*Math.sin((i*j) % 90));
		return (int) Math.abs(1000 * Math.sin(i*j % 90));
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		int n = in.nextInt();
		int m = in.nextInt();
		int f = in.nextInt();
		int z = in.nextInt();
		int cont =0;
//		for (int i = 0; i < m; i++)
//		{
//			for (int j = 0; j < m; j++)
//			{
				//System.out.println((funcion(i,j)%z )+1);
				System.out.println((funcion(1,1)%z)+1);
				System.out.println((funcion(1,2)%z)+1);
				System.out.println((funcion(2,1)%z)+1);
				System.out.println((funcion(2,2)%z)+1);
				System.out.println((funcion(1,3)%z)+1);
				System.out.println((funcion(2,3)%z)+1);
				System.out.println((funcion(3,3)%z)+1);
				System.out.println((funcion(3,2)%z)+1);
				System.out.println((funcion(3,1)%z)+1);
				
//				if (((funcion(i,j)%z )+1)>=f) 
//				{
//					cont++;
//				}
//			}
//		}
		//System.out.println(cont);

	}

}
