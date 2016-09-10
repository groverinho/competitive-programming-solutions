import java.util.Arrays;
import java.util.Scanner;

// Author: Grover Irusta
// University: Universidad Privada Domingo Savio - Tarija
// Date: 03-09-16

public class cacho {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos  = in.nextInt();
		while (casos -->0)
			{
			int v []= new int [5];
			for (int i = 0; i < v.length; i++) {
				v[i]=in.nextInt();
			}
			boolean bandera = false;
			Arrays.sort(v);
			for (int i = 0; i < v.length-1; i++) {
				if (v[i]+1!= v[i+1]) {
					bandera = true;
					break;
				}
			}
			System.out.println(bandera?"N":"Y");
		}
	}

}
