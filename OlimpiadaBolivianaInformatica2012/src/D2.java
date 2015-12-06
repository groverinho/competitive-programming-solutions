import java.util.Scanner;


public class D2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int casos = in.nextInt();
		while (casos>0)
		{
			int numEnemigos = in.nextInt();
			double x[]= new double [numEnemigos];
			double y[]= new double [numEnemigos];
			for (int i = 0; i < numEnemigos; i++) 
			{
				x[i]= in.nextInt();y[i]= in.nextInt();
			}
			double bombax= in.nextDouble(); 
			double bombay= in.nextDouble();
			double bombaRadio= in.nextDouble();
			int cont=0;
			double[] distancias = new double[numEnemigos];
			for (int i = 0; i < numEnemigos; i++)
			{
			distancias[i]= Math.sqrt(Math.pow(bombax-x[i], 2)+Math.pow(bombay-y[i], 2));
			if(distancias[i]<=bombaRadio)
			cont++;
			}
			casos--;
			System.out.println(cont);
		
		}

	}

}
