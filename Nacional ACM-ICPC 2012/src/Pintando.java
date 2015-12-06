import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;


public class Pintando 
{

	public static void main(String[] args) 
	{
	Scanner in = new Scanner(System.in);
	int casos = in.nextInt();
	
		while (casos!=0)
		{
			int sum = 0;
			//dis = Math.sqrt(Math.pow(dx2-dx1, 2)+Math.pow(dy2-dy1, 2)+Math.pow(dz2-dz1, 2));
			while(casos>0)
			{
				double x1= in.nextDouble();
				double y1= in.nextDouble();
				double x2= in.nextDouble();
				double y2= in.nextDouble();
				double x3= in.nextDouble();
				double y3= in.nextDouble();
				double x4= in.nextDouble();
				double y4= in.nextDouble();
				double dis=Math.sqrt(Math.pow(x1-x2, 2)+ Math.pow(y1-y2, 2));
				double dis2=Math.sqrt(Math.pow(x3-x1, 2)+ Math.pow(y3-y1, 2));
				if (dis>dis2)
					sum+=dis;
				else
					sum+=dis2;
				
				casos--;
			}
			System.out.println(sum);
			casos = in.nextInt();
		}
	}

}
