import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class antenas {

	public static void main(String[] args) throws FileNotFoundException {
		//File archivo = new File ("C:\\antenas.0.input");
        
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos-->0)
		{
			int n = in.nextInt();
			int c = in.nextInt();
			
			ArrayList<Integer>lista = new ArrayList<Integer>();
			int auxM=0;
			int auxD=0;
			
			for (int i = 0; i < n; i++) 
			{
				int aux = in.nextInt();
				lista.add(aux);
				auxM += aux*c;
				auxD += aux/c;
			}
			
			Collections.sort(lista);
			for (int i = 0; i < n; i++) 
			{
				System.out.println(lista.get(i));
			}
			System.out.println();
			System.out.println();
			System.out.println(auxM/auxD);
		}

	}

}
