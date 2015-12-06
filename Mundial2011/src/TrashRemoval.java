import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.util.Scanner;


public class TrashRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int c=1;
		while(true)
		{
			int n = in.nextInt();
			if (n==0)
				break;
			
			int [] x = new int [n];
			int [] y = new int [n];
			double min = 1000000000;
			for (int i = 0; i < n; i++) 
			{
				x[i]=in.nextInt();
				y[i]= in.nextInt();
			}
			Polygon anchuraPol = new Polygon(x,y,n);
			for (int i = 0; i < n; i++) 
			{
				for (int j = i+1; j < n; j++)
				{	//roto mi poligono restando mis ejes x & y, y determinando la anchura atraves de x % y
					AffineTransform transformar = AffineTransform.getRotateInstance(x[i] - x[j], y[j] - y[i], x[j], y[j]);
					Shape rotar = transformar.createTransformedShape(anchuraPol);
					min =  Math.min(min, rotar.getBounds2D().getHeight());
				}
			}
			System.out.print("Case "+c+": ");
			System.out.printf("%.2f\n",min);
			c++;
		}
	}

}
