import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class formula {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s1=in.readLine();
		String s2=in.readLine();
		String s3=in.readLine();
		String v1[]=s1.split(" ");
		String v2[]=s2.split(" ");
		String v3[]=s3.split(" ");
		
		double x1=Double.parseDouble(v1[0]);
		double y1=Double.parseDouble(v1[1]);
		double x2=Double.parseDouble(v2[0]);
		double y2=Double.parseDouble(v2[1]);
		double x3=Double.parseDouble(v3[0]);
		double y3=Double.parseDouble(v3[1]);
		double r=Double.parseDouble(in.readLine());
		double a=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		double b=Math.sqrt(Math.pow(x3-x1, 2)+Math.pow(y3-y1, 2));
		double c=Math.sqrt(Math.pow(x2-x3, 2)+Math.pow(y2-y3, 2));
		double f1=r*((a+b+c)/2.0);
		double f2=Math.sqrt((4.0*a*a*b*b)-(a*a+b*b-c*c)*(a*a+b*b-c*c))/4.0;
		double p=(f2*100.0)/f1;
		System.out.printf("%.3f\n",p-100);
		
		
			
	}

}