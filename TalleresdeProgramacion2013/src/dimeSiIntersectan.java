import java.util.Scanner;


public class dimeSiIntersectan {

	public static void main(String[] args) {
		Scanner entrada =new  Scanner (System.in);
		while (entrada.hasNextInt()) 
		{
			int x1=entrada.nextInt(), y1=entrada.nextInt(), r1=entrada.nextInt();
			int x2=entrada.nextInt(), y2=entrada.nextInt(), r2=entrada.nextInt();
			if (x1==0&&y1==0&&r1==0&& x2==0&&y2==0&&r2==0) 
				break;
			
				double dis2 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));//hallamos la distancia entre dos puntos
	
				if(dis2<=(r1+r2) && Math.abs(r1-r2) <=  dis2)//comparamos si es menor o igual que la suma de los radios
					System.out.println("SI");
				 else			
					System.out.println("NO");
	//			 x1=entrada.nextInt(); y1=entrada.nextInt(); r1=entrada.nextInt();
	//			 x2=entrada.nextInt(); y2=entrada.nextInt(); r2=entrada.nextInt();
			
		}
			


	}

}
