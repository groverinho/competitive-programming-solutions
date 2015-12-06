import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 class flexible2 {
	public static void main(String[] args) 
	{
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		int casos = in.nextInt();
		int []vector = new int [casos+1];
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(n);
		vector[0]=0;
		for (int i = 1; i < vector.length; i++)
		{
			vector[i]= in.nextInt();
			lista.add(n-vector[i]);
		}
		for (int i = vector.length-1; i >=0 ; i--)
		{
			for (int j = vector.length-1; j >=0; j--)
			{
				if ((vector[j]-vector[i])>0) 
					lista.add(vector[j]-vector[i]);
			}
		}
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		for (int i = 0; i < lista.size(); i++) 
		{
			if (!lista2.contains(lista.get(i))) 
				lista2.add(lista.get(i));
		}
		Collections.sort(lista2);
		String cad = "";
		for (int i = 0; i < lista2.size(); i++)
		{
			if ((i+1)!=lista2.size())
				cad = cad+ lista2.get(i)+" ";
			else
				cad = cad+lista2.get(i);
		}
		System.out.println(cad);
	}
}
