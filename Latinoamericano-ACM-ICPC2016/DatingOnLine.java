import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
Team: #include VinoySingani
University: UPDS Tarija
Date: 12-11-16

6
10 60 70 70 80 80
3
100 100 100
7
16 37 50 35 12 39 24
 */


public class D {
	final static double EPS = 1e-9;
	public static class puntos implements Comparable<puntos>
	{
		double first ,second;
	public puntos(double f,double s){
		first = f;
		second = s;
		
	}
	public int compareTo(puntos other)
	{
		if (Math.abs(first-other.first)>EPS)
		{
			return (int)Math.ceil(first-other.first);
		}
		else if(Math.abs(second-other.second)>EPS)
		{
			return (int)Math.ceil(second-other.second);
		}
		else return 0;
	}
	}
	static double area(ArrayList<puntos> p)
	{
	    double resutl = 0.0,x1,y1,x2,y2;
	    for(int i =0; i<(int)p.size()-1;i++)
	    {
	    //	System.out.println(p.get(i).first + " " + p.get(i).second);
	        x1 = p.get(i).first;
	        x2 =  p.get(i+1).first;
	        y1 =  p.get(i).second;
	        y2 =  p.get(i+1).second;
	        resutl+= (x1*y2-x2*y1);
	    }
	  //  System.out.println(p.get(p.size()-1).first + " " + p.get(p.size()-1).second);
        return Math.abs(resutl)/2.0;
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		while (in.hasNext()) {
		//8660,254	
			int n = in.nextInt();
			ArrayList<Integer>lista = new ArrayList<Integer>();
			
			for (int i = 0; i < n; i++) 
			{
				lista.add( in.nextInt());
			}
			Collections.sort(lista);//2.0*Math.PI)
			 double alfa= (2.0*Math.PI)/(double)n;
			// System.out.println("alfa "+alfa);
			 ArrayList<puntos>p1 = new ArrayList<puntos>();
			 ArrayList<puntos>p2 = new ArrayList<puntos>();
			 int c1 =0;
			 int c2 =1;
			 for (int i = 0; i < n; i++) 
			 {
				 double x ;
				 double y ;
				 if(i%2==0)
		            {
					  x = lista.get(i)*Math.sin(c1*alfa);
					  y = lista.get(i)*Math.cos(c1*alfa);
					  c1++;
					  //System.out.println("pares "+ x+" "+y);
		               p1.add(new puntos(x,y));
		            }
		            else{
		            	x = lista.get(i)*Math.sin(c2*(-alfa));
		            	y = lista.get(i)*Math.cos(c2*(-alfa));
		            	c2++;
		            	p2.add(new puntos(x,y));
		            	//System.out.println("impares "+x+" "+y);
		            }
			}
			 for(int i = 0; i < p1.size(); i++){
				 p2.add(p1.get(p1.size() - 1 - i));
			 }
			 p2.add(p2.get(0));
			 System.out.printf("%.3f\n",area(p2));
		}
			
		}
	
}
