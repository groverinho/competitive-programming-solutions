package dia3;

import java.util.Scanner;

 class alchemy {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int hierro = in.nextInt(), agua = in.nextInt();
		while(hierro >0 && agua > 0) 
		{

			if(37*hierro == 1000*agua)
				System.out.println("Y");
			else 
				System.out.println("N");

			hierro = in.nextInt(); agua = in.nextInt();

		}
	}
}
