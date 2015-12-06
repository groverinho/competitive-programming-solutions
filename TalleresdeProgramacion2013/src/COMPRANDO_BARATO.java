import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class COMPRANDO_BARATO {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		
		while (casos>0) {
			
			
			ArrayList<Integer> lista = new ArrayList<Integer>();
			int n = in.nextInt();
			int [] vector = new int[n];
			if (n<=2)
			{
				for (int i = 0; i < vector.length; i++) {
					int a = in.nextInt();
				}
				System.out.println("-1");
			}
			else
			{
				
				for (int i = 0; i < n; i++)
				{
					vector[i]= in.nextInt();
				}
				for (int i = 0; i < vector.length; i++)
				{
					if (!lista.contains(vector[i]))
						lista.add(vector[i]);
				}
				if (lista.size()<=2) 
					System.out.println("-1");
				else
				{
				Collections.sort(lista);
				System.out.println(lista.get(2));
				}
			}
			casos--;			
		}
	}
}
/*
10
10
10
10
10
20
20
30
30
40
40

3
9
10 40 50 20 70 80 30 90 60
10
10 10 10 10 20 20 30 30 40 40
*/