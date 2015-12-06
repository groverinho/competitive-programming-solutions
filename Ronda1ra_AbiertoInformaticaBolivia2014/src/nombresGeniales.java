import java.util.Scanner;


public class nombresGeniales {

	public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	while (in.hasNext()) {
		
	
	String cadena = in.next();
	if (cadena.length() % 2 ==0)
	{
		System.out.println("Es Genial");
	}
	else
		System.out.println("No es Genial");
	}
	}

}
