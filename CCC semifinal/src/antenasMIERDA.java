import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class antenasMIERDA {

	public static void main(String[] args) throws FileNotFoundException {
		//File archivo = new File ("C:\\antenas.0.input");
        
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos-->0)
		{
			int n = in.nextInt();
			int c = in.nextInt();
			ArrayList<Integer>areas = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) 
			{
				areas.add(in.nextInt());
			}
			Collections.sort(areas);
			 ArrayList<Integer>rangos= new ArrayList<Integer>(); 
			for (int i = 0; i < areas.size()-1; i++)
			{
				rangos.add(areas.get(i+1)- areas.get(i));
			}
			
			
//			for (int i = 0; i < rangos.size(); i++) {
//				System.out.println(rangos.get(i));	
//			}
			Collections.sort(rangos);
			int sum =0;
			for (int i = 0; i < rangos.size(); i++)
			{
			//	System.out.println(rangos.get(i));
				sum += rangos.get(i);
			}
			//System.out.println();
			double r = sum/n;
			System.out.println(r);
		}

	}

}
