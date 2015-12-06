import java.util.Scanner;


public class C3 {


	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n=1;
		while (n!=0) 
		{
			
		if (n==0) {
			break;
		}
		
		int casos = in.nextInt();
		while (casos>0)
		{
			double x1= in.nextInt(); //x
			double y1= in.nextInt();
			double x2= in.nextInt();//y
			double y2= in.nextInt();
			double x3= in.nextInt(); //z
			double y3= in.nextInt();
			double dis1=0;
			double dis2=0;
			double dis3=0;
			dis1 = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
			dis2 = Math.sqrt(Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2));
			dis3 = Math.sqrt(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2));
			double hipo=0;
			if (dis1>dis2 && dis1>dis3)
				hipo=dis1;
			else if (dis2>dis3 && dis2 > dis1)
				hipo=dis2;
			else if (dis3>dis2 && dis3 > dis1)
				hipo= dis3;	
			
			double angulo1=0;
			double angulo2=0;
			angulo1=Math.atan(dis1/hipo);
			angulo2=Math.atan(dis2/hipo);
			System.out.println(angulo1);
			System.out.println(angulo2);
			casos--;
		}
		/*4
-4 -5 8 0 -5 -3*/
		 n=in.nextInt();
		}

	}

}
