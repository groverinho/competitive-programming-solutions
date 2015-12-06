import java.util.Scanner;

public class garage {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		int h1 = entrada.nextInt();
        int w1 = entrada.nextInt();

        int h2 = entrada.nextInt();
        int w2 = entrada.nextInt();
        
        int aux1 =(w1 / w2 + 1) / 2;
        int aux2 = (h1 / h2 + 1) / 2;
        System.out.println(aux1*aux2);
	}

}
