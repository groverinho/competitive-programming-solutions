import java.util.Scanner;

/**
Name: Grover A. Irusta Miranda
University: Universidad Privada Domingo Savio - Tarija
Date: 17-09-16
 */

public class AyudandoalabueloLaino {

	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			while (in.hasNext())
			{
				String c = in.next();
				if (c.contains("i"))
				{
					System.out.println("N");
				}
				else
					System.out.println("S");
			}



	}

}
